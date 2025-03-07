package BookGoblin;

import java.util.Scanner;

public class BookGoblin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            while (true) {
                System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%##%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@###*####%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@##%%%@@@@@@@@@@@@@@@@@@%#+**###*+#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@%#*+++++*#%@@@@@@@@@%+=----=======+*%@@@@@@@@@@%%%###%%%@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@%*+***++=+*%@@@@*=****====-=+*##*+*@@@@#*++++******####%@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@++++*##*===+#+-+*****+==+*******-*#+-=+*##***+*#@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@%+==++*###+==-+*+:-+**++**++--*#*++**###**++++*@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@@*=++++*##%#+=+*:.+#**+=***#-:=#**##%##***++++%@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@*==+++*#%*+=-====+++-=**++=+**+*##%##**++++*@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#++=++***+=++*+++=+**#*++**##**####*******@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%##***##+**#%*++=+*****#%#***%##****###%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#+++*%#*#*##%#%%****@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#***+=*********#%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                        "========================================================================================================");
                System.out.println("Welcome to Book-Goblin!");
                System.out.println("1. Start a New Book ");
                System.out.println("2. View Currently Reading ");
                System.out.println("3. Add to your Hoard");
                System.out.println("4. Have your read this or not?");
                System.out.println("5. Browse Recommendations ");
                System.out.println("6. Set a challenge");
                System.out.println("7. Never mind, I need to read");
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.println("Start a New Book ");
                } else if (choice == 2) {
                    System.out.println("You are currently reading: ");
                } else if (choice == 3){
                    System.out.println("You bought more books?  Let's add them to your TBR");
                } else if (choice == 4) {
                    System.out.println("So many books so little time.");
                } else if (choice == 5 ) {
                    System.out.println("Browse Recommendations");
                } else if (choice == 6) {
                    System.out.println("Set a challenge");

                } else if (choice == 7) {
                    System.out.println("Go read you goblin.");
                    break;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }

        }
    }

