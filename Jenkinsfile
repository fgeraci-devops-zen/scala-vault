pipeline {
    agent any 

    stages {
        stage('Retrive Secrets from Vault') { 
            steps { 
                def secrets = [
                    [$class: 'VaultSecret', path: 'secret/dbaccess', secretValues: [
                    [$class: 'VaultSecretValue', envVar: 'DBUSER', vaultKey: 'user']]]]

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