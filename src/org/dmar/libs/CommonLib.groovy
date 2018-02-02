package org.dmar.libs

class CommonLib {

    def someVar = 'newerMind'

    static String getClassName() {
        "SomeText"
    }

    static void buildProject() {
        stage('Build') {
            // Run the maven build
            if (isUnix()) {
                sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
            } else {
                bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
            }
        }
    }

}
