def call() {
    sh 'trivy image prasad440/youtube:latest > trivyimage.txt'
}
