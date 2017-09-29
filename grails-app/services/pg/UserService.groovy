package pg

import grails.validation.ValidationException
import grails.gorm.transactions.Transactional
import groovy.json.JsonSlurper
import org.apache.commons.logging.LogFactory


@Transactional
class UserService {


    def addUser(fname, lname, bdayString) {

        def bd = Date.parse("yyyy-MM-dd",  bdayString ?: "0000-00-00")
        def newUser = new User(fname: fname, lname: lname, birthdate: bd)

        if(!newUser.validate()) {
            throw new ValidationException("User is not valid", newUser.errors)
        }
        else { newUser.save() }
        println "New User Saved!"
    }




    def getAllLoans() {
        Loan.list() as Loan[]
    }

    def findjson() {
        def sampleJson = '{"person": {"name": "json", "age": "43"}}'
        def jsonSlurper = new JsonSlurper()
        // Returns an obj representation of the json text //
        return jsonSlurper.parseText(sampleJson)
    }

    List<User> findUserByLetter(letter){
        def upLetter = letter.toUpperCase()
        def lowLetter = letter.toLowerCase()
        User.findAll("from User as u where u.fname like ? or u.fname like ?", [upLetter + '%', lowLetter + '%'])
    }

    List<User> findUserByID(userID) {
        User.findAll("from User as u where u.id = ?", [ Long.parseLong(userID)])
    }


//    private static final log = LogFactory.getLog(this)
    def index() {
        log.error("In index method")
    }


}
