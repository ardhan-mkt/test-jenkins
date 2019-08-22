def githubStatus() {
     githubNotify account: 'ardhan-mkt', credentialsId: '	ff062375-d54c-4302-98b9-f7ee8a64f46d', 
         description: 'Build pending', repo: 'klikdokter', 
         status: 'pending'
}

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
