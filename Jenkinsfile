pipeline {
    agent any

    tools {
        jdk 'JDK 17'
        maven 'Maven 3.8.6'
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone repository from Git
                git 'https://github.com/mathicarranzagithub/SeleniumAutomation.git'
            }
        }

        stage('Build') {
            steps {
                // Execute build with Maven
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Execute tests with Maven
                bat 'mvn test'
            }
        }
    }
    
    post {
        always {
            //Publish HTML report of Selenium
            publishHTML(target: [
                reportDir: 'path/to/html-report',
                reportFiles: 'index.html',
                reportName: 'Selenium HTML Report'
            ])
            // Clean up after execution
            cleanWs()
        }
    }
}
