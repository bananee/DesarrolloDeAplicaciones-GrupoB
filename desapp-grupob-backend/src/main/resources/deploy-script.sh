#!/bin/bash
#You must define the global variables $TOPCAT_PATH and $BACKEND_ROOT_PATH
TOMCAT_PATH=/home/bananee/Documents/UNQ/2014s2/Herramientas/apache-tomcat-7.0.56
BACKEND_ROOT_PATH=/home/bananee/Documents/UNQ/2014s2/DESAPP/Entorno/desapp.workspace/DesarrolloDeAplicaciones-GrupoB/desapp-grupob-backend/
#para seguirlo despues http://www.muylinux.com/2010/02/09/como-escribir-un-pequeno-script-bash

# stop tomcat
cd $TOMCAT_PATH
cd bin
./catalina.sh stop
cd ../webapps

# remove old files
rm -f -r backend/
rm -f backend.war

# make the .war and copy in tomcat
cd $BACKEND_ROOT_PATH
mvn clean install
cd target
mv desapp-grupob-backend-1.0-SNAPSHOT.war backend.war
cp backend.war $TOMCAT_PATH/webapps

# start tomcat
cd $TOMCAT_PATH
cd bin
./catalina.sh start

echo "### DEPLOY FINISHED ###"