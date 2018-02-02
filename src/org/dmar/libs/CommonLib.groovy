package org.dmar.libs

class CommonLib {

    def someVar = 'newerMind'

    static String getClassName() {
        "SomeText"
    }

    static void buildProject(Object obj) {
        println "build module $obj"
    }
}
