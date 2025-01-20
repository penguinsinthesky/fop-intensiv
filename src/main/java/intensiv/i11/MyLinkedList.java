package intensiv.i11;

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
        intensiv.Util.crash();
    }

    public boolean contains(T key) {
        // TODO I11 c)
        return intensiv.Util.crash();
    }

    public boolean containsRecursive(T key) {
        return containsRecursiveHelper(key, head);
    }

    public boolean containsRecursiveHelper(T key, ListItem<T> currentItem) {
        // TODO I11 d)
        return intensiv.Util.crash();
    }

    public T get(int index) {
        if (index < 0 || head == null) {
            throw new IndexOutOfBoundsException(index);
        }

        // TODO I11 e)
        return intensiv.Util.crash();
    }

    public ListItem<T> getHead() {
        return head;
    }

}
