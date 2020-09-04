pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
                bat 'cd /quickstart'
                bat 'mvn clean install verify'
            }
        }
    }
  
}
