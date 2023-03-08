import java.util.NoSuchElementException;

/*
 *Grow and shrink automatically
 * Value and address of next node
 * lookup value and index O(n)
 * insertion-Create new node have node point on to it O(1)
 * inserting in the beginning O(1)
 * inserting in the middle O(n) finding node then adding node O(1)
 * deletion-the end traverse to find second last node to unlink the last and have the tail point to the previous one
 * hence O(n)
 * in the middle O(n)
 */
public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        //to keep reference to the next node
        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    //    public int peek() {
//        return first.next.value;
//       return last.value;
    //}
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }

    }

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public void deleteFirst() {
        var second = first.next;
        if (isEmpty()) throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        first.next = null;
        first = second;
    }

    public void deleteLast() {
        var current = first;
        while (current.next != last) {
            current = current.next;
        }


        current.next = null;
        last = current;

    }

    public boolean contains(int item) {
        boolean bool;
        if(indexOf(item)==-1){
            bool = false;
        }
        else{
            bool = true;
        }
        return bool;
    }

    public int indexOf(int item) {
        int index = 0;
        var check = first;
        while (item != check.value) {
            check = check.next;
            index++;
        }
            if (item != check.value) {
                index = -1;
            }
        return index;
    }


    boolean isEmpty() {
        if (first != null) {
            return false;
        } else {
            return true;
        }
    }
}
//addFirst
//addLast
//deleteFirst
//deleteLast
//contains
//indexOf

