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
        birthdate blank: false
        fname size: 1..40
        lname size: 1..40

    }
}
