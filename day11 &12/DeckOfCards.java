package day11_and_12;

public class DeckOfCards
{

    public static void main(String[] args) {

        String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] value = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int totalCount = Suits.length * value.length;
        String[] deck = new String[totalCount];
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                deck[Suits.length * i + j] = value[i] + " " + Suits[j];
            }
        }
        for (int i = 0; i < totalCount; i++) {
            int r = i + (int) (Math.random() * (totalCount - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        System.out.println("Total number of deck of cards are " + deck.length);
        for (int i = 0; i <=3; i++) {
            System.out.println("----- Person " + (i + 1) + " -----");
            for (int j = 0; j <= 8; j++) {
                System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
            }
        }
    }
}