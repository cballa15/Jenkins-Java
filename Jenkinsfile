pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '1'))
    }

    stages {
        stage('Unit Tests') {
            steps{
                sh 'ant -f tests.xml -v'
                junit 'reports/results.xml'
            }
        }
        stage('build') {
            steps {
                sh 'ant -f build.xml -v'
            }
        }

    }


    post {
        always {
        archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
        }
    }
}