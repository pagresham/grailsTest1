package pg

class ExtrasController {

    UserService userService

    def index() { }

    def db_fun() {
        def message = "default message from db_fun"
        if(params.addStatusMessage) {
            message = params.addStatusMessage
        }

        def goodThings = userService.returnNames()
        def things = []

        for(i in goodThings) {
            things << i
            println "Id: ${i.good_things_id}  Name: ${i.name}"
        }
        [things: things, addStatusMessage: message]
    }

    def add_thing() {
        def addStatusMessage = "default status message"
        if(params.name) {
            userService.addThing(params.name)
            redirect(action: "db_fun", params: [addStatusMessage: "Created new thing!"])
        } else {
            redirect(action: "db_fun", params: [addStatusMessage: "Unable to create new thing"])
        }
    }

    def remove_thing() {
        if (params.id) {
            userService.remove_thing(Integer.parseInt(params.id))
            redirect(action: "db_fun", params: [addStatusMessage: "Deleted thing!"])
        } else {
            redirect(action: "db_fun", params: [addStatusMessage: "Unable to delete thing!"])
        }


    }

}
