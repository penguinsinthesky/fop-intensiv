package intensiv.i11;

public class MyLinkedList<T> {

    private ListItem<T> head;

    /**
     * Create a new, empty linked list
     */
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

    /**
     * Returns true if this list contains at least one item with the given key.
     *
     * @param key the key
     * @return whether this key is contained in the list
     */
    public boolean contains(T key) {
        // TODO I11 c)
        return intensiv.Util.crash();
    }

    /**
     * Returns true if this list contains at least one item with the given key.
     *
     * @param key the key
     * @return whether this key is contained in the list
     */
    public boolean containsRecursive(T key) {
        return containsRecursiveHelper(key, head);
    }

    public boolean containsRecursiveHelper(T key, ListItem<T> currentItem) {
        // TODO I11 d)
        return intensiv.Util.crash();
    }

    /**
     * Returns the key stored in the item at the given index.
     *
     * @param index the index the key should be retrieved from
     * @return the key at the given index
     * @throws IndexOutOfBoundsException if index is negative or greater than the list's size
     */
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
