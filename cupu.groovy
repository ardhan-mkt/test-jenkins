pipeline {
  agent { label 'cupu' }

  stages {
    stage('preparation') {
      steps {
        sh "echo 'preparation'"
      }
    }
    stage('building') {
      steps {
        sh "echo 'building'"
      }
    }
    stage('post') {
      steps {
        sh "echo 'post'"
      }
    }
  }
}