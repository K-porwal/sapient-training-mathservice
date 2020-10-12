pipeline {
    agent any

    tools {
        maven 'Maven-3.6.3'
    }

    environment {
        JAR_FILENAME = "hello-jenkins"
        JAR_VERSION = "1.0-SNAPSHOT"
        
    }

    stages {
        stage("Test") {
            steps {
                sh "mvn clean test"
            }
        }

        stage("Build") {
            steps {
                sh "mvn package -DskipTests"
            }
        }

        stage("Execute Main class") {
            steps {
                sh "java -cp target/${JAR_FILENAME}-${JAR_VERSION}.jar com.sapient.service.MathRunner"
            }
        }
    }
    post {
        always {
            echo "This will always be executed"
        }
        success {
            echo "This will be executed only when all stages succeed"
            junit '**/*xml'
            archiveArtifacts artifacts: "target/${JAR_FILENAME}-${JAR_VERSION}.jar", followSymlinks: false
            deleteDir()
        }
        failure {
            echo "This will be executed whenever any stage fails"
            mail to: 'k.porwal1@gmail.com',
                subject: 'Failed stage in Pipeline ${currentBuild.fullDisplayName}',
                body: 'Something went wrong during build.'
        }
    }
}