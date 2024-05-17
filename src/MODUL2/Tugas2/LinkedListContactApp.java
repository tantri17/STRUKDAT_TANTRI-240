package MODUL2.Tugas2;

import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    Contact next;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}

class ContactManager {
    private Contact head;

    public ContactManager() {
        this.head = null;
    }

    public void addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        if (head == null) {
            head = newContact;
        } else {
            Contact current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newContact;
        }
        System.out.println("Kontak berhasil ditambahkan.");
    }

    public void displayContacts() {
        if (head == null) {
            System.out.println("Daftar kontak kosong.");
        } else {
            System.out.println("Daftar Kontak:");
            Contact current = head;
            while (current != null) {
                System.out.println("Nama: " + current.name + ", Nomor Telepon: " + current.phoneNumber);
                current = current.next;
            }
        }
    }

    public void searchContact(String name) {
        boolean found = false;
        Contact current = head;
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

public class LinkedListContactApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        System.out.println("\n\nSelamat datang di Aplikasi Manajemen Kontak menggunakan LinkedList!");
        System.out.println("=================================================================");

        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Lihat Daftar Kontak");
            System.out.println("3. Cari Kontak");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama kontak: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon kontak: ");
                    String phoneNumber = scanner.nextLine();
                    contactManager.addContact(name, phoneNumber);
                    break;

                case 2:
                    contactManager.displayContacts();
                    break;

                case 3:
                    System.out.print("Masukkan nama kontak yang dicari: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchContact(searchName);
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan Aplikasi Manajemen Kontak. Sampai jumpa!");
                    exit = true;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
            }
        }
    }
}
