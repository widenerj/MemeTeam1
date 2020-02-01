import java.util.Random;

public class Monster {
    private String name;
    private int health;
    private int healthMax;
    private int INIT_POWER;
    private int power;

    public Monster(String _name, int _healthMax, int _power) {
        name = _name;
        health = _healthMax;
        healthMax = _healthMax;
        INIT_POWER = _power;
        power = INIT_POWER;
    }

    public int GetHealth() {
        return health;
    }

    public int GetHealthMax() {
        return healthMax;
    }

    public int GetPower() {
        return power;
    }

    public void SetPower(int _powerChange) {
        power = _powerChange;
    }

    public void AdditiveChangeHealth(int effect) {
        health += effect;
        if (health > healthMax)
            health = healthMax;
    }

    public void MonsterAttack(Player _player, Combat _fight) {
        Random rand = new Random();
        int monsterAttack = power + (rand.nextInt(power) / 2);
        _player.AdditiveChangeHealth(-monsterAttack);
        _fight.SetDrawCount(3);
        System.out.println("" + name + " attacked for " + monsterAttack + " damage!");

        power = INIT_POWER;
    }
}
