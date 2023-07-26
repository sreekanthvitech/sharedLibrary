pipeline{
    agent any
    options {
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '30', numToKeepStr: '5')
    }
  
    tools{
        maven "mvn_autoinstaller"
    }
    stages{
        
     stage("Git Branch"){
        steps{
            git credentialsId: 'githubvitech', url: 'https://github.com/sreekanthxtglobal/sample-maven.git'
        }
     }
    stage("Maven Build"){
        steps{
          sh  "mvn clean package"
        }
     }
    stage("Nexus Sonar Artifact"){
        steps{
          echo "Nexus Atrifact"
        }
     }
    }
}