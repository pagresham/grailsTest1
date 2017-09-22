package pg

class ExampleController {
    
    def index() {
        
        // resopnd provides many option to respond with HTML, XML, and JSON
        // Command used to call this from the command line:
        // Pass the accept header to indicate the type of reply we want
        // $ curl http://localhost:8080/example/index -H "Accept: application/json"
        def myMap = [name: "Oliver", id: 123]
        respond myMap
//        render(myMap)
    }
    
    def hello() {
        // Watch out Elvis!
        // either plug in params.name OR if null, use 'world'
        // this looks for an argument with a key of 'name' in the params list
        def myMap = [greeting: "Hello ${params.name ?: 'world'}"]

        
        params.each{ k, v -> println "key= ${k} : value= ${v}"}
        
        // respond()  will send the output so it could be captured as api data
        
        [params: params]
        
    }
    
    // Other 'null-safe' helper methods to easily get at the incoming data
    

    def exampleForm() {
        [msg: params.msg]
    }
    
    
}
