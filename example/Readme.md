# Sistem Pemesanan Tiket Travel Agency

Selamat datang di Sistem Pemesanan Tiket Travel Agency. Aplikasi ini dibuat menggunakan bahasa pemrograman Java dan berbasis konsol.

## Struktur Kode

Kode ini terdiri dari dua kelas utama:

1. **Ticket**
    - Kelas ini merepresentasikan tiket dengan menyimpan nama penumpang dan nomor kursi.
    - Metode `getPassengerName()` digunakan untuk mendapatkan nama penumpang.
    - Metode `getSeatNumber()` digunakan untuk mendapatkan nomor kursi.

2. **TravelAgency**
    - Kelas ini mewakili agensi perjalanan dan mengelola proses pemesanan tiket.
    - Metode `displayAvailableSeats()` menampilkan kursi yang tersedia.
    - Metode `bookTicket(String passengerName, int seatNumber)` digunakan untuk memesan tiket.

3. **TicketBookingSystem**
    - Kelas ini merupakan program utama yang digunakan untuk berinteraksi dengan pengguna melalui konsol.
    - Proses pemesanan tiket dilakukan melalui opsi menu yang ditampilkan.

