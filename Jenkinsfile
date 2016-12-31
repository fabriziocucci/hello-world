node {
	checkout scm
    stage('Build') {
        gradle clean shadowJar
        archiveArtifacts artifacts: 'build/libs/hello-world-all.jar', fingerprint: true
    }
}