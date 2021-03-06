# You must define the global variables $TOPCAT_PATH and $BACKEND_ROOT_PATH
BACKEND_ROOT_PATH="/home/bananee/Documents/UNQ/2014s2/DESAPP/Entorno/desapp.workspace/DesarrolloDeAplicaciones-GrupoB/desapp-grupob-backend"
TOMCAT_PATH="/home/bananee/Documents/UNQ/2014s2/Herramientas/apache-tomcat-7.0.56"


# stop tomcat
cd $TOMCAT_PATH
cd bin
./catalina.sh stop
cd ../webapps

# remove old files
rm -f -r backend_api/
rm -f backend_api.war

# make the .war and copy in tomcat
cd $BACKEND_ROOT_PATH
mvn clean install
cd target
mv desapp-grupob-backend-1.0-SNAPSHOT.war backend_api.war
cp backend_api.war $TOMCAT_PATH/webapps

# start tomcat
cd $TOMCAT_PATH
cd bin
./catalina.sh start

echo "### DEPLOY FINISH  ###"
