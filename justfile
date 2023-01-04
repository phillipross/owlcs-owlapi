#!/usr/bin/env just --justfile
## Licensed under the terms of http://www.apache.org/licenses/LICENSE-2.0

# NOTE: The just recipes defined below assume sdkman is installed and used for java and maven selection.
#       Recipes that utilize docker containers assume the existence of the specific docker image existing locally

export JAVA_VER_DISTRO_11 := "11.0.18-zulu"
export JAVA_VER_DISTRO_17 := "17.0.6-zulu"
export JAVA_VER_DISTRO_20 := "20-zulu"

default:
  @echo "Invoke just --list to see a list of possible recipes to run"

clean: clean-17


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

clean-install: clean-install-17


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

verify: verify-17


verify-11:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_11}
  mvn verify

verify-17:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_17}
  mvn verify

verify-20:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_20}
  mvn verify

dependencies:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_11}
  mvn dependency:tree -Dscope=compile | tee dependencies.txt

updates:
  #!/usr/bin/env bash -l
  sdk use java ${JAVA_VER_DISTRO_11}
  mvn versions:display-dependency-updates | tee updates.txt
