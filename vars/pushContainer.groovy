def call() {
sh 'docker push ${IMAGE_NAME}:latest'
}
