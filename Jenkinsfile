@Library('CommonLib') _
node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      checkout scm
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // **       in the global configuration.
      mvnHome = tool 'M3'
      def var1 = org.dmar.libs.CommonLib.getClassName()
      echo "lib saw ${var1}"
      def obj1 = new org.dmar.libs.CommonLib()
      def obj2 = new org.dmar.libs.CommonLib()
      obj2.someVar = 'AnotherText'

      echo "obj1 saw ${obj1.someVar}"
      echo "obj1 saw ${obj2.someVar}"



   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh "'${mvnHome}/bin/mvn' -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}