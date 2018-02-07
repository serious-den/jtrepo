#!groovy

@Library('CommonLib')
import org.dmar.libs.CommonLib

try {
    agent any
    def mvnHome
    boolean skipBuild

    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    }

    stage('Preparation') {
        mvnHome = tool 'M3'
        properties([
                parameters([
                        booleanParam(defaultValue: false, description: '', name: 'skipBuild'),
                        string(defaultValue: 'hi!', description: '', name: 'newP', trim: false)
                ])
        ])

        skipBuild = params.skipBuild as boolean
        def newP = params.newP

        echo "SkipBuild param = $skipBuild , type = ${skipBuild.class}"
        echo "SkipBuild param = ${params.skipBuild} , type = ${params.skipBuild.class}"
        echo "SkipBuild param = $newP , type = ${newP.class}"

        CommonLib.buildProject(params.skipBuild)
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

        parallel {
            stage('thread 1') {
                agent {
                    label "master"
                }
                steps {
                    echo "On Master"
                }
            }

            stage('thread 2') {
                agent {
                    label "slave1"
                }
                steps {
                    echo "On slave1"
                }
            }
        }

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
        if (!skipBuild) {
            junit '**/target/surefire-reports/TEST-*.xml'
            archive 'target/*.jar'
        }
    }

    stage('Deploy') {
        //TODO
    }
} catch (ignored) {
    print 'some error is occurred'
    //Nothing TODO
}