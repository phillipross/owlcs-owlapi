package org.obolibrary.oboformat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.semanticweb.owlapi.util.OWLAPIStreamUtils.asUnorderedSet;
import static org.semanticweb.owlapi.vocab.OWL2Datatype.XSD_STRING;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.apitest.TestFiles;
import org.semanticweb.owlapi.formats.OBODocumentFormat;
import org.semanticweb.owlapi.model.MissingImportHandlingStrategy;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationSubject;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyLoaderConfiguration;

class LoadAnonymousTestCase extends TestBase {

    private static final OWLLiteral LIT_UNIT = literal("unit.ontology");

    private static OWLLiteral literal(String litvalue) {
        return Literal(litvalue, XSD_STRING);
    }

    private static OWLAnnotationAssertionAxiom comment(OWLAnnotationSubject subj,
        OWLAnnotationValue value) {
        return AnnotationAssertion(RDFSComment(), subj, value);
    }

    private static OWLAnnotationAssertionAxiom label(OWLAnnotationSubject subj,
        OWLAnnotationValue value) {
        return AnnotationAssertion(RDFSLabel(), subj, value);
    }

    @Test
    void shouldLoad() {
        OWLOntologyLoaderConfiguration loaderConfig = new OWLOntologyLoaderConfiguration()
            .setMissingImportHandlingStrategy(MissingImportHandlingStrategy.SILENT);
        OWLOntology ontology =
            loadFrom(TestFiles.loadOboAnonymous, new OBODocumentFormat(), loaderConfig);
        Set<OWLAxiom> expected = set(OWLAxiom.class, Declaration(date),
            Declaration(autogeneratedby), Declaration(hasDbXref), Declaration(defaultnamespace),
            Declaration(subsetProperty), Declaration(hasOBOFormatVersion), Declaration(iao0000115),
            Declaration(namespaceIdRule), Declaration(createdBy), Declaration(inSubset),
            Declaration(savedby), Declaration(pato0001708), Declaration(uo0),
            Declaration(RDFSComment()), Declaration(RDFSLabel()), Declaration(hasOBONamespace),
            Declaration(uo1), Declaration(id), SubAnnotationPropertyOf(mpathSlim, subsetProperty),
            AnnotationAssertion(hasOBONamespace, uo1.getIRI(), LIT_UNIT),
            comment(attributeSlim.getIRI(), literal("Attribute slim")),
            label(iao0000115.getIRI(), literal("definition")),
            AnnotationAssertion(hasOBONamespace, uo0.getIRI(), LIT_UNIT),
            SubAnnotationPropertyOf(unitSlim, subsetProperty),
            comment(valueSlim.getIRI(), literal("Value slim")),
            SubAnnotationPropertyOf(absentSlim, subsetProperty),
            SubAnnotationPropertyOf(abnormalSlim, subsetProperty),
            label(uo1.getIRI(), literal("length unit")),
            label(hasOBOFormatVersion.getIRI(), literal("has_obo_format_version")),
            label(namespaceIdRule.getIRI(), literal("namespace-id-rule")),
            SubClassOf(uo1, ObjectSomeValuesFrom(isUnitOf, pato0001708)),
            SubAnnotationPropertyOf(cellQuality, subsetProperty),
            comment(relationalSlim.getIRI(), literal(
                "Relational slim: types of quality that require an additional entity in order to exist")),
            SubAnnotationPropertyOf(prefixSlim, subsetProperty),
            SubAnnotationPropertyOf(scalarSlim, subsetProperty),
            comment(scalarSlim.getIRI(), literal("Scalar slim")),
            comment(abnormalSlim.getIRI(), literal("Abnormal/normal slim")),
            SubAnnotationPropertyOf(attributeSlim, subsetProperty),
            label(uo0.getIRI(), literal("unit")),
            SubAnnotationPropertyOf(dispositionSlim, subsetProperty),
            comment(unitSlim.getIRI(), literal("unit slim")),
            SubAnnotationPropertyOf(relationalSlim, subsetProperty),
            AnnotationAssertion(id, uo1.getIRI(), literal("UO:0000001")),
            comment(mpathSlim.getIRI(), literal("Pathology slim")),
            AnnotationAssertion(createdBy, uo1.getIRI(), literal("george gkoutos")),
            label(hasDbXref.getIRI(), literal("database_cross_reference")), SubClassOf(uo1, uo0),
            label(hasOBONamespace.getIRI(), literal("has_obo_namespace")),
            AnnotationAssertion(id, uo0.getIRI(), literal("UO:0000000")),
            AnnotationAssertion(createdBy, uo0.getIRI(), literal("george gkoutos")),
            comment(prefixSlim.getIRI(), literal("prefix slim")),
            comment(cellQuality.getIRI(), literal("cell_quality")),
            comment(absentSlim.getIRI(), literal("Absent/present slim")),
            label(subsetProperty.getIRI(), literal("subset_property")),
            SubAnnotationPropertyOf(unitGroupSlim, subsetProperty),
            comment(unitGroupSlim.getIRI(), literal("unit group slim")),
            comment(dispositionSlim.getIRI(), literal("Disposition slim")),
            label(inSubset.getIRI(), literal("in_subset")),
            SubAnnotationPropertyOf(valueSlim, subsetProperty),
            AnnotationAssertion(inSubset, uo1.getIRI(), unitGroupSlim.getIRI()),
            AnnotationAssertion(Annotation(hasDbXref, literal), iao0000115, uo0.getIRI(),
                literal("A unit of measurement is a standardized quantity of a physical quality.")),
            AnnotationAssertion(Annotation(hasDbXref, literal), iao0000115, uo1.getIRI(),
                literal("A unit which is a standard measure of the distance between two points.")));
        assertEquals(expected, asUnorderedSet(ontology.axioms()));
    }
}
