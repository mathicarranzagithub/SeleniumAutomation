pipeline {
    agent any

    tools {
        jdk 'JDK 17'
        maven 'Maven 3.9.8'
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
                dir('SeleniumAutomation')
                bat 'mvn test'
            }
        }
    }
    
    post {
        always {
            // Clean up after execution
            cleanWs()
        }
    }
}
