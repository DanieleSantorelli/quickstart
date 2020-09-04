pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
                dir("quickstart") {
                    sh "pwd"
                }
                bat 'mvn clean install verify'
            }
        }
    }
  
}
