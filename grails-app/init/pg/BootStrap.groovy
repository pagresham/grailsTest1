package pg

//import pg.Message

class BootStrap {

    def init = { servletContext ->
        def now = new Date()
        def defMsg1 = new Message(timePosted: now, author: "Pierce Gresham", msg: "This is the first default message").save()
        def defMsg2 = new Message(timePosted: now, author: "Robin Gresham", msg: "This is the second default message").save()
        // New user birthdates
        def date1 = Date.parse("yyyy-MM-dd", "1974-03-07")
        def user1 = new User(fname: "Pierce", lname: "Gresham", userId: 1123, birthdate: date1).save()

        def date2 = Date.parse("yyyy-MM-dd", "1977-05-05")
        def user2 = new User(fname: "Robin", lname: "Gresham", userId: 1124, birthdate: date2).save()

        def date3 = Date.parse("yyyy-MM-dd", "2009-08-08")
        def user3 = new User(fname: "Phoebe", lname: "Gresham", userId: 1125, birthdate: date3).save()

        def date4 = Date.parse("yyyy-MM-dd", "2012-06-01")
        def user4 = new User(fname: "sage", lname: "Gresham", userId: 1126, birthdate: date4).save()

        def loanDate1 = Date.parse("yyyy-MM-dd", "2000-03-02")
        def loan1 = new Loan(loanNumber: 987, lenderName: "USAA", startDate: loanDate1)


        Integer loanNumber
        String lenderName
        Date startDate
        Integer balance
    }    
    def destroy = {
    }
}
