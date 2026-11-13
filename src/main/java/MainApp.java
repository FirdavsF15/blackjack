import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("How many players yo? ");
        int numHands = Integer.parseInt(scanner.nextLine());

        ArrayList<Hand> players= new ArrayList<>();
        Deck deck = new Deck();
        deck.shuffle();
        for (int i = 0; i < numHands; i++) {
            Hand newHand = new Hand();
            newHand.deal(deck.deal());
            newHand.deal(deck.deal());
            players.add(newHand);
            System.out.println(newHand.getValue());

        }



    }
}