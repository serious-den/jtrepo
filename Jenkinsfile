@Library('CommonLib')
import org.dmar.libs.CommonLib

node {
    def mvnHome
    boolean skipBuild

    stage('Preparation') {
        mvnHome = tool 'M3'
        properties([parameters([booleanParam(defaultValue: false, description: '', name: 'skipBuild')])])
        skipBuild = "${params.skipBuild}"
        echo "SkipBuild param = $skipBuild , type = $skipBuild.class"
    }

    stage('Some tests') {
        def var1 = CommonLib.getClassName()
        echo "lib saw ${var1}"

        def obj1 = new CommonLib()
        def obj2 = new CommonLib()
        obj2.someVar = 'AnotherText-ver-1.2!!!!'

        echo "obj1 saw ${obj1.someVar}"
        echo "obj1 saw ${obj2.someVar}"

    }

    stage('Checkout Code') {
        checkout scm
    }

    stage('Build') {

        CommonLib.buildProject(mvnHome)
        // Run the maven build
        if (!skipBuild) {
            if (isUnix()) {
                sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
            } else {
                bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
            }
        }
    }

    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archive 'target/*.jar'
    }

    stage('Deploy') {
        //TODO
    }
}