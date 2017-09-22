package pg

class Loan {
    Integer loanNumber
    String lenderName
    Date startDate
    Integer balance
    String loanType

    static constraints = {
        loanType inList: ["Federal", "Private", "Other"]
        loanNumber min: 0
        balance min: 0
    }
}
