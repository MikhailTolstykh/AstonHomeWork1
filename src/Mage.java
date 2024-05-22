public class Mage extends Hero implements Mortal{
    private final int DAMAGE = 35;

    public Mage(String name) {
        super(name);
    }

    public Mage(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }
    public void takeDamage(int damage) {
        if (health > 0) {
            health -= damage;
        }
        if (health <= 0) {
            System.out.println(" Герой погиб");
        } else {
            System.out.println("У мага по имени  " + getName() + " осталось здоровья " + health);
        }
    }
    @Override
    public boolean isAlive() {
        return  (health>0);
    }
}
