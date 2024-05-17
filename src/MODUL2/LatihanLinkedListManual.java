package MODUL2;

class Node2 {

    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
        this.next = null;

    }

}
// single likedlist
public class LatihanLinkedListManual {
    public static void main(String[] args) {
        Node2 head = new Node2(5);

        Node2 second = new Node2(10);
        head.next = second;

        Node2 third = new Node2 (15);
        second.next = third;

        System.out.println("Daftar Angka:");
        Node2 current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("Elemen kedua:" + head.next.data);

        head.data = 25;

        System.out.println("Daftar Angka setelah perubahan:");
        current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }


        head.next = head.next.next; //untuk H

        System.out.println("Daftar Angka setelah penghapusan:");
        current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
