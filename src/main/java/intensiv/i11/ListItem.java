package intensiv.i11;

import java.util.Objects;

public class ListItem<T> {

    private final T key;

    public ListItem<T> next;

    public ListItem(T key) {
        this(key, null);
    }

    public ListItem(T key, ListItem<T> next) {
        this.key = key;
        this.next = next;
    }

    public T getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        ListItem<?> listItem = (ListItem<?>) o;
        return Objects.equals(key, listItem.key) && Objects.equals(next, listItem.next);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(key);
        result = 31 * result + Objects.hashCode(next);
        return result;
    }

    @Override
    public String toString() {
        return key.toString();
    }
}
