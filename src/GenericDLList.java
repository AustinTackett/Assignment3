public class GenericDLList <T> {
    private GenericDLNode<T> head;
    private int size;

    public GenericDLList() {
        this.head = null;
        this.size = 0;
    }

    public void listAdd(T object) {
        GenericDLNode<T> newNode = new GenericDLNode<>(object);

        if(head == null) {
            head = newNode;
        } else {
            GenericDLNode<T> currentNode = head;
            while(currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            newNode.setPrevious(currentNode);
        }
        size++;
    }

    public void listRemove(int pos) {
        // if the pos is not valid do not need remove anything
        if(pos >= 0 && pos < size) {

            // Go to node at index pos
            GenericDLNode<T> nextNode = head;
            for(int i = 0; i < (pos) && nextNode != null; i++) {
                nextNode = nextNode.getNext();
            }

            // some cases to check to avoid calling functions from a null value
            if(nextNode.getPrevious() == null) {
                // if at pos the element is the head
                head = nextNode.getNext();
                if(head != null) {
                    // if list is not empty now set the previous node to null
                    head.setPrevious(null);
                }
            } else if(nextNode.getNext() != null && nextNode.getPrevious() != null) {
                // if there is another element after the pos and pos is not the head
                GenericDLNode<T> nodeBefore = nextNode.getPrevious();
                GenericDLNode<T> nodeAfter = nextNode.getNext();
                nodeBefore.setNext(nodeAfter);
                nodeAfter.setPrevious(nodeBefore);
            } else {
                // if the element at pos is the last element
                nextNode.getPrevious().setNext(null);
            }

            size--;
        }
    }

    @Override
    public String toString() {
        String bookListString = "";
        GenericDLNode<T> currentNode = head;

        while(currentNode != null) {
            bookListString = bookListString + currentNode.getData().toString() + "\n";
            currentNode = currentNode.getNext();
        }
        return bookListString;
    }
}