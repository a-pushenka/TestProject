package section5;

import java.sql.SQLOutput;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megabytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainder + " KB");
    }
}