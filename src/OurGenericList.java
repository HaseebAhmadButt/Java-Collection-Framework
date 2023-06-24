import java.util.Iterator;
/*
This class OurGenericList represents a generic list that can hold elements of any type.
It implements the Iterable interface to allow iterating over the elements in the list.

The class has the following components:
    items: An array that stores the elements of the list.
    size: The current size of the list.
    Constructor: Initializes the list with a default size of 100.
    add method: Adds an item to the list at the next available index.
    getItemAtIndex method: Retrieves an item from the list at the specified index.
    iterator method: Returns an iterator object to iterate over the elements in the list.
    OurGenericListIterator class: An inner class that implements the Iterator interface. It allows iterating over the elements in the list.
    list: The OurGenericList instance to iterate over.
    index: The current index in the iteration.
    hasNext method: Checks if there is a next element in the iteration.
    next method: Returns the next element in the iteration.
    By using this OurGenericList class, a student can create a list of any type and perform operations such as adding items,
    retrieving items by index, and iterating over the elements.
 */
public class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    /**
     * Constructor for OurGenericList class.
     * Initializes the list with a default size of 100.
     */
    public OurGenericList() {
        size = 0;
        // Casting is applied on the array of Object to make it an array of generic data type entered by the user
        items = (T[]) new Object[100];
    }

    /**
     * Adds an item to the list.
     * @param item The item to be added.
     */
    public void add(T item) {
        items[size++] = item;
    }

    /**
     * Retrieves an item from the list at the specified index.
     * @param index The index of the item to retrieve.
     * @return The item at the specified index.
     */
    public T getItemAtIndex(int index) {
        return items[index];
    }

    /**
     * Returns an iterator over the elements in the list.
     * @return An iterator for the list.
     */
    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    /**
     * Iterator class for OurGenericList.
     * Iterates over the elements in the list.
     */
    private class OurGenericListIterator implements Iterator<T> {
        private OurGenericList<T> list;
        private int index = 0;

        /**
         * Constructor for OurGenericListIterator class.
         * @param list The list to iterate over.
         */
        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        /**
         * Checks if there is a next element in the iteration.
         * @return true if there is a next element, false otherwise.
         */
        @Override
        public boolean hasNext() {
            System.out.println("Has Next Called");
            return index < list.size;
        }

        /**
         * Returns the next element in the iteration.
         * @return The next element.
         */
        @Override
        public T next() {
            System.out.println("Next Called");
            return list.items[index++];
        }
    }
}
