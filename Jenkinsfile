pipeline {
    agent any
    
     environment {
        MAVEN_HOME = 'C:/Users/BRIKINejib/OneDrive - novencia group/Bureau/Formation Procervices/Formation zied hannachi/apache-maven-3.9.6/bin'
    }
    stages {
        stage('Build') { 
            steps {
                bat 'mvn  clean install' 
            }
        }
stage('Cucumber') {
          steps {
            cucumber '**/*.json'
          }
        }
    }
}