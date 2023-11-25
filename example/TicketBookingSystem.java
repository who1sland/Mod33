package org.example;

import java.util.Scanner;

class Ticket {
    private String passengerName;
    private int seatNumber;

    public Ticket(String passengerName, int seatNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}


class TravelAgency {
    private Ticket[] seats;
    private int totalSeats;

    public TravelAgency(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seats = new Ticket[totalSeats];
        for (int i = 0; i < totalSeats; i++) {
            seats[i] = null; // Mark all seats as initially available
        }
    }

    public void displayAvailableSeats() {
        System.out.println("Available Seats:");
        for (int i = 0; i < totalSeats; i++) {
            if (seats[i] == null) {
                System.out.print(i + 1 + " ");
            }
        }
        System.out.println();
    }

    public boolean bookTicket(String passengerName, int seatNumber) {
        if (seatNumber < 1 || seatNumber > totalSeats) {
            System.out.println("Pilihan Kursi Salah.");
            return false;
        }

        if (seats[seatNumber - 1] != null) {
            System.out.println("Kursi Sudah Di pilih, Silahkan Pilih Kursi Yang lain.");
            return false;
        }

        seats[seatNumber - 1] = new Ticket(passengerName, seatNumber);
        System.out.println("Booking succes Untuk Nomor Kursi " + seatNumber);
        return true;
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Travel Agency");

        System.out.print("Masukan Total Nomor Kursi: ");
        int totalSeats = scanner.nextInt();
        TravelAgency travelAgency = new TravelAgency(totalSeats);

        while (true) {
            System.out.println("\n1. Kursi Yang kosong");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Exit");
            System.out.print("Masukan Kodemu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    travelAgency.displayAvailableSeats();
                    break;
                case 2:
                    System.out.print("Nama Penumpang: ");
                    String passengerName = scanner.next();
                    System.out.print("Nomor Kursi: ");
                    int seatNumber = scanner.nextInt();
                    travelAgency.bookTicket(passengerName, seatNumber);
                    break;
                case 3:
                    System.out.println("Terimakasi!!!!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Silahkan Pilih Ulang.");
            }
        }
    }
}
