pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Récupérer le code depuis le référentiel Git
                git 'https://github.com/NejibBriki/project_Automation.git'
            }
        }
        stage('Build') {
            steps {
                // Compiler le projet Maven
               sh  'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Exécuter des tests Maven
               sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Déployer l'application (si nécessaire)
                // Exemple : déployer un artefact sur un serveur
            }
            
            
        }
    }
}
