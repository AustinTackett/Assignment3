public class GenericSLNode<T> {
    private T data;
    private GenericSLNode<T> next;

    public GenericSLNode(T object) {
        this.data = object;
        this.next = null;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T object) {
        this.data = object;
    }

    public GenericSLNode<T> getNext() {
        return this.next;
    }

    public void setNext(GenericSLNode<T> next) {
        this.next = next;
    }


}
