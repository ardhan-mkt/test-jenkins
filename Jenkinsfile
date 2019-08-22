pipeline {
  agent { label 'master' }
  parameters {
    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
  }
  stages {
    stage('preparation') {
      steps {
        echo "hello ${params.PERSON}"
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
