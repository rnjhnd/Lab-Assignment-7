public class TestProgram {
    public static void main(String[] args) {
        
        StudentBook stud1 = new StudentBook("123", "Rogers", "Steve", "The Lord of the Rings");
        BookProcess process1 = new BookProcess(stud1, new Book());
        process1.process();

        StudentBook stud2 = new StudentBook("456", "Foster", "Jane", "The Diary of a Young Girl");
        BookProcess process2 = new BookProcess(stud2, new Journal());
        process2.process();
    }
}