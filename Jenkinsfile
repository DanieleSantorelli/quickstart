pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
                dir("quickstart") {
                    bat "pwd"
                }
                bat 'mvn clean install verify'
            }
        }
    }
  
}
