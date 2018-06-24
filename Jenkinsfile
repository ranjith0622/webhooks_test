pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                 echo "Testing"
                 bat 'call ant test -buildfile buildut.xml'
                        
            }
        }
        stage('Build') {
            steps {
                 echo "Build"
                 bat 'call ant' 
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}