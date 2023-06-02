#!/usr/bin/env just --justfile
## Licensed under the terms of http://www.apache.org/licenses/LICENSE-2.0

# NOTE: The just recipes defined below assume sdkman is installed and used for java and maven selection.
#       Recipes that utilize docker containers assume the existence of the specific docker image existing locally

export JAVA_VER_DISTRO_8 := "8.0.372-zulu"
export JAVA_VER_DISTRO_11 := "11.0.19-zulu"
export JAVA_VER_DISTRO_17 := "17.0.7-zulu"
export JAVA_VER_DISTRO_20 := "20.0.1-zulu"

default:
  @echo "Invoke just --list to see a list of possible recipes to run"

clean: clean-8

clean-8:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_8}
  mvn clean

clean-11:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_11}
  mvn clean

clean-17:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_17}
  mvn clean

clean-20:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_20}
  mvn clean

clean-install: clean-install-8

clean-install-8: clean-8
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_8}
  mvn -Djavadoc.path="$(which javadoc)" install

clean-install-11: clean-11
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_11}
  mvn install

clean-install-17: clean-17
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_17}
  mvn install

clean-install-20: clean-20
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_20}
  mvn install

verify: verify-8

verify-8:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_8}
  mvn -pl !:owlapi-osgidistribution -Djavadoc.path="$(which javadoc)" verify

verify-11:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_11}
  mvn -pl !:owlapi-osgidistribution verify

verify-17:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_17}
  mvn -pl !:owlapi-osgidistribution verify

verify-20:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_20}
  mvn -pl !:owlapi-osgidistribution verify

dependencies:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_11}
  mvn dependency:tree -Dscope=compile | tee dependencies.txt

updates:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_11}
  mvn versions:display-dependency-updates | tee updates.txt
