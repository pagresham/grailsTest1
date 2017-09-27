package pg

class User {

    String fname
    String lname
    Date birthdate

    static hasMany = [loans: Loan]

//    String toString(){
//        "Name: $fname $lname, Birthdate: $birthdate"
//    }

    static constraints = {
        birthdate blank: false, min: new Date().parse("yyyy-MM-dd", "1900-01-01"), max: new Date()
        fname size: 1..40
        lname size: 1..40

    }
}
