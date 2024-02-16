public class BookArray{
    private Book[] books;
    private int size;
    private int maxSize;

    public BookArray() {
        this.maxSize = 2;
        this.size = 0;
        this.books = new Book[maxSize];
    }

    public void listAdd(Book p) {
        if(size >= maxSize) {
            resize();
        }

        books[size] = p;
        size++;
    }

    public void listRemove(int pos) {
        // check that pos is a valid index
        if(pos >= size || pos < 0 || isEmpty()) {
            return;
        }

        // Shift everything left at and after the pos
        // if the size is 1 this will be skipped
        for(int i = pos; i < (size-1); i++) {
            books[i] = books[i + 1];
        }

        size--;
    }

    @Override
    public String toString() {
        String bookString= "";
        for(int i = 0; i < size; i++) {
            bookString = bookString + books[i].toString() + "\n";
        }
        return bookString;
    }

    // Some helper functions
    public boolean isEmpty() {
        if(size <= 0) {
            return true;
        } else {
            return false;
        }
    }

    private void resize() {
        // make array twice as large
        maxSize *= 2;
        Book[] newBooks = new Book[maxSize];
        for(int i = 0; i < size; i++) {
            newBooks[i] = books[i];
        }
        books = newBooks;
    }
}