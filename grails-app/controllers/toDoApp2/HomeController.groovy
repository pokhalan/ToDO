package toDoApp2

class HomeController {

    def index() {
        List<Tasks> tasksList = Tasks.list()
        render view: "index", model: [tasksList: tasksList]
    }

    def save(Tasks tasksTaker) {
        tasksTaker.dateCreated=new Date()
        tasksTaker.dateModified=new Date()

        if (tasksTaker.validate()) {
            tasksTaker.save flush: true, failorError: true
            flash.Message = "YO bOB GOT YOUR bACK...eVERYTHIng IS REcORDEd"

        } else {
            flash.Message = "opps something went wrong bob..."

        }
        redirect action: "index"
    }
}