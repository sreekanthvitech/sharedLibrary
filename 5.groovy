pipeline {
    agent {label 'worker1'}

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
