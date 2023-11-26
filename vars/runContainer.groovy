def call(){
    sh "docker run -d --name youtube1 -p 3000:3000 prasad440/youtube:latest"
}
