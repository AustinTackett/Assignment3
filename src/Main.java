public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Black Clover", "Yuki Tabata", 20.49);
        Book book2 = new Book("Fate Zero", "Gen Urobuchi", 11.99);
        Book book3 = new Book("Frieren", "Kanehito Yamada", 17.99);

        //--------------------------------------------------------------------------------

        DLList bookList = new DLList();
        bookList.listAdd(book1);
        bookList.listAdd(book2);
        bookList.listAdd(book3);

        //bookList.listRemove(0);

        //System.out.print(bookList.toString());

        //--------------------------------------------------------------------------------

        BookArray bookArr = new BookArray();
        bookArr.listAdd(book1);
        bookArr.listAdd(book2);
        bookArr.listAdd(book3);
        bookArr.listRemove(0);

        //System.out.print(bookArr.toString());

        //---------------------------------------------------------------------------------

        GenericArray<Book> genericArray = new GenericArray<>();
        genericArray.listAdd(book1);
        genericArray.listAdd(book2);
        genericArray.listAdd(book3);
        genericArray.listRemove(0);

        //System.out.print(genericArray.toString());

        //---------------------------------------------------------------------------------

        GenericDLList<Book> genericDLList = new GenericDLList<>();
        genericDLList.listAdd(book1);
        genericDLList.listAdd(book2);
        genericDLList.listAdd(book3);
        genericDLList.listRemove(0);

        //System.out.print(genericDLList.toString());

        //---------------------------------------------------------------------------------

        GenericSLList<Book> genericSLList = new GenericSLList<>();
        genericSLList.listAdd(book1);
        genericSLList.listAdd(book2);
        genericSLList.listAdd(book3);
        genericSLList.listRemove(0);

        System.out.print(genericSLList.toString());


    }
}