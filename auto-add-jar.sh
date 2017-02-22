#!/usr/bin/env bash
mvn install:install-file -Dfile=zdal-datasource/lib/ojdbc6.jar -DgroupId=com.oracle \
    -DartifactId=ojdbc6 -Dversion=11.2.0.3.0 -Dpackaging=jar -DgeneratePom=true