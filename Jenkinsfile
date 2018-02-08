node {
    def labels = ['master', 'slave1', 'master', 'slave1', 'master', 'slave1', 'master', 'slave1']
    // labels for Jenkins node types we will build on
    def builders = [:]
    for (x in labels) {
        stage("parallel $x") {
            def label = x // Need to bind the label variable before the closure - can't do 'for (label in labels)'

            // Create a map to pass in to the 'parallel' step so we can fire all the builds at once
            builders[label] = {
                node(label) {
                    echo "hello from lablel $label"
                    sh 'pwd'
                }
            }
        }
    }
/*
    for (int i = 0; i < 10; i++) {
        stage("expance node [master]") {
            builders[labels[0]] = {
                node(labels[0]) {
                    echo 'hello from master'
                    sh 'pwd'
                }
            }
        }
    }*/

    parallel builders
}