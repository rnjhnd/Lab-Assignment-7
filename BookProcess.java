public class BookProcess {
    private StudentBook studentBook;
    private LibraryResources resource;

    public BookProcess(StudentBook studentBook, LibraryResources resource) {
        this.studentBook = studentBook;
        this.resource = resource;
    }

    public void process () {
        resource.borrow(studentBook.getTitle());
    }
}