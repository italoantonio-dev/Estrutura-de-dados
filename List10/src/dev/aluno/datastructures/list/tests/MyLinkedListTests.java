package dev.aluno.datastructures.list.tests;

import dev.aluno.datastructures.list.MyLinkedList;

public class MyLinkedListTests {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   TESTE");
        System.out.println("========================================\n");

        testAddFirstAndAddLast();
        testInsertAt();
        testAddSorted();
        testRemoveFirst();
        testRemoveLast();
        testRemoveAt();
        testRemoveByValue();
        testFindAndGet();
        testSet();
        testSizeAndClear();

        System.out.println("========================================");
        System.out.println("   Teste Completo");
        System.out.println("========================================");
    }

    private static void testAddFirstAndAddLast() {
        section("addFirst / addLast");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addLast(2);
        list.addLast(3);
        list.addFirst(1);
        list.addFirst(0);

        expect("[0 -> 1 -> 2 -> 3]", list.toString());
        expect("4", String.valueOf(list.size()));
    }

    private static void testInsertAt() {
        section("insertAt");
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addLast("A");
        list.addLast("C");
        list.addLast("D");

        list.insertAt(1, "B");
        list.insertAt(0, "START");
        list.insertAt(list.size(), "END");


        expect("[START -> A -> B -> C -> D -> END]", list.toString());

        try {
            list.insertAt(-1, "X");
            System.out.println("  FAIL – expected IndexOutOfBoundsException for index -1");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  PASS – IndexOutOfBoundsException caught for index -1");
        }
    }

    private static void testAddSorted() {
        section("addSorted");
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addSorted(5);
        list.addSorted(1);
        list.addSorted(3);
        list.addSorted(7);
        list.addSorted(2);

        expect("[1 -> 2 -> 3 -> 5 -> 7]", list.toString());
    }

    private static void testRemoveFirst() {
        section("removeFirst");
        MyLinkedList<Integer> list = buildList(10, 20, 30);

        int removed = list.removeFirst();
        expect("10", String.valueOf(removed));
        expect("[20 -> 30]", list.toString());

        list.removeFirst();
        list.removeFirst();
        try {
            list.removeFirst();
            System.out.println("  FAIL – expected NoSuchElementException on empty list");
        } catch (java.util.NoSuchElementException e) {
            System.out.println("  PASS – NoSuchElementException caught for empty list");
        }
    }

    private static void testRemoveLast() {
        section("removeLast");
        MyLinkedList<Integer> list = buildList(10, 20, 30);

        int removed = list.removeLast();
        expect("30", String.valueOf(removed));
        expect("[10 -> 20]", list.toString());
    }

    private static void testRemoveAt() {
        section("removeAt");
        MyLinkedList<Integer> list = buildList(10, 20, 30, 40, 50);

        int removed = list.removeAt(2);
        expect("30", String.valueOf(removed));
        expect("[10 -> 20 -> 40 -> 50]", list.toString());

        list.removeAt(0);
        expect("[20 -> 40 -> 50]", list.toString());

        list.removeAt(list.size() - 1);
        expect("[20 -> 40]", list.toString());

        try {
            list.removeAt(99);
            System.out.println("  FAIL – expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  PASS – IndexOutOfBoundsException caught for index 99");
        }
    }

    private static void testRemoveByValue() {
        section("remove(element)");
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addLast("cat");
        list.addLast("dog");
        list.addLast("bird");

        boolean found = list.remove("dog");
        expect("true", String.valueOf(found));
        expect("[cat -> bird]", list.toString());

        boolean notFound = list.remove("fish");
        expect("false", String.valueOf(notFound));
    }

    private static void testFindAndGet() {
        section("find / get");
        MyLinkedList<Integer> list = buildList(10, 20, 30, 40);

        expect("0",  String.valueOf(list.find(10)));
        expect("2",  String.valueOf(list.find(30)));
        expect("-1", String.valueOf(list.find(99)));

        expect("10", String.valueOf(list.get(0)));
        expect("40", String.valueOf(list.get(3)));

        try {
            list.get(10);
            System.out.println("  FAIL – expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("  PASS – IndexOutOfBoundsException caught for get(10)");
        }
    }

    private static void testSet() {
        section("set");
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addLast("alpha");
        list.addLast("beta");
        list.addLast("gamma");

        list.set(1, "BETA");
        expect("[alpha -> BETA -> gamma]", list.toString());
    }

    private static void testSizeAndClear() {
        section("size / clear");
        MyLinkedList<Integer> list = buildList(1, 2, 3, 4, 5);

        expect("5", String.valueOf(list.size()));
        list.clear();
        expect("0", String.valueOf(list.size()));
        expect("[]", list.toString());
    }

    @SafeVarargs
    private static <T> MyLinkedList<T> buildList(T... values) {
        MyLinkedList<T> list = new MyLinkedList<>();
        for (T v : values) list.addLast(v);
        return list;
    }

    private static void section(String name) {
        System.out.println("--- " + name + " ---");
    }

    private static void expect(String expected, String actual) {
        boolean ok = expected.equals(actual);
        System.out.printf("  %s  expected: %-30s  got: %s%n",
                ok ? "PASS" : "FAIL", expected, actual);
    }
}
