package pg

class UserController {
//    def index() { }
    def show() {
        render(view: "show", model: [users: User.list()])
    }

    def showloans() {
        render(view: "showloans", loans: Loan.list() )
    }

    def adduser() {
    }

    def addnewuser() {
        if(params.fname && params.lname && params.birthday) {
            println params.birthday
            println params.birthday.getClass()
//            def newUser = new User(fname: params.fname, lname: params.lname, birthdate: params.birthday)
        }
        println params.birthday
        println params.birthday.getClass()
        redirect(action: "show", controller: "user")

    }


}
