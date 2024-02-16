public class DLNode {
    private Book data;
    private DLNode next;
    private DLNode previous;

    public DLNode(Book p) {
        this.data = p;
        this.next = null;
        this.previous = null;
    }

    public Book getData() {
        return this.data;
    }

    public void setData(Book data) {
        this.data = data;
    }

    public DLNode getNext() {
        return this.next;
    }

    public DLNode getPrevious() {
        return previous;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    public void setPrevious(DLNode previous) {
        this.previous = previous;
    }
}