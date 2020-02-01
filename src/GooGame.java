import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GooGame {

    // TODO CARD DRAW ON DAMAGE, IMPLEMENT BOTH CODES

    public static void main(String[] args) {

       Player player = new Player(100);

       Monster monster = new Monster("Monster", 90, 6);

        ArrayList<Card> deck = new ArrayList<Card>();
        deck.add(new Card(0));
        deck.add(new Card(0));
        deck.add(new Card(0));
        deck.add(new Card(0));
        deck.add(new Card(3));
        deck.add(new Card(1));
        deck.add(new Card(1));
        deck.add(new Card(1));
        deck.add(new Card(2));
        deck.add(new Card(2));

       Combat fight1 = new Combat(player, monster,deck);
       fight1.Start();

    }
}

