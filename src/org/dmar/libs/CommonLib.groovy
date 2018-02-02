package org.dmar.libs

class CommonLib {

    def someVar = 'newerMind'

    static String getClassName() {
        "SomeText"
    }

    static void buildProject(String mvnHome) {
        println 'build module'
    }
}
