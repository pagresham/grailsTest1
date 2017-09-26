package pg

import grails.validation.ValidationException
import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    def addUser(String fname, String lname, String bdayString) {
        // Get bday as a Date
        def bd = Date.parse("yyyy-MM-dd",  bdayString)
        def newUser = new User(fname: fname, lname: lname, birthdate: bd).save()


        if(!newUser.validate()) {
            throw new ValidationException("User is not valid", newUser.errors)

        }
        println "New User Saved!"
    }
}
