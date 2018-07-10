#!/usr/bin/env bash

#$mvn clean package
#$java -jar swingy.jar console
#$java -jar swingy.jar gui

find . -name "*.java" > sources.txt
javac -sourcepath . @sources.txt
java -cp src com. $1
