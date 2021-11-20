package praktikum7;

import java.util.Scanner;

public class Praktikum7 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Masuk ke Sistem Parkir? y/n");
            char masuk = in.nextLine().charAt(0);

            if (masuk == 'y') {
                new Fungsi();
            }
            if (masuk == 'n') {
                break;
            }

        }
    }
}

    
    
    

