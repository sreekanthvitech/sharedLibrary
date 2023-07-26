@Library("sharedLibrary") _
pipeline{
agent any
stages{
  stage("Greeting"){
     step{
        greeting("Welcome to Shared Library")
    }
 }
}
}//pipeline