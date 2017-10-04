package pg

import grails.validation.ValidationException

class UserController {

    def userService

    def login() {
        if(params.userLogin) {
            println "your loggedin"
        }
        [users: User.list()]
    }
    def logMe() {
        if(params.userLogin) {
            def newlyLoggedUser = User.get(params.userLogin)
            session.setAttribute("user", newlyLoggedUser)
            session.setAttribute("userId", params.userLogin )
            println "Now loggged in as " + newlyLoggedUser.fname
            redirect(action: 'login')

        } else {
            redirect(action: 'login')
        }

    }
    def logout() {
        session.invalidate()
        redirect(action: "login" )
//        [users: User.list()]
    }

    def index() {
        redirect action: "show"
    }
    def show() {

        def searchedList
        def allUsers = User.list()
        // Check if letter search field is set
        if(params.letter) {
            searchedList = userService.findUserByLetter(params.letter)
            render(view:"show", model: [users: searchedList,
                                        allUsers: allUsers,
                                        selLetter: params.letter,
                                        selID: "0"])
        }

        else if(params.userID){
            searchedList = userService.findUserByID(params.userID)
            render(view: "show", model: [users: searchedList,
                                         allUsers: allUsers,
                                         selID: params.userID])
        }

        else {
            render(view: "show", model: [users: allUsers,
                                         allUsers: allUsers,
                                         selID: "0"])
        }

    }

    def showloans() {
        render(view: "showloans", model: [loans: Loan.list()] )
    }

    def adduser() {
    }




    def addnewuser() {
        println getParams()

        try {

            userService.addUser(params.fname, params.lname, params.birthday)
            log.error("INFO This is a success Message " + new Date())



            redirect(action: "show")
        }
        catch (ValidationException e) {
            log.error "Error: ${e.message}"
            println "One of the fields was not true"
            println e
            // Not sure if this is the best way to do this //
            redirect(action: "adduser", params: [error_message: "All fields are required"])
        }
    }

    // Tester Method
    def seelist() {
        try {
            def loanList = userService.getAllLoans()
            render(loanList[0].user.fname)

        }
        catch (ValidationException e) {
            println e
        }
    }

    // Tester Method
    def seejson() {
        def jsonObj = userService.findjson()
        render(jsonObj.person.name)
    }

    // Tester Method
    def findexample() {
        def searchedList = userService.findUserByLetter("Ph")
        render(searchedList)
    }








    def show_user_loans() {
        println "show_users-loans ID ${params.id}"
        def userid = params.id as Integer
        def username = User.get(userid).fname + " " + User.get(userid).lname
        def loans = Loan.findAllWhere(user: User.get(userid))
        render(view: "show_user_loans", model: [userid: userid, username: username, loans: loans])

    }

    def addloan() {

        def id = params.id as Integer
        println "ID ==== " + id
        def user = User.get(id)
        [user: user, id: id]
    }

    def add_user_loan() {
        println "ADD_USER_LOAN PARAMS" + getParams()

            def l = new Loan(
                    lenderName: params.lenderName,
                    balance: params.balance,
                    loanType: params.loanType,
                    loanNumber: params.loanNumber,
                    user: User.get(params.id as Integer))
            if(l.validate()) {
                println "TRUEEEEEEEEE"
                l.save()
            }
            else {
                println "FALSEEEEEEEEEE"
                l.errors.allErrors.each {println it; println ""}
                redirect(action: "addloan", params: [id: params.id, error_message: "New Loan not created."])
                return
            }

        redirect(action: "show_user_loans", params: [id: params.id])
    }

}
