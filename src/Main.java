import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Раунд танданыз: ");
        int rounds = scanner.nextInt();
        scanner.nextLine();


        for (int round = 1; round <= rounds; round++) {
            System.out.println("Раунд" + round);
            scanner.nextLine();


            int azamat = sifry(random);
            int bot = sifry(random);

            System.out.println("Азамат ыргыттат:\n" + Kvadraty(azamat) + "\n" + Kvadraty(azamat));
            System.out.println("Бот ыргыттат:\n" + Kvadraty(bot) + "\n" + Kvadraty(bot));

            pobeditel(azamat, bot);

        }
    }

    private static int sifry(Random random) {
        return random.nextInt(6) + 1;
    }

    private static String Kvadraty(int kvadrat) {
        return switch (kvadrat) {
            case 1 -> "+-------+\n|       |\n|   #   |\n|       |\n+-------+";
            case 2 -> "+-------+\n| #     |\n|       |\n|     # |\n+-------+";
            case 3 -> "+-------+\n|     # |\n|   #   |\n| #     |\n+-------+";
            case 4 -> "+-------+\n| #   # |\n|       |\n| #   # |\n+-------+";
            case 5 -> "+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+";
            case 6 -> "+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+";
            default -> "Катта ";
        };

    }

    private static void pobeditel(int azamat, int bot) {
        switch (Integer.compare(azamat, bot)) {
            case -1 -> System.out.println("Бот утту");
            case 1 -> System.out.println("Азамат утту");
        }
    }
}
