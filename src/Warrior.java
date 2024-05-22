public class Warrior extends Hero implements Mortal{
   private final int DAMAGE=55 ;
   private   int health=100;

    public Warrior(String name,  int health) {
        super(name);
        this.health = health;
    }

    public int getDAMAGE() {
        return DAMAGE;
    }

    public Warrior(String name) {
        super(name);
    }

    public void takeDamage(int damage) {
        if (health > 0) {
            health -= damage;
        }
        if (health <= 0) {
            System.out.println(" Герой погиб");
        } else
            System.out.println("У воина по имени  " + getName() + " осталось здоровья " + health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if(enemy.isAlive()){
        enemy.takeDamage(DAMAGE);}

    }


    public boolean isAlive() {
        return  (health>0);
    }
}
