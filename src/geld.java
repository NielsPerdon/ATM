import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class atm {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        createAtm();
        int command;
        do {
            System.out.println("1. transactie checken");
            System.out.println("2. saldo checken");
            System.out.println("3. geld opnemen");
            System.out.println("4. geld storten");
            System.out.println("5. geld overmaken");
            System.out.println("0. afsluiten");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    checkTransactie();
                    break;
                case 2:
                    checkSaldo();
                    break;
                case 3:
                    geldOpnemen();
                    break;
                case 4:
                    geldStorten();
                    break;
                case 5:
                    geldOvermaken();
                    break;
                case 0:
                    afsluiten();
                    break;
                default:
                    System.out.println("fout nummer");
            }

        }while(command != 0);
    }


    public static void createAtm() {

    }

    public static void checkTransactie() {
        System.out.println("u heeft 50 euro gestort");
        System.out.println("u heeft 50 euro opgenomen");
        System.out.println("u heeft uw saldo gecheckt");
        int checkSaldo = scanner.nextInt();

    }

    public static void checkSaldo() {
        System.out.println("u heeft 50 euro ");
        int checkSaldo = scanner.nextInt();
    }

    public static void geldOpnemen() {
        System.out.println("Welk bedrag wilt u opnemen:");
        int opnemen = scanner.nextInt();
        System.out.println("gelukt! u heeft " + opnemen + " euro opgenomen." );
    }
    public static void geldStorten() {
        System.out.println("hoeveel geld wilt u storten");
        int storten = scanner.nextInt();
        System.out.println("gelukt! u heeft " + storten + " euro gestort." );
    }
    public static void geldOvermaken() {
        System.out.println("naar wie wilt u geld overmaken?");
        String persoon = scanner.next();
        System.out.println("hoeveel wilt u overmaken:");
        int overgemaakt = scanner.nextInt();
        System.out.println("gelukt! u heeft " + overgemaakt + " overgemaakt naar " + persoon + ".");

        int saldo = 10000;
        int newSaldo = saldo - overgemaakt;

        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\Niels Perdon\\Desktop\\Perdonics\\java\\ATM\\test.txt"));
            bw.write("gelukt! u heeft " + overgemaakt + " overgemaakt naar " + persoon + ". ");
            bw.write("uw saldo is op dit moment " + newSaldo);
            bw.close();
        }catch(Exception ex) {
            return;
        }

    }
    public static void afsluiten() {
        System.out.println("wilt u de bon hebben?");
    }
}