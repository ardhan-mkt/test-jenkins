pipeline {
  agent { label 'master' }
  stages {
    stage('Parameters') {
      steps {
        script {
          PERSON = [$class: 'StringParameterValue', name: 'person', value: 'Mr. Jenkins Dong']
        }
      }
    }
    stage('preparation') {
      steps {
        echo "hello ${PERSON}"
      }
    }
    stage('building') {
      steps {
        sh "echo 'building'"
        build job: "cupu", parameters: [PERSON]
      }
    }
    stage('post') {
      steps {
        sh "echo 'post'"
      }
    }
  }
}
