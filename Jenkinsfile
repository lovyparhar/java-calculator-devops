pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    environment {
        repositoryName = "lovyparhar/java-calculator-devops",
        tag = "1.0",
        image = ""
    }
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
        stage('Docker image creation') {
            steps {
                script{
                    image = docker.build(repositoryName + ":" + tag)
                }
            }
        }
        stage('Dockerhub image push') {
            script{
                // By default, the registry will be dockerhub
                docker.withRegistry('', 'dockerhub-credentials'){
                    image.push()
                }
            }
        }
    }
}