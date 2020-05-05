FROM tomcat:latest
ADD target/cicd-pipeline-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/ROOT.jar
EXPOSE 8080
CMD ["catalina.sh", "run"]
