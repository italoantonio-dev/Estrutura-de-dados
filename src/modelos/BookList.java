package modelos;

public class BookList implements BookListTAD {
    private int[] items;
    private int count;

    public BookList(int capacity) {
        this.items = new int[capacity];
        this.count = 0;
    }

    @Override
    public void addLast(int id) {
        if (isFull()) throw new RuntimeException("Lista cheia");
        items[count] = id;
        count++;
    }

    @Override
    public void addFirst(int id) {
        insertAt(0, id);
    }

    @Override
    public void insertAt(int index, int id) {
        if (isFull()) throw new RuntimeException("Lista cheia");
        if (index < 0 || index > count) throw new IndexOutOfBoundsException();

        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = id;
        count++;
    }

    @Override
    public int removeLast() {
        if (isEmpty()) throw new RuntimeException("Lista vazia");
        count--;
        return items[count];
    }

    @Override
    public int removeFirst() {
        return removeAt(0);
    }

    @Override
    public int removeAt(int index) {
        if (isEmpty()) throw new RuntimeException("Lista vazia");
        if (index < 0 || index >= count) throw new IndexOutOfBoundsException();

        int removedItem = items[index];
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
        return removedItem;
    }

    @Override
    public boolean remove(int id) {
        int pos = find(id);
        if (pos != -1) {
            removeAt(pos);
            return true;
        }
        return false;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) throw new IndexOutOfBoundsException();
        return items[index];
    }

    @Override
    public void set(int index, int id) {
        if (index < 0 || index >= count) throw new IndexOutOfBoundsException();
        items[index] = id;
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < count; i++) {
            if (items[i] == id) return i;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() { return count == 0; }

    @Override
    public boolean isFull() { return count == items.length; }

    @Override
    public int count() { return count; }
}