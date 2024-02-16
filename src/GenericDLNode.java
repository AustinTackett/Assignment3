public class GenericDLNode <T> {
    private T data;
    private GenericDLNode<T> next;
    private GenericDLNode<T> previous;

    public GenericDLNode(T object) {
        this.data = object;
        this.next = null;
        this.previous = null;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericDLNode<T> getNext() {
        return this.next;
    }

    public GenericDLNode<T> getPrevious() {
        return previous;
    }

    public void setNext(GenericDLNode<T> next) {
        this.next = next;
    }

    public void setPrevious(GenericDLNode<T> previous) {
        this.previous = previous;
    }
}