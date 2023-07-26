@Library("sharedLibrary") _

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                 //greeting("Welcome to Shared Library")
            }
        }
    }
}
