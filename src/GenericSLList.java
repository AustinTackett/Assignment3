public class GenericSLList<T> {
    private GenericSLNode<T> head;
    private int size;

    public GenericSLList() {
        this.head = null;
        this.size = 0;
    }

    public void listAdd(T object) {
        GenericSLNode<T> newNode = new GenericSLNode<>(object);

        if(head == null) {
            head = newNode;
        } else {
            GenericSLNode<T> currentNode = head;
            while(currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
        size++;
    }

    public void listRemove(int pos) {
        // if the pos is not valid do not need remove anything
        if(pos >= 0 && pos < size) {

            // Go to node at index pos
            GenericSLNode<T> nextNode = head;
            GenericSLNode<T> previousNode = null;
            for(int i = 0; i < (pos) && nextNode != null; i++) {
                previousNode = nextNode;
                nextNode = nextNode.getNext();
            }


            // some cases to check to avoid calling functions from a null value
            if(previousNode == null) {
                // if at pos the element is the head
                head = nextNode.getNext();
            } else if(nextNode.getNext() != null && previousNode != null) {
                // if there is another element after the pos and pos is not the head
                previousNode.setNext(nextNode.getNext());
            } else {
                // if the element at pos is the last element
                previousNode.setNext(null);
            }

            size--;
        }
    }

    @Override
    public String toString() {
        String bookListString = "";
        GenericSLNode<T> currentNode = head;

        while(currentNode != null) {
            bookListString = bookListString + currentNode.getData().toString() + "\n";
            currentNode = currentNode.getNext();
        }
        return bookListString;
    }
}