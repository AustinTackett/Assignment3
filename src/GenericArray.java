import java.lang.reflect.Array;
public class GenericArray<T> {
    private T[] dataArr;
    private int size;
    private int maxSize;

    public GenericArray() {
        this.maxSize = 5;
        this.size = 0;

        // https://www.baeldung.com/java-generic-array
        this.dataArr = (T[])new Object[maxSize];
    }

    public void listAdd(T object) {
        if(size >= maxSize) {
            resize();
        }

        dataArr[size] = object;
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
            dataArr[i] = dataArr[i + 1];
        }

        size--;
    }

    @Override
    public String toString() {
        String objectString= "";
        for(int i = 0; i < size; i++) {
            objectString = objectString + dataArr[i].toString() + "\n";
        }
        return objectString;
    }

    // Some helper functions
    public boolean isEmpty() {
        return size <= 0;
    }

    private void resize() {
        // make array twice as large
        maxSize *= 2;
        T[] newArr = (T[])new Object[maxSize];
        for(int i = 0; i < size; i++) {
            newArr[i] = dataArr[i];
        }
        dataArr = newArr;
    }

}