## Zdal
[![Build Status](https://travis-ci.org/yuanwhy/zdal.svg?branch=master)](https://travis-ci.org/yuanwhy/zdal)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

Zdal means Zhifubao Distributed Data Layer, is a middleware for shard databases and tables in Java. It has been used to scale out the data storage for Alibaba 11.11 in 2013. This is a fork from zhanglei/zdal.

## Quick Start


 * git clone the source code and `cd` the project root directory
 * build the project

     > macOS & Linux
     > * sh auto-add-jar.sh
     > * mvn clean install -DskipTests

     > Windows  
     > * mvn install:install-file -Dfile=zdal-datasource/lib/ojdbc6.jar -DgroupId=com.oracle \
             -DartifactId=ojdbc6 -Dversion=11.2.0.3.0 -Dpackaging=jar -DgeneratePom=true
     > * mvn clean install -DskipTests

     Or you can upload zdal-datasource/lib/ojdbc6.jar to your private maven repository directly

## Features

## Changes
   1. support loading config file from classpath
   2. support utf8mb4
   
## Documentation
* [English](https://github.com/yuanwhy/zdal/wiki/Zdal-Tutorial)
* [中文文档](https://github.com/yuanwhy/zdal/wiki/Zdal%E4%B8%AD%E6%96%87%E6%95%99%E7%A8%8B)

## LICENSE

Source code is licensed under the Apache Licence, Version 2.0
(http://www.apache.org/licenses/LICENSE-2.0.html).
