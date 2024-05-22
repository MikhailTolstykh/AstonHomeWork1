public class Enemy implements Mortal {
   private   int health;
   private final int ENEMY_DAMAGE= 35;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }



    public void takeDamage(int damage){
        if (health > 0) {
            health -=damage;
        }  if (health <= 0) {
            System.out.println(" враг погиб");
        } else
            System.out.println("у врага осталось здоровья " + health);
    }

    @Override
    public boolean isAlive() {
        return  (health>0);
    }
    public void attackHero(Hero hero){
        if(hero.isAlive()){
            hero.takeDamage(ENEMY_DAMAGE);}else System.out.println("герой уже мертв!");


    }
}
