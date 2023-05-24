package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;

    private void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    private boolean isFull() {
        return false;
    }

    private int top() {
        if (isEmpty())
            return -1;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private class Node {

        private int value;
        private Node prev;
        private Node next;

        private Node(int i) {
            value = i;
        }


        private int getValue() {
            return value;
        }


        private Node getPrev() {
            return prev;
        }

        private void setPrev(Node prev) {
            this.prev = prev;
        }

        private Node getNext() {
            return next;
        }

        private void setNext(Node next) {
            this.next = next;
        }
    }
}