import java.time.LocalTime;

public class Vampire extends Enemy{
    private int health;
    private final int VAMPIRE_DAMAGE = 65;
    public Vampire(int health) {
        super(health);
        this.health =health;
    }

    @Override
    public void takeDamage(int damage) {
        if (health > 0) {
            health -= damage;
        }
        if (health <= 0) {
            System.out.println("Вампир  погиб");
        } else
            System.out.println("У вампира осталось здоровья " + health);

    }

    public boolean isNight() {// проверка времени суток
        LocalTime currentTime = LocalTime.now();
        int hours = currentTime.getHour();
        return (hours >= 22 || hours < 5);//возвращаем true если время суток-ночь
    }

    @Override
    public void attackHero(Hero hero) {
        if (isNight()) {
            if (hero.isAlive()) {
                hero.takeDamage(VAMPIRE_DAMAGE);
            } else {
                System.out.println("Герой уже мертв!");
            }
        } else {
            System.out.println("Вампир не может атаковать героя днем!");
        }
    }


}






