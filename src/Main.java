import modelos.BookList;

public class Main {
    public static void main(String[] args) {
        BookList list = new BookList(5);

        list.addLast(20);
        list.addFirst(10);
        list.addLast(30);

        list.insertAt(1, 15);

        System.out.println("ID no indice 2: " + list.get(2));
        System.out.println("Removido do inicio: " + list.removeFirst());
        System.out.println("Total de itens: " + list.count());

        int pos = list.find(30);
        System.out.println("Posicao do ID 30: " + pos);
    }
}