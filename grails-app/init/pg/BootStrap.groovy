package pg

//import pg.Message

class BootStrap {

    def init = { servletContext ->
        def now = new Date()
        // Messages
        def defMsg1 = new Message(timePosted: now, author: "Pierce Gresham", msg: "This is the first default message").save()
        def defMsg2 = new Message(timePosted: now, author: "Robin Gresham", msg: "This is the second default message").save()

        // Users
        def date1 = Date.parse("yyyy-MM-dd", "1974-03-07")
        def user1 = new User(fname: "Pierce", lname: "Gresham", birthdate: date1).save()

        def date2 = Date.parse("yyyy-MM-dd", "1977-05-05")
        def user2 = new User(fname: "Robin", lname: "Gresham", birthdate: date2).save()

        def date3 = Date.parse("yyyy-MM-dd", "2009-08-08")
        def user3 = new User(fname: "Phoebe", lname: "Gresham", birthdate: date3).save()

        def date4 = Date.parse("yyyy-MM-dd", "2012-06-01")
        def user4 = new User(fname: "sage", lname: "Gresham", birthdate: date4).save()

        def date5 = Date.parse("yyyy-MM-dd", "1984-03-11")
        def user5 = new User(fname: "Amanda", lname: "Marie", birthdate: date5).save()

        def date6 = Date.parse("yyyy-MM-dd", "1945-10-21")
        def user6 = new User(fname: "Madeline", lname: "Haisten", birthdate: date6).save()

        def date7 = Date.parse("yyyy-MM-dd", "1956-07-07")
        def user7 = new User(fname: "Thomas", lname: "Pierce", birthdate: date7).save()

        def date8 = Date.parse("yyyy-MM-dd", "2000-07-02")
        def user8 = new User(fname: "Jimmy", lname: "Martin", birthdate: date8).save()

        // Loans
        def loanDate1 = Date.parse("yyyy-MM-dd", "2000-03-02")


        def loan1 = new Loan(lenderName: "USAA", loanNumber: 1, balance: 100, loanType: "Federal", user: user1).save()
        def loan2 = new Loan(lenderName: "Bank of the West", loanNumber: 2, balance: 1200, loanType: "Private", user: user1).save()
        def loan3 = new Loan(lenderName: "Key Bank", loanNumber: 3, balance: 1400, loanType: "Private", user: user3).save()
        def loan4 = new Loan(lenderName: "Bank of the West", loanNumber: 4, balance: 1700, loanType: "Private", user: user4).save()
        def loan5 = new Loan(lenderName: "USAA", loanNumber: 5, balance: 800, loanType: "Federal", user: user5).save()
        def loan6 = new Loan(lenderName: "Bank of the West", loanNumber: 6, balance: 1200, loanType: "Private", user: user6).save()
        def loan7 = new Loan(lenderName: "Key Bank", loanNumber: 7, balance: 10000, loanType: "Federal", user: user7).save()
        def loan8 = new Loan(lenderName: "Bank of the West", loanNumber: 8, balance: 2200, loanType: "Private", user: user8).save()
        def loan9 = new Loan(lenderName: "USAA", loanNumber: 9, balance: 2100, loanType: "Federal", user: user1).save()
        def loan10 = new Loan(lenderName: "Key Bank", loanNumber: 10, balance: 1700, loanType: "Private", user: user2).save()
        def loan11 = new Loan(lenderName: "Mother", loanNumber: 8675309, balance: 7200, loanType: "Personal", user: user1).save()

    }    
    def destroy = {
    }
}
