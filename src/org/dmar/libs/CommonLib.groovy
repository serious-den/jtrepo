package org.dmar.libs

class CommonLib {

    def someVar = 'newerMind'
    static def params = [:]
    static def skipBuild
    static def skipBuild2

    static String getClassName() {
        "SomeText"
    }

    static void buildProject(Object obj) {
        println "build module $obj"
    }

    static void main(String[] args) {
        params.skipBuild = false
        skipBuild = params.skipBuild as boolean
        skipBuild2 = "false".toBoolean()
        new Boolean('false')
        println(skipBuild)
        println(skipBuild2)
        asBoolean()

        assert "y".toBoolean()
        assert 'TRUE'.toBoolean()
        assert '  trUe  '.toBoolean()
        assert " y".toBoolean()
        assert "1".toBoolean()

        assert ! 'other'.toBoolean()
        assert ! '0'.toBoolean()
        assert ! 'no'.toBoolean()
        assert ! '  FalSe'.toBoolean()
        assert ! 'false'.toBoolean()
        assert ! "false".toBoolean()
    }
}
