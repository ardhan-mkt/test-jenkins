
pipeline {
  agent any
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
        echo GIT_COMMIT
      }
    }
    stage('building') {
      steps {
        sh "echo 'building'"
        //build job: "cupu.groovy", parameters: [PERSON]
      }
    }
    stage('post') {
      steps {
        sh "echo 'post'"
      }
    }
  }
}
