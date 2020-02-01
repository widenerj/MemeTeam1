public class Card {
    private int cardType;
    private String name;
    private String desc;
    private int monsterDamage;
    private int playerDamage;
    private int heal;
    private int state; // 0 = DECK, 1 = HAND, 2 = DISCARD


    public Card() {
        monsterDamage = 10;
        playerDamage = 0;
        heal = 0;
    }

    public String GetName(){
        return name;
    }

    public Card (int _cardType) {
        cardType = _cardType;
        switch (cardType) {
            case 0:
                name = "Attack";
                desc = "Hits the enemy for 8 damage";
                break;
            case 1:
                name = "Spell";
                desc = "Hits the enemy for 20 damage, take 10 self damage";
                break;
            case 2:
                name = "Heal";
                desc = "Heal self for 6 damage";
                break;
            case 3:
                name = "Weaken";
                desc = "Deal 4 self damage, to make enemy do 1/2 damage";
                break;
        }
    }

    public void CardAction (Player _player, Monster _monster, Combat _fight) {
        switch(cardType) {
            case 0:     // Attack demo
                _monster.AdditiveChangeHealth(-8);
                System.out.println("EFFECT 0");
                break;
            case 1:     // Spell demo
                _player.AdditiveChangeHealth(-10);
                _monster.AdditiveChangeHealth(-20);
                _fight.SetDrawCount(1);
                System.out.println("EFFECT 1");
                break;
            case 2:     // Heal demo
                _player.AdditiveChangeHealth(8);
                System.out.println("EFFECT 2");
                break;
            case 3:     // Weaken demo
                _monster.SetPower(_monster.GetPower() / 2);
                System.out.println("EFFECT 3");
                break;
            default:
                System.out.println("ERROR, INVALID CARD OBJECT");
                break;
        }
        state = 2;  // discard
    }
}
