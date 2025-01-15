package intensiv.i11;

import java.util.Objects;

public class MyLinkedList<T> {

    private ListItem<T> head;

    public MyLinkedList() {
        head = null;
    }

    /**
     * Adds one element to the list.
     * The element will be inserted in front of the current head.
     *
     * @param key the element to be added to this list
     */
    public void add(T key) {
        // TODO I11 b)
    }

    public boolean contains(T key) {
        // TODO I11 c)
    }

    public T get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }

        // TODO I11 d)
    }

    public ListItem<T> getHead() {
        return head;
    }

}
