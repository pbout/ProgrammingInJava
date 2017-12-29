package Day1_IntroguctionToGroovy._11PokerHands;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        String userentry;
        int i = 0;
        int x = 0;
        int nextrank;
        int straightflush = 0;
        int poker = 0;
        int straight = 0;
        int threeofakind = 0;
        int pair = 0;
        int[] cardsuit = {0, 0, 0, 0, 0};
        int[] cardrank = {0, 0, 0, 0, 0};
        int[] sortedcardrank = {0, 0, 0, 0, 0,};
        boolean pass;

    //-----
    // Get the type of cards
    //-----

        System.out.println("   ____    ____    ____    ____    ");
        System.out.println("  |2   |  |A   |  |Q   |  |T   |   ");
        System.out.println("  |(\\/)|  | /\\ |  | /\\ |  | &  |   ");
        System.out.println("  | \\/ |  | \\/ |  |(__)|  |&|& |   ");
        System.out.println("  |   2|  |   A|  | /\\Q|  | | T|   ");
        System.out.println("  `----`  `----'  `----'  `----'   ");


        while (i < 5){
            pass = false;
            System.out.println("Choose a card type (”spades”,”hearts”, ”diamonds”, ”clubs”)");
            userentry = scanner.nextLine();
            if (userentry.equals("spades") || userentry.equals("hearts") || userentry.equals("diamonds") || userentry.equals("clubs")){
                //-----
                // Get the suit of the cards and convert to numeric value
                //-----
                if (userentry == "spades"){
                    cardsuit[i] = 100;
                }else if (userentry == "hearts") {
                    cardsuit[i] = 200;
                }else if (userentry == "diamonds") {
                    cardsuit[i] = 300;
                }else{
                    cardsuit[i] = 400;
                }
                pass = true;
            }else{
                System.out.println("Not a valid choise.");
                pass = false;
            }

            //-----
            // Get the rank of cards
            //-----
            System.out.println("choose a card rank");
            userentry = scanner.nextLine();
            if (pass){
                if (userentry.equals("1") || userentry.equals("2") || userentry.equals("3") || userentry.equals("4") || userentry.equals("1") ||userentry.equals("5") || userentry.equals("6") || userentry.equals("7") || userentry.equals("8") || userentry.equals("9") || userentry.equals("10")){
                    cardrank[i] = Integer.parseInt(userentry);
                }else if (userentry.equals("J") || userentry.equals("K") || userentry.equals("Q")){
                    switch (userentry) {
                        case "J":
                            cardrank[i] = 11;
                            break;
                        case "K":
                            cardrank[i] = 12;
                            break;
                        case "Q":
                            cardrank[i] = 13;
                            break;
                        default:
                            break;
                    }
                }else{
                    System.out.println("Not a valid choise. Please try again...");
                    pass = false;
                }
            } else {
                System.out.println("Please try again");
            }

            if (pass == true){
                i++;
            }
        }

    //-----
    // Processing the entries
    //-----
        while(x < 9){
            //-----
            // Test for STRAIGHT FLUSH
            //-----
            if (x == 0){
                if (cardsuit[0] == cardsuit[1] && cardsuit[1] == cardsuit[2] && cardsuit[2] == cardsuit[3] && cardsuit[3] == cardsuit[4]){
                    sortedcardrank = cardrank;
                    Arrays.sort(sortedcardrank);
                    for (i = 0; i < 4; i++) {
                        if (sortedcardrank[i] + 1 == sortedcardrank[i + 1]){
                            straightflush++;
                        }
                    }
                    if (straightflush == 4){
                        System.out.println("You got a STRAIGHT FLUSH hand! The best pair there is!");
                        x = 10;
                    }
                }
            }

            //-----
            // Test for POKER
            //-----
            if (x == 1){
                for (i = 0; i < 4; i++) {
                    if (cardrank[i + 1] == cardrank[i]){
                        poker++;
                    }
                }
                if (poker == 3){
                    System.out.println("You got a POKER hand! The second best pair!");
                    x = 10;
                }
            }

            //-----
            // Test for FULL HOUSE
            //-----
            if (x == 2){
                sortedcardrank = cardrank;
                Arrays.sort(sortedcardrank);
                if (sortedcardrank[2] == sortedcardrank[1] && sortedcardrank[1] == sortedcardrank[0]){
                    if (sortedcardrank[4] == sortedcardrank[3]){
                        System.out.println("You got a FULL HOUSE hand!");
                        x = 10;
                    }
                }
            }

            //-----
            // Test for FLUSH
            //-----
            if (x == 3){
                if (cardsuit[0] == cardsuit[1] && cardsuit[1] == cardsuit[2] && cardsuit[2] == cardsuit[3] && cardsuit[3] == cardsuit[4]){
                    System.out.println("You got a FLUSH hand!");
                    x = 10;
                }
            }

            //-----
            // Test for STRAIGHT
            //-----
            if (x == 4){
                sortedcardrank = cardrank;
                Arrays.sort(sortedcardrank);
                for (i = 0; i < 4; i++) {
                    if (sortedcardrank[i] + 1 == sortedcardrank[i + 1]){
                        straight++;
                    }
                }
                if (straight == 4){
                    System.out.println();
                    x = 10;
                }
            }

            //-----
            // Test for THREE OF A KIND
            //-----
            if (x == 5){
                sortedcardrank = cardrank;
                Arrays.sort(sortedcardrank);
                if (sortedcardrank[2] == sortedcardrank[1] && sortedcardrank[1] == sortedcardrank[0]){
                    System.out.println("You got a THREE OF A KIND hand!");
                    x = 10;
                }
            }

            //-----
            // Test for TWO PAIRS
            //-----
            if (x == 6){
                sortedcardrank = cardrank;
                Arrays.sort(sortedcardrank);
                if (sortedcardrank[1] == sortedcardrank[0]){
                    if (sortedcardrank[3] == sortedcardrank[2]){
                        System.out.println("You got a TWO PAIRS hand!");
                        x = 10;
                    }
                }
            }

            //-----
            // Test for PAIR
            //-----
            if (x == 7){
                sortedcardrank = cardrank;
                Arrays.sort(sortedcardrank);
                if (sortedcardrank[1] == sortedcardrank[0]){
                    System.out.println("You got a PAIR hand!");
                    x = 10;
                }
            }

            //-----
            // if all else fails then NOTHING
            //
            if (x == 8){
                System.out.println("You got NOTHING... Bad luck...");
            }
            x++;
        }
    }
}
