public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >=0) {
        int megabytes;
        int remainingKiloBytes;
        remainingKiloBytes = kiloBytes % 1024;
        megabytes = Math.round(kiloBytes / 1024);
            System.out.println(+kiloBytes + " KB = " + megabytes + " MB and " + remainingKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
