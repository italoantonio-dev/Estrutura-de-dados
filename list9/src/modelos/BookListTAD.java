package modelos;

public interface BookListTAD {
    void addFirst(int id);
    void addLast(int id);
    void insertAt(int index, int id);
    int removeFirst();
    int removeLast();
    int removeAt(int index);
    boolean remove(int id);
    int get(int index);
    void set(int index, int id);
    int find(int id);
    boolean isEmpty();
    boolean isFull();
    int count();
}