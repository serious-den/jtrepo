pipeline {
    agent any
    stages {
        stage('Non-Parallel Stage') {
            steps {
                echo 'This stage will be executed first.'
            }
        }
        stage('Parallel Stage') {
            def mvnHome
            boolean skipBuild
            when {
                branch 'ver-1.2'
            }
            failFast true
            parallel {
                stage('Branch A') {
                    agent {
                        label "master"
                    }
                    steps {
                        echo "On Branch A"
                    }
                }
                stage('Branch B') {
                    agent {
                        label "slave1"
                    }
                    steps {
                        echo "On Branch B"
                    }
                }
            }
        }
    }
}