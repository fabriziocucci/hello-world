node {
	checkout scm
    stage('Build') {
        sh './gradlew clean shadowJar'
        archiveArtifacts artifacts: 'build/libs/hello-world-all.jar', fingerprint: true
    }
}