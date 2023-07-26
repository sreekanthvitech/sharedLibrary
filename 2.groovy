pipeline{
 //agent any
 agent{
    label  'worker1'
 }
 stages{
     stage ("Git SCM"){
        steps{
        echo "checkout the GIT"
        }
     }
     stage ("Maven "){
        steps{
        echo "Maven Build"
        }
     }
     stage ("Nexus "){
        steps{
        echo "Build Artificat"
        }
     }
     stage ("Deploy "){
        steps{
        echo "Deploy Artificat tomcat"
        }
     }
     stage ("Image "){
        steps{
        echo "Build Image Artificat "
        }
     }
 }
 }


