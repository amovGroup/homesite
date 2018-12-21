#!/bin/sh
echo "********************************************************"
echo "Starting homesite-service "
echo "********************************************************"
java -jar /server/@project.build.finalName@.jar
