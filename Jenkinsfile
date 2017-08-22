pipeline {
    agent any 

    stages {
        stage('Retrive Secrets from Vault') { 
            steps { 
                sh 'export DBUSER=$(vault read -field=user secret/dbaccess)'
                sh 'echo $DBUSER"'
            }
        }
        stage('Test'){
            steps {
                sh 'echo "hello world"'
            }
        }
        stage('Build') {
            steps {
                sh 'echo "hello world"'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "hello world"'
       
            }
        }
    }
}