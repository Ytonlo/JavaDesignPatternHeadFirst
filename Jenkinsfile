node{
  stage ('Build') {

	sh "echo git checkout "
	
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'GitRemote', url: 'git@github.com:Ytonlo/JavaDesignPatternHeadFirst.git']]])

  }
  
  sh "echo ${tool 'Maven'}"
}
