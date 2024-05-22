import java.util.Random;

public class Zombie extends Enemy {
    private int health;
    private final int ZOMBIE_DAMAGE = 55;

    private double chanceLevel = 0.5;//переменная задающая вероятность воскрешения зомби

    public Zombie(int health) {
        super(health);
        this.health=health;

    }

    public void takeDamage(int damage) {
        if ( health> 0) {
          health -= damage;
        }
        if (health <= 0) {
            if (returnInGameMode()) {
                setHealth(100);// добавляем здоровье если рандом вернет true;
                System.out.println("Зомби воскрес! ");
            } else {
                System.out.println("Зомби погиб");
            }
        } else {
            System.out.println("У зомби осталось здоровья " + health);
        }
        }

    public void setHealth(int health) {
        this.health = health;
    }

    private boolean returnInGameMode() {// метод, воскрешающий зомби с рандомной вероятностью
        Random random = new Random();
        double chance = random.nextDouble();
        return chance <= chanceLevel;

    }

    @Override
    public void attackHero(Hero hero) {
        if(hero.isAlive()){
         hero.takeDamage(ZOMBIE_DAMAGE);}else System.out.println("герой уже мертв!");
    }


    @Override
    public boolean isAlive() {
        return  (health>0);
    }
}