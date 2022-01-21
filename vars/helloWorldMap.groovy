def call(Map config[:]) {
    sh "echo ${config.name}: today is ${config.day}."
}
