public class Main {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist(5);

        System.out.println("--- Adicionando Musicas ---");
        playlist.addLast(101);
        playlist.addLast(102);
        playlist.addFirst(100);
        playlist.insertAt(2, 105);

        System.out.println("Musica no indice 0: " + playlist.get(0));
        System.out.println("Indice da musica 102: " + playlist.find(102));

        System.out.println("\n--- Testando Remocoes ---");
        System.out.println("Removida do inicio: " + playlist.removeFirst());
        playlist.remove(105);

        System.out.println("\n--- Estado Final ---");
        System.out.println("Playlist vazia? " + playlist.isEmpty());
        System.out.println("Playlist cheia? " + playlist.isFull());
    }
}