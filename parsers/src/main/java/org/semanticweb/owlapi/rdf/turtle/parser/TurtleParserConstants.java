/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
/* Generated By:JavaCC: Do not edit this line. TurtleParserConstants.java */
package org.semanticweb.owlapi.rdf.turtle.parser;

/**
 * Token literal values and constants. Generated by
 * org.javacc.parser.OtherFilesGen#start()
 */
public interface TurtleParserConstants {

    /** End of File. */
    int EOF = 0;
    /** RegularExpression Id. */
    int COMMENT = 5;
    /** RegularExpression Id. */
    int STRING_START = 6;
    /** RegularExpression Id. */
    int ANY_ESCAPED_CHAR = 7;
    /** RegularExpression Id. */
    int ANY_CHAR = 8;
    /** RegularExpression Id. */
    int STRING = 9;
    /** RegularExpression Id. */
    int THREEQUOTES = 10;
    /** RegularExpression Id. */
    int ANY_ESCAPED_CHAR_IN_LONG_STRING = 12;
    /** RegularExpression Id. */
    int LONG_STRING = 13;
    /** RegularExpression Id. */
    int DIGIT = 14;
    /** RegularExpression Id. */
    int INTEGER = 15;
    /** RegularExpression Id. */
    int DOUBLE = 16;
    /** RegularExpression Id. */
    int DECIMAL = 17;
    /** RegularExpression Id. */
    int EXPONENT = 18;
    /** RegularExpression Id. */
    int OPENPAR = 19;
    /** RegularExpression Id. */
    int CLOSEPAR = 20;
    /** RegularExpression Id. */
    int OPEN_SQUARE_BRACKET = 21;
    /** RegularExpression Id. */
    int CLOSE_SQUARE_BRACKET = 22;
    /** RegularExpression Id. */
    int COMMA = 23;
    /** RegularExpression Id. */
    int DOT = 24;
    /** RegularExpression Id. */
    int SEMICOLON = 25;
    /** RegularExpression Id. */
    int PREFIX = 26;
    /** RegularExpression Id. */
    int DOUBLE_CARET = 27;
    /** RegularExpression Id. */
    int BASE = 28;
    /** RegularExpression Id. */
    int AT = 29;
    /** RegularExpression Id. */
    int A = 30;
    /** RegularExpression Id. */
    int EMPTY_BLANK_NODE = 31;
    /** RegularExpression Id. */
    int NODE_ID_START = 32;
    /** RegularExpression Id. */
    int TRUE = 33;
    /** RegularExpression Id. */
    int FALSE = 34;
    /** RegularExpression Id. */
    int SELECT = 35;
    /** RegularExpression Id. */
    int WHERE = 36;
    /** RegularExpression Id. */
    int FILTER = 37;
    /** RegularExpression Id. */
    int LETTER = 38;
    /** RegularExpression Id. */
    int FULLIRI = 39;
    /** RegularExpression Id. */
    int PNAME_NS = 40;
    /** RegularExpression Id. */
    int PN_LOCAL = 41;
    /** RegularExpression Id. */
    int PNAME_LN = 42;
    /** RegularExpression Id. */
    int PN_PREFIX = 43;
    /** RegularExpression Id. */
    int PN_CHARS_BASE = 44;
    /** RegularExpression Id. */
    int PN_CHARS = 45;
    /** RegularExpression Id. */
    int PN_CHARS_U = 46;
    /** RegularExpression Id. */
    int NODEID = 47;
    /** RegularExpression Id. */
    int ERROR = 48;
    /** Lexical state. */
    int DEFAULT = 0;
    /** Lexical state. */
    int IN_STRING = 1;
    /** Lexical state. */
    int IN_LONG_STRING = 2;
    /** Literal token values. */
    String[] tokenImage = { "<EOF>", "\" \"", "\"\\n\"", "\"\\t\"", "\"\\r\"",
            "<COMMENT>", "\"\\\"\"", "<ANY_ESCAPED_CHAR>", "<ANY_CHAR>",
            "\"\\\"\"", "<THREEQUOTES>", "<token of kind 11>",
            "<ANY_ESCAPED_CHAR_IN_LONG_STRING>", "<LONG_STRING>", "<DIGIT>",
            "<INTEGER>", "<DOUBLE>", "<DECIMAL>", "<EXPONENT>", "\"(\"",
            "\")\"", "\"[\"", "\"]\"", "\",\"", "\".\"", "\";\"",
            "\"@prefix\"", "\"^^\"", "\"@base\"", "\"@\"", "\"a\"",
            "<EMPTY_BLANK_NODE>", "\"_:\"", "\"true\"", "\"false\"",
            "\"SELECT\"", "\"WHERE\"", "\"FILTER\"", "<LETTER>", "<FULLIRI>",
            "<PNAME_NS>", "<PN_LOCAL>", "<PNAME_LN>", "<PN_PREFIX>",
            "<PN_CHARS_BASE>", "<PN_CHARS>", "<PN_CHARS_U>", "<NODEID>",
            "<ERROR>", };
}
