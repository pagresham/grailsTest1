package pg

class Loan {
    String lenderName
    Integer balance
    String loanType
    Integer loanNumber

    static belongsTo = [user: User]

    static constraints = {
        loanType inList: ["Federal", "Private", "Personal"], blank: false
        loanNumber min: 0, unique: ['lenderName'], blank: false
        balance min: 0, blank: false
        lenderName size: 1..30, blank: false
    }
}
