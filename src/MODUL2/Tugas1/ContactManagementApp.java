package MODUL2.Tugas1;

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Nama: " + name + ", Nomor Telepon: " + phoneNumber;
    }
}

class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Kontak berhasil ditambahkan: " + contact.getName());
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Daftar kontak kosong.");
        } else {
            System.out.println("Daftar Kontak:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void searchContact(String name) {
        boolean contactFound = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Kontak ditemukan - " + contact);
                contactFound = true;
                break;
            }
        }
        if (!contactFound) {
            System.out.println("Kontak tidak ditemukan untuk nama: " + name);
        }
    }
}

public class ContactManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        System.out.println("\n\nSelamat datang di Program Manajemen Kontak!");
        System.out.println("===========================================");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Lihat Daftar Kontak");
            System.out.println("3. Cari Kontak");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama kontak: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon kontak: ");
                    String phoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    contactManager.addContact(newContact);
                    break;

                case 2:
                    contactManager.displayContacts();//tampil
                    break;

                case 3:
                    System.out.print("Masukkan nama kontak yang dicari: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchContact(searchName);
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan Program Manajemen Kontak. Sampai jumpa!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1-4.");
            }
        }
    }
}
