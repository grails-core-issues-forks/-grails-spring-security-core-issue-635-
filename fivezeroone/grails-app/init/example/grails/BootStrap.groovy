package example.grails

class BootStrap {

    RoleService roleService
    UserService userService
    def init = { servletContext ->

        userService.save("sherlock", "elementary")
        userService.save("watson", "elementary")

        roleService.save("ROLE_DETECTIVE")
    }

    def destroy = {
    }
}
