import java.util.Arrays;

public class MyArrayList {
    private int[] data;
    private int size;


    public MyArrayList(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    public void addFirst(int value) {
        ensureCapacity();
        for (int i = size; i > 0; i--) {
            data[i] = data[i - 1];
        }
        data[0] = value;
        size++;
    }

    public void addLast(int value) {
        ensureCapacity();
        data[size++] = value;
    }

    public void insertAt(int index, int value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }


    public void removeFirst() {
        if (size == 0) return;
        for (int i = 0; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void removeLast() {
        if (size == 0) return;
        size--;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void remove(int value) {
        int index = find(value);
        if (index != -1) {
            removeAt(index);
        }
    }


    public int find(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return data[index];
    }


    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        data[index] = value;
    }

    public void display() {
        System.out.print("Lista: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}