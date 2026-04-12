public class MusicPlaylist implements PlaylistTAD {

    private int[] musicas;
    private int count;

    public MusicPlaylist(int capacidade) {
        this.musicas = new int[capacidade];
        this.count = 0;
    }

    @Override
    public void addFirst(int musicaId) {
        if (isFull()) throw new RuntimeException("Playlist cheia");
        for (int i = count; i > 0; i--) {
            musicas[i] = musicas[i - 1];
        }
        musicas[0] = musicaId;
        count++;
    }

    @Override
    public void addLast(int musicaId) {
        if (isFull()) throw new RuntimeException("Playlist cheia");
        musicas[count] = musicaId;
        count++;
    }

    @Override
    public void insertAt(int i, int musicaId) {
        if (isFull()) throw new RuntimeException("Playlist cheia");
        if (i < 0 || i > count) throw new IndexOutOfBoundsException("Posicao invalida");
        for (int j = count; j > i; j--) {
            musicas[j] = musicas[j - 1];
        }
        musicas[i] = musicaId;
        count++;
    }

    @Override
    public int removeFirst() {
        if (isEmpty()) throw new RuntimeException("Playlist vazia");
        int removido = musicas[0];
        for (int i = 0; i < count - 1; i++) {
            musicas[i] = musicas[i + 1];
        }
        count--;
        return removido;
    }

    @Override
    public int removeLast() {
        if (isEmpty()) throw new RuntimeException("Playlist vazia");
        int removido = musicas[count - 1];
        count--;
        return removido;
    }

    @Override
    public boolean remove(int musicaId) {
        int k = 0;
        while (k < count && musicas[k] != musicaId) {
            k++;
        }
        if (k < count) {
            removeAt(k);
            return true;
        }
        return false;
    }

    @Override
    public int removeAt(int i) {
        if (i < 0 || i >= count) throw new IndexOutOfBoundsException("Posicao invalida");
        int removido = musicas[i];
        for (int j = i; j < count - 1; j++) {
            musicas[j] = musicas[j + 1];
        }
        count--;
        return removido;
    }

    @Override
    public int get(int i) {
        if (i < 0 || i >= count) throw new IndexOutOfBoundsException("Posicao invalida");
        return musicas[i];
    }

    @Override
    public void set(int i, int musicaId) {
        if (i < 0 || i >= count) throw new IndexOutOfBoundsException("Posicao invalida");
        musicas[i] = musicaId;
    }

    @Override
    public int find(int musicaId) {
        for (int i = 0; i < count; i++) {
            if (musicas[i] == musicaId) return i;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return count == musicas.length;
    }
}