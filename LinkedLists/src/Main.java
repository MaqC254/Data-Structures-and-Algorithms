/*
 LinkedList list = new LinkedList();
 list.add(1);
 list.addLast(4);
 list.addFirst(3);
 list.add(12);
 list.removeLast();
 list.remove(1);
 list.contains(4);
 var arr = list.toArray();
 System.out.println(list.size());
*/

public class Main {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        linkedList.addLast(12);
        linkedList.addLast(23);
        linkedList.addLast(34);
        System.out.println(linkedList.indexOf(22));
    }
}