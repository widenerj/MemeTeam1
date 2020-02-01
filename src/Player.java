public class Player {
    private int health;
    private int healthMax;

    public Player(int _healthMax) {
        health = _healthMax;
        healthMax = _healthMax;
    }

    public int GetHealth() {
        return health;
    }

    public int GetHealthMax() {
        return healthMax;
    }

    public void AdditiveChangeHealth(int effect) {
        health += effect;
        if (health > healthMax)
            health = healthMax;
    }

    public void SetHealthMax(int _healthMax) {
        healthMax = _healthMax;
    }
}
