import java.util.ArrayList;
import java.util.Scanner;

//Sebelum refactoring
public class SistemAnggotaAwal {
    ArrayList<String> daftar;
    Scanner sc;

    public SistemAnggotaAwal() {
        daftar = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void mulaiSistem() {
        System.out.println("SISTEM PENGHITUNG JUMLAH ANGGOTA");

        int pil = -1;

        while (pil != 5) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Lihat");
            System.out.println("4. Hitung");
            System.out.println("5. Keluar");
            System.out.print("Pilihan (1-5): ");

            try {
                pil = Integer.parseInt(sc.nextLine());

                if (pil == 1) {
                    System.out.print("Nama anggota: ");
                    String nama = sc.nextLine().trim();
                    if (!nama.isEmpty()) {
                        daftar.add(nama);
                        System.out.println("Anggota " + nama + " ditambahkan.");
                    } else {
                        System.out.println("Nama tidak boleh kosong.");
                    }
                } else if (pil == 2) {
                    if (daftar.isEmpty()) {
                        System.out.println("Daftar kosong.");
                        continue;
                    }
                    System.out.println("Daftar Anggota:");
                    for (int i = 0; i < daftar.size(); i++) {
                        System.out.println((i + 1) + ". " + daftar.get(i));
                    }
                    System.out.print("Nama yang dihapus: ");
                    String namaHapus = sc.nextLine().trim();
                    if (daftar.remove(namaHapus)) {
                        System.out.println("Anggota " + namaHapus + " dihapus.");
                    } else {
                        System.out.println("Anggota tidak ditemukan.");
                    }
                } else if (pil == 3) {
                    System.out.println("\nDAFTAR ANGGOTA:");
                    if (daftar.isEmpty()) {
                        System.out.println("Daftar masih kosong.");
                    } else {
                        for (int i = 0; i < daftar.size(); i++) {
                            System.out.println((i + 1) + ". " + daftar.get(i));
                        }
                    }
                } else if (pil == 4) {
                    int total = daftar.size();
                    System.out.println("TOTAL ANGGOTA: " + total + " orang.");
                } else if (pil == 5) {
                    System.out.println("Program selesai.");
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukan harus berupa angka.");
            }
        }
    }

    public static void main(String[] args) {
        SistemAnggotaAwal sistem = new SistemAnggotaAwal();
        sistem.mulaiSistem();
    }
}