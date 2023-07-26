@Library("sharedLibrary") _
pipeline{
agent any
stages{
 stage("Greeting"){
    greeting("Welcome to Shared Library")
 }
}
}//pipeline