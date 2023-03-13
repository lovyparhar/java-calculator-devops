pipeline {
    agent any
    stages {
        stage('Fetch code from github') {
            steps {
                git branch: 'master',
                url: 'https://github.com/lovyparhar/java-calculator-devops.git',
                credentialsId: 'calculator-cred'
            }

        }
        stage('Maven Building') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }

        }
    }
}