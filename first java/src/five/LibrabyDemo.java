package five;


// throw & throws
class Library{
    int availableBooks = 3;

    public void borrowBook(int booksRequestedCount) throws Exception {

        if(booksRequestedCount> availableBooks)
            throw new Exception("Not enough book");


    }

//    public void borrowBook(int bookRequested) {
//        try{
//            int[] books = {101,102,103};
//            System.out.println("Book requested "+books[bookRequested]);
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception occured");
//        }catch (NullPointerException e){
//            System.out.println("Null pointer exception");
//        }finally {
//            System.out.println("finally block");
//        }
//    }

//    public void borrowBook(int booksRequestedCount) {
//        try{
//            if(booksRequestedCount> availableBooks)
//                throw new Exception("Not enough book");
//
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception occured");
//        }catch (Exception e){
//            System.out.println("exception");
//        }finally {
//            System.out.println("finally block");
//        }
//    }
}

public class LibrabyDemo {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        library.borrowBook(10);
    }

}
