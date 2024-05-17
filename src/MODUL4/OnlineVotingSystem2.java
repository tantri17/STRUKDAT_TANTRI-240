package MODUL4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class OnlineVotingSystem2 {
    public static void main(String[] args) {
        DataPemilih dataPemilih = new DataPemilih();
        dataPemilih.registerOrLogin();
    }
}

class DataPemilih {
    private HashMap<String, String> users = new HashMap<>();
    private HashMap<String, ArrayList<String>> userDetails = new HashMap<>();
    private HashMap<String, Integer> candidates = new HashMap<>();
    private HashMap<String, ArrayList<String>> voterChoices = new HashMap<>();

    public DataPemilih() {

        candidates.put ("tantri", 0);
        candidates.put("romzyy", 0);
        candidates.put("elbara", 0);
    }

    private void showVotingResults() {


        for (ArrayList<String> choices : voterChoices.values()) {
            for (String choice : choices) {
                candidates.put(choice, candidates.get(choice) + 1);
            }
        }

        System.out.println("\nHasil Voting:\n");
        for (String candidate : candidates.keySet()) {
            int votes = candidates.get(candidate);
            System.out.println(candidate + "    : " + votes + " suara");
        }

    }


    public void registerOrLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelamat datang di Sistem Voting Online\n");
        System.out.println("1. Register\n2. Login\n3. Hasil Voting\n4. Logout");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            register(scanner);
        } else if (choice == 2) {
            login(scanner);
        } else if (choice == 3) {
            showVotingResults();
            registerOrLogin();
        } else if (choice == 4) {
            logout(scanner);
        } else {
            System.out.println("Pilihan tidak valid.");
            registerOrLogin();
        }
    }

    private void register(Scanner scanner) {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        if (!email.endsWith("@gmail.com")) {
            System.out.println("Gagal Mendaftar: Email harus menggunakan domain @gmail.com");
            registerOrLogin();
            return;
        }

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Nama: ");
        String name = scanner.nextLine();

        System.out.print("NIK: ");
        String nik = scanner.nextLine();

        if (users.containsKey(email) || userDetails.containsValue(new ArrayList<>(List.of(name, nik)))) {
            System.out.println("Gagal Mendaftar: Email atau NIK sudah terdaftar");
            registerOrLogin();
            return;
        }

        users.put(email, password);
        userDetails.put(email, new ArrayList<>(List.of(name, nik)));

        System.out.println("Berhasil Mendaftar");
        registerOrLogin();

    }

    private void login(Scanner scanner) {
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        if (!users.containsKey(email) || !users.get(email).equals(password) || !email.endsWith("@gmail.com")) {
            System.out.println("Gagal Login: Email atau password salah");
            registerOrLogin();
            return;
        }

        System.out.println("Login Berhasil");
        ArrayList<String> userInfo = userDetails.get(email);
        System.out.println("Nama: " + userInfo.get(0));
        System.out.println("NIK: " + userInfo.get(1));

        voting(scanner, email);

    }

    private void voting(Scanner scanner, String email) {
        ArrayList<String> choices = new ArrayList<>();

        System.out.println("\nPilih kandidat yang ingin Anda dukung:");
        for (String candidate : candidates.keySet()) {
            System.out.println(candidate);
        }

        String input;
        do {
            System.out.print("\nMasukkan nama kandidat (atau ketik 'selesai' untuk keluar): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            if (!candidates.containsKey(input)) {
                System.out.println("Kandidat tidak valid.");
                continue;
            }

            choices.add(input);
            System.out.println("Pilihan kandidat berhasil ditambahkan.");

        } while (true);

        voterChoices.put(email, choices);

        System.out.println("\nTerima kasih, suara Anda telah direkam.\n");
        registerOrLogin();
    }

    private void logout(Scanner scanner) {
        System.out.println("\nAnda telah keluar dari sistem \nTerimakasih.");
    }
}
