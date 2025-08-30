import java.util.*;

public class CardGame {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numCards = suits.length * ranks.length;
        String[] deck = new String[numCards];
        int index = 0;
        
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        String[][] playersCards = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[cardIndex++];
            }
        }
        return playersCards;
    }

    public static void printPlayerCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : playersCards[i]) {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] playersCards = distributeCards(deck, numPlayers, cardsPerPlayer);
        
        printPlayerCards(playersCards);
        
        scanner.close();
    }
}
