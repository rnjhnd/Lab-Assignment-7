public class Book implements LibraryResources {

    @Override
    public void borrow(String title) {
        System.out.println("Borrowing book: " + title);
    }
}