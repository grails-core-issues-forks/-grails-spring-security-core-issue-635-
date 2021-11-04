package example.grails

import grails.plugin.springsecurity.annotation.Secured

class SecretController {

    @Secured("ROLE_DETECTIVE")
    def index() {

    }
}