pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                dir("/QR Code Generator") {
                    sh 'mvn clean package' 
                }
            }
        }
    }
}
