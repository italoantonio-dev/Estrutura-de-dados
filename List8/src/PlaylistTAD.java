public interface PlaylistTAD {
    void addFirst(int musicaId);
    void addLast(int musicaId);
    void insertAt(int i, int musicaId);
    int removeFirst();
    int removeLast();
    boolean remove(int musicaId);
    int removeAt(int i);
    int get(int i);
    void set(int i, int musicaId);
    int find(int musicaId);
    boolean isEmpty();
    boolean isFull();
}