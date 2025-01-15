package intensiv.i11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    void testAddThreeElements() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        assertEquals(new ListItem<>(1, new ListItem<>(2, new ListItem<>(3))), list.getHead());
    }

    @Test
    void testContains() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        assertTrue(list.contains(3));
        assertTrue(list.contains(2));
        assertTrue(list.contains(1));
    }

    @Test
    void testNotContains() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        assertFalse(list.contains(4));
    }

    @Test
    void testGetInBounds() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    void testGetOutOfBounds() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(3);
        list.add(2);
        list.add(1);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(4));
    }

}
