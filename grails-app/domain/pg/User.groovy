package pg

class User {

    String fname
    String lname
    Integer userId
    Date birthdate

    static constraints = {
        userId min: 1
    }
}
