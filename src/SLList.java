public class SLList {
    private SLNode head;
    private int size;

    public SLList() {
        this.head = null;
        this.size = 0;
    }

    public void listAdd(Book p) {
        SLNode newNode = new SLNode(p);

        if(head == null) {
            head = newNode;
        } else {
            SLNode currentNode = head;
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
            SLNode nextNode = head;
            SLNode previousNode = null;
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
        SLNode currentNode = head;

        while(currentNode != null) {
            bookListString = bookListString + currentNode.getData().toString() + "\n";
            currentNode = currentNode.getNext();
        }
        return bookListString;
    }
}