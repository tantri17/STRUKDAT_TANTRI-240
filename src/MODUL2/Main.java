package MODUL2;

import java.util.Scanner;


class Node {
    String name;
    String phoneNumber;
    Node next;

    public Node(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}


class ContactManager {
    private Node head;

    public ContactManager() {
        this.head = null;
    }


    public void addContact(String name, String phoneNumber) {
        Node newNode = new Node(name, phoneNumber);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Kontak berhasil ditambahkan.");
    }


    public void displayContacts() {
        if (head == null) {
            System.out.println("Daftar kontak kosong.");
        } else {
            System.out.println("Daftar Kontak:");
            Node current = head;
            while (current != null) {
                System.out.println("Nama: " + current.name + ", Nomor Telepon: " + current.phoneNumber);
                current = current.next;
            }
        }
    }


    public void searchContact(String name) {
        boolean found = false;
        Node current = head;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("Kontak ditemukan - Nama: " + current.name + ", Nomor Telepon: " + current.phoneNumber);
                found = true;
                break;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Kontak tidak ditemukan.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        int choice;
        do {
            System.out.println("\nMenu Contact Manager:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Tampilkan Daftar Kontak");
            System.out.println("3. Cari Kontak");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama kontak: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String phoneNumber = scanner.nextLine();
                    contactManager.addContact(name, phoneNumber);
                    break;
                case 2:
                    contactManager.displayContacts();
                    break;
                case 3:
                    System.out.print("Masukkan nama kontak yang ingin dicari: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchContact(searchName);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
