public class SLNode {
    private Book data;
    private SLNode next;

    public SLNode(Book p) {
        this.data = p;
        this.next = null;
    }

    public Book getData() {
        return this.data;
    }

    public void setData(Book data) {
        this.data = data;
    }

    public SLNode getNext() {
        return this.next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }


}
