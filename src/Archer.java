public class Archer extends Hero implements Mortal{
  private final int DAMAGE =25;
  private   int health;
    public Archer(String name) {
      super(name);
    }

    public Archer(String name, int health) {
        super(name);
        this.health = health;
    }
    public void takeDamage(int damage){
        if (health > 0) {
            health -=damage;
        }  if (health <= 0) {
            System.out.println(" Герой погиб");
        } else
            System.out.println("У лучника по имени "+getName()+" осталось здоровья " + health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
    }

    @Override
    public boolean isAlive() {
        return  (health>0);
    }
}
