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

}
