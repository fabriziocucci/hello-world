node {
	checkout scm
    stage('Build') {
        sh './gradlew clean build shadowJar'
        archiveArtifacts artifacts: 'build/libs/hello-world-all.jar', fingerprint: true
    }
}