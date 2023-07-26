pipeline{
    agent any
    options {
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '30', numToKeepStr: '5')
    }
    parameters {
        choice choices: ['main', 'master', 'dev', 'qa', 'uat'], description: 'BranchName', name: 'BranchName'
    }

    tools{
        maven "mvn_autoinstaller"
    }
    stages{
    stage(" Branch Name"){
        steps{
           echo "Branch name : ${params.BranchName}"
        }
     }
     stage("Git Branch"){
          steps{
            git branch: "${params.BranchName}", credentialsId: 'githubvitech', url: 'https://github.com/sreekanthxtglobal/sample-maven.git'
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