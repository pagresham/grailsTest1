package pg

class Message {
    String author
    String msg
    Date timePosted
    static constraints = {
        author size: 1..25, blank: false
        msg size: 1..255
    }
}
