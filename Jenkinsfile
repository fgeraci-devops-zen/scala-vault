pipeline {
    agent any 

    stages {
        stage('Retrive Secrets from Vault') { 
            steps { 
                // let's test this out
                sh 'export DBUSER=$(curl -H "X-Vault-Token: 4f7ad37d-4215-849d-cebb-d50bec7f4818" -X GET  http://34.253.133.88:8200/v1/secret/dbaccess | jq -r .data.user)'
                sh 'echo $DBUSER'
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