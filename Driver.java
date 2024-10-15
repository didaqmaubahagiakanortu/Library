package Library;

import java.util.Scanner;
public class Driver {
    public static void main(String[] args) throws InterruptedException{
        
        // cover

        System.out.println("Pendataan Buku Perpustakaan\n");

        // general input

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan jenis buku.\n1. Novel\n2. Buku Pelajaran\n3. Biografi");
        int choices = in.nextInt();
        System.out.println();

        in.nextLine();
        System.out.println("Masukkan nama buku.");
        String title = in.nextLine();
        System.out.println();

        System.out.println("Masukkan tahun terbit buku.");
        int year = in.nextInt();
        System.out.println();

        System.out.println("Masukkan harga buku.");
        double price = in.nextDouble();
        System.out.println();

        // switch case

        if (choices == 1) {

            in.nextLine();
            System.out.println("Masukkan genre buku.");
            String genre = in.nextLine();
            System.out.println();

            System.out.println("Mohon menunggu sistem memproses data anda.");
            Thread.sleep(5000);
            System.out.println();

            Novel n1 = new Novel(title, year, price, genre);
            n1.print();

        } else if (choices == 2 || choices == 3) {

            in.nextLine();
            System.out.println("Masukkan topik buku.");
            String subject = in.nextLine();
            System.out.println();

            if (choices == 3) {

                System.out.println("Masukkan tokoh buku.");
                String about = in.nextLine();
                System.out.println();

                System.out.println("Mohon menunggu sistem memproses data anda.");
                Thread.sleep(5000);
                System.out.println();

                Biography b1 = new Biography(title, year, price, subject, about);
                b1.print();

            } else {

                System.out.println("Mohon menunggu sistem memproses data anda.");
                Thread.sleep(5000);
                System.out.println();

                TextBook t1 = new TextBook(title, year, price, subject);
                t1.print();

            }
        }
    }
}
