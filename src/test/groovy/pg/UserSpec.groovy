package pg

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class UserSpec extends Specification implements DomainUnitTest<User> {

    def u1, u2, u3, u4
    def setup() {



        def bd = Date.parse("yyyy-MM-dd", "1974-03-07")

        u1 = new User(fname: "pierce", lname: "gresham", birthdate: bd)
        u2 = new User(fname: "", lname: "gresham", birthdate: bd)
        u3 = new User(fname: "pierce", lname: "", birthdate: bd)
        u4 = new User(fname: "p", lname: "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", birthdate: new Date() - 1)

    }

    def cleanup() {
    }

    void "test something"() {
        expect:"User to validate"
            u1.validate()
            !u2.validate()
            !u3.validate()
            u4.validate()
    }
}
