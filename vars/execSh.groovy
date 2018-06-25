def call(def cmd = 'whoami') {
    def out
    try {
        out = sh(script: 'pwd', returnStdout: true)
        out2 = sh(script: cmd, returnStdout: true)

        println out
        println
        println out2
    } catch (Exception ex) {
        echo "Unexpected exception during instantiation of template manager: ${ex.message}"
        println "[JENKINS][ERROR] Trace: ${ex.getStackTrace().collect { it.toString() }.join('\n')}"
        return
    }
}