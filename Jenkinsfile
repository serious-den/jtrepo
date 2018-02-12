#!/usr/bin/env groovy

node {
    def labels = ['master', 'slave1', 'slave2', 'slave3', 'slave4', 'slave5']
    // labels for Jenkins node types we will build on
    def builders = [:]
    for (x in labels) {
        stage("parallel $x") {
            def label = x // Need to bind the label variable before the closure - can't do 'for (label in labels)'

            // Create a map to pass in to the 'parallel' step so we can fire all the builds at once
            builders[label] = {
                node(label) {
                    echo "hello from lablel $label"
                    for (int i = 0; i < 1000000; i++) {
                        if (i % 100000 == 2) {
                            echo i.toString()
                        }
                    }
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