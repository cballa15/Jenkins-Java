pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '2', artifactNumToKeepStr: '1'))
    }

    stages {
        stage('Unit Tests') {
            steps{
                sh 'ant -f tests.xml -v'
                junit 'reports/result.xml'
            }
        }
        stage('Build') {
            steps {
                sh 'ant -f build.xml -v'
            }
        }
        stage('Deploy') {
            steps{
                sh 'scp dist/rectangle_${env.BUILD_NUMBER}.jar root@tweakydragon051.mylabserver.com:/web/all'
            }
        }

    }


    post {
        always {
        archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
        }
    }
}