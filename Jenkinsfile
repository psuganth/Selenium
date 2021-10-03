pipeline {
  agent any
  stages {
    stage('Dev Code Pull ') {
      steps {
        echo 'Dev Code Pull '
      }
    }

    stage('Dev Maven Build') {
      steps {
        echo 'Dev Maven Build'
      }
    }

    stage('QA Deploy') {
      steps {
        echo 'QA Deploy'
      }
    }

    stage('QA Tests ') {
      parallel {
        stage('QA Tests ') {
          steps {
            echo 'QA Tests'
          }
        }

        stage('Web (Code Pull, Run tests)') {
          steps {
            echo 'Web (Code Pull, Run tests)'
          }
        }

        stage('API (Code Pull, Run tests)') {
          steps {
            echo 'API (Code Pull, Run tests)'
          }
        }

      }
    }

    stage('QA Certification ') {
      steps {
        input 'Please approve '
      }
    }

    stage('UAT Deploy') {
      steps {
        echo 'UAT Deploy'
      }
    }

    stage('UAT Certification') {
      steps {
        input 'UAT Approval'
      }
    }

    stage('Prod Deploy') {
      steps {
        echo 'Prod Deploy'
      }
    }

  }
}