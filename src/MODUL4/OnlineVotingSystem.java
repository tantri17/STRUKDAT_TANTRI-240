package MODUL4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineVotingSystem {
    private Map<String, Integer> candidates;

    public OnlineVotingSystem() {
        candidates = new HashMap<>();
    }

    public void addCandidate(String candidateName) {
        if (!candidates.containsKey(candidateName)) {
            candidates.put(candidateName, 0);
        }
    }

    public void voteForCandidate(String candidateName) {
        if (candidates.containsKey(candidateName)) {
            int currentVotes = candidates.get(candidateName);
            candidates.put(candidateName, currentVotes + 1);
            System.out.println("Terima kasih, suara Anda telah direkam.");
        } else {
            System.out.println("Kandidat tidak ditemukan.");
        }
    }

    public void displayVotingResult() {
        System.out.println("\nHasil Voting:");
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " suara");
        }
    }

    public static void main(String[] args) {
        OnlineVotingSystem votingSystem = new OnlineVotingSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Voting Online\n");

        votingSystem.addCandidate("tantri");
        votingSystem.addCandidate("romzyy");
        votingSystem.addCandidate("elbara");

        while (true) {
            System.out.println("\nPilih kandidat yang ingin Anda dukung:\n");
            for (String candidate : votingSystem.candidates.keySet()) {
                System.out.println(candidate);
            }
            System.out.print("\nMasukkan nama kandidat (atau ketik 'selesai' untuk keluar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            votingSystem.voteForCandidate(input);
        }

        votingSystem.displayVotingResult();
    }
}

