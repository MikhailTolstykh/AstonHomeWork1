public  abstract class  Hero {
    String name;
    int  domage ;
    int health;

    public Hero(String name, int domage) {
        this.name = name;
        this.domage = domage;
        this.health = health;
    }

    public Hero(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);
     public abstract  void takeDamage(int ENEMY_DAMAGE);

    public abstract boolean isAlive();

}
