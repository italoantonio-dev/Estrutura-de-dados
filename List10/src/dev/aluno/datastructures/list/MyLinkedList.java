package dev.aluno.datastructures.list;

import java.util.NoSuchElementException;


public class MyLinkedList<T> implements MyList<T> {


    public static class Node<T> {

        private T data;

        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }


        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{data=" + data + "}";
        }
    }

    private Node<T> head;

    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index " + index + " out of bounds for size " + size);
        }
    }

    private void checkIndexForInsert(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Index " + index + " out of bounds for insert with size " + size);
        }
    }

    private void checkNotEmpty() {
        if (size == 0) {
            throw new NoSuchElementException("The list is empty.");
        }
    }


    private Node<T> nodeAt(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }


    @Override
    public void addFirst(T element) {
        head = new Node<>(element, head);
        size++;
    }

    @Override
    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public void insertAt(int index, T element) {
        checkIndexForInsert(index);
        if (index == 0) {
            addFirst(element);
            return;
        }
        Node<T> prev = nodeAt(index - 1);
        Node<T> newNode = new Node<>(element, prev.getNext());
        prev.setNext(newNode);
        size++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addSorted(T element) {
        Comparable<T> comp = (Comparable<T>) element;


        if (head == null || comp.compareTo(head.getData()) <= 0) {
            addFirst(element);
            return;
        }

        Node<T> current = head;
        while (current.getNext() != null
                && comp.compareTo(current.getNext().getData()) > 0) {
            current = current.getNext();
        }

        Node<T> newNode = new Node<>(element, current.getNext());
        current.setNext(newNode);
        size++;
    }

    @Override
    public T removeFirst() {
        checkNotEmpty();
        T data = head.getData();
        head = head.getNext();
        size--;
        return data;
    }

    @Override
    public T removeLast() {
        checkNotEmpty();
        if (size == 1) {
            return removeFirst();
        }
        Node<T> prev = nodeAt(size - 2);
        T data = prev.getNext().getData();
        prev.setNext(null);
        size--;
        return data;
    }

    @Override
    public T removeAt(int index) {
        checkIndex(index);
        if (index == 0) {
            return removeFirst();
        }
        Node<T> prev = nodeAt(index - 1);
        Node<T> target = prev.getNext();
        prev.setNext(target.getNext());
        size--;
        return target.getData();
    }

    @Override
    public boolean remove(T element) {
        if (head == null) return false;

        if (head.getData().equals(element)) {
            removeFirst();
            return true;
        }

        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().equals(element)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int find(T element) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(element)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return nodeAt(index).getData();
    }

    @Override
    public void set(int index, T element) {
        checkIndex(index);
        nodeAt(index).setData(element);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) sb.append(" -> ");
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
