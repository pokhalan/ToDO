package toDoApp2

class Tasks {
    String content
    Date dateCreated
    Date dateModified
    static constraints = {
        dateCreated nullable: true
        dateModified nullable: true
    }
}
