pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
                bat '''
                    echo "Buils starting..."'
                    CD quickstart
                    mvn clean install verify
                '''
            }
        }
    }
  
}
