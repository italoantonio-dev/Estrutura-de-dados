public class Main {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList(5);

        System.out.println("*** INSERÇÕES ***");
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        list.insertAt(1, 15);
        list.display();

        System.out.println("\n*** REMOÇÕES ***");
        list.removeFirst();
        list.display();
        list.removeLast();
        list.display();
        list.removeAt(0);
        list.display();

        System.out.println("\n*** NOVAS INSERÇÕES ***");
        list.addLast(30);
        list.addLast(40);
        list.display();

        System.out.println("\n*** BUSCA ***");
        System.out.println("Índice do 30: " + list.find(30));
        System.out.println("Elemento na posição 1: " + list.get(1));

        System.out.println("\n*** ATUALIZAÇÃO ***");
        list.set(0, 100);
        list.display();

        System.out.println("\n*** STATUS ***");
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("Está vazia? " + list.isEmpty());
    }
}