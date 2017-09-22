package pg

class MessagesController {

//    def index() { }
    def show() {
//        def newMessage
//        if(params.author && params.message) {
//            newMessage = new Message(timePosted: new Date(), author: params.author, msg: params.message).save()
//        }
        [messages: Message.list()]
    }
    def add() {
        
    }
    def addmessage() {
        if(params.author && params.message) {
            def newMessage = new Message(timePosted: new Date(), author: params.author, msg: params.message).save()
        }
        redirect(action: "show", controller: "messages", params: [messages: Message.list()])
    }
}
