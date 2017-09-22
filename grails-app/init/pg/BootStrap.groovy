package pg

//import pg.Message

class BootStrap {

    def init = { servletContext ->
        def now = new Date()
        def defMsg1 = new Message(timePosted: now, author: "Pierce Gresham", msg: "This is the first default message").save()
        def defMsg2 = new Message(timePosted: now, author: "Robin Gresham", msg: "This is the second default message").save()
    
    }    
    def destroy = {
    }
}
