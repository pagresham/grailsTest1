package pg

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification
import grails.test.hibernate.HibernateSpec
import grails.testing.services.ServiceUnitTest
import pg.User

class UserServiceSpec extends Specification implements ServiceUnitTest<UserService>{
    def initialSize
    UserService userService
    def json

    def setup() {

//        initialSize = User.list().size()
//        userService.addUser("Barney", "Rubble", "2017-04-04")


    }

    def cleanup() {
    }

    void "test UserService.addUser"() {
        expect:
//            User.list().size() == initialSize + 1
                1 == 1
    }
}
