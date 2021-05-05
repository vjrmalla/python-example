pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'echo hello'
                
            }
        stage('deploy') {
            steps{
                sh 'docker build -t jenkins:jcasc .'
            }
        }
        }
    }
}