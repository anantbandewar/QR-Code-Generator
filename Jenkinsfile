pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                dir("/QR Code Generator") {
                    powershell 'mvn clean package' 
                }
            }
        }
    }
}
