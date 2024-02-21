pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                dir("/AB_Github/QR-Code-Generator/QR Code Generator") {
                    powershell 'mvn clean package' 
                }
            }
        }
    }
}
