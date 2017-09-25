package pg

class UserController {
//    def index() { }
    def show() {
        render(view: "show", model: [users: User.list()])
    }

    def showloans() {
        render(view: "showloans", model: [loans: Loan.list()] )
    }

    def adduser() {
    }

    def addnewuser() {
        println getParams()

        if(params.fname && params.lname && params.birthday) {
            def bd = Date.parse("yyyy-MM-dd",  params.birthday)
            def newUser = new User(fname: params.fname, lname: params.lname, birthdate: bd)



            if(newUser.validate()) {
                newUser.save()
                println "New User Saved!"
                println newUser.toString()
            }
        } else {
            println "One of the fields was not true"
            // Not sure if this is the best way to do this //
            redirect(action: "adduser", params: [error_message: "All fields are required"])
            return
        }

        redirect(action: "show")

    }

    def show_user_loans() {
        println "show_userz-loans ID " + params.id
        def userid = params.id
        def username = User.get(userid).fname + " " + User.get(userid).lname
        def loans = Loan.findAllWhere(user: User.get(userid))
        render(view: "show_user_loans", model: [userid: userid, username: username, loans: loans])

    }

    def addloan() {

        def id = params.id
        println "ID ==== " + id
        def user = User.get(id)
        [user: user, id: id]
    }

    def add_user_loan() {
        println "ADD_USER_LOAN PARAMS" + getParams()

        redirect(action: "addloan", params: [id: params.id, error_message: "New Loan not created."])

        if(params.lenderName && params.loanType && params.loanNumber && params.balance) {
            def l = new Loan(
                    lenderName: params.lenderName,
                    balance: params.balance,
                    loanType: params.loanType,
                    loanNumber: params.loanNumber,
                    user: User.get(params.id))
            if(l.validate()) {
                println "TRUEEEEEEEEE"
                l.save()
            }
            else {
                println "FALSEEEEEEEEEE"
                l.errors.allErrors.each {println it; println}
                redirect(action: "addloan", params: [id: params.id, error_message: "New Loan not created."])
                return
            }
        }
        redirect(action: "show_user_loans", params: [id: params.id])
    }

}
