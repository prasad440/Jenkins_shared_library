def call() {
    withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: '') {
        sh "/usr/local/bin/kubectl apply -f deployment.yml"
    }
}
