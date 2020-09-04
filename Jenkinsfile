pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
                cd quickstart
                bat 'mvn clean install verify'
            }
        }
    }
  
}
