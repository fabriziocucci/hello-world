node {
	checkout scm
    stage('Build') {
        sh 'gradle clean shadowJar'
        archiveArtifacts artifacts: 'build/libs/hello-world-all.jar', fingerprint: true
    }
}