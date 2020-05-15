  
node{

    try
	{

    stage('github checkout'){

        git url: 'https://github.com/annuvbabu/DevOps.git'
    }

    stage('maven clean up'){

       def mavenHome = tool name: 'maven3', type: 'maven'

       def mavenCMD = "${mavenHome}/bin/mvn"

       sh "${mavenCMD} clean"

    }

    stage('build, test and package'){

       def mavenHome = tool name: 'maven3', type: 'maven'

       def mavenCMD = "${mavenHome}/bin/mvn"

       sh "${mavenCMD} package"

    }


    stage('Sonar check'){


           def mavenHome = tool name: 'maven3', type: 'maven'

           def mavenCMD = "${mavenHome}/bin/mvn"

           sh "${mavenCMD} sonar:sonar"

        }

    
    stage('Docker Image Build'){

       sh 'docker-compose up -d'

    }
    
    stage('Docker image push') {

        withCredentials([usernameColonPassword(credentialsId: 'newdocker', variable: 'dockervariable')]){

            sh "docker login -u annuvbabu -p ${dockervariable}"

        }

        sh 'docker push annuvbabu/devopsbootcamp:latest'

    }
    stage('Pull Image') {

        sh 'docker pull annuvbabu/devopsbootcamp'

    }


    stage('Deploy to Tomcat'){


    sshagent(['tomcatserver']) {


    sh 'scp -o StrictHostKeyChecking=no target/*.war root@devopsi:/opt/tomcat/apache-tomcat-9.0.34/webapps'

    }
      
    }
    
    stage('Container execution') {

        sh 'docker run -d -p 8891:8891 annuvbabu/devopsbootcamp'

    }
   
  }
 catch (e) {

     currentBuild.result = "FAILED"

     triggerEmail()

     throw e

  }
    
}

def triggerEmail() {

  emailext ( 

      body: 'Your build has failed', 

      to : 'annuvbabu@gmail.com', 

      subject: 'Build-Failure'
 
   )

  }
