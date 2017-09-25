package pg

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class LoanSpec extends Specification implements DomainUnitTest<Loan> {
    def u1, l1, l2, l3, l4, l5, l6, l7

    def setup() {
        // create user for new loan
        u1 = new User(fname: "pierce", lname: "gresham", birthdate: new Date())
        // Create new loan with info and passed user
        l1 = new Loan(lenderName: "USAA", loanNumber: 123, balance: 100, loanType: "Federal", user: u1)
        l2 = new Loan(lenderName: "USAA", loanNumber: 123, balance: -1, loanType: "Federal", user: u1)
        l3 = new Loan(lenderName: "USAA", loanNumber: 123, balance: 100, loanType: "Different", user: u1)
        l4 = new Loan(lenderName: "USAA", loanNumber: -1, balance: 100, loanType: "Federal", user: u1)

    }

    def cleanup() {
       println l1.errors
    }

    void "test something"() {

        expect:"fix me"
            l1.validate()
            !l2.validate()
            !l3.validate()
            !l4.validate()
            l1.loanNumber == 123
    }

}
