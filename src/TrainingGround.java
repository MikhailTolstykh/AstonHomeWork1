public class TrainingGround {
    public static void main(String[] args) {

Zombie zombie = new Zombie(100);
Warrior warrior = new Warrior("Misha",100);


warrior.attackEnemy(zombie);
 warrior.attackEnemy(zombie);


Vampire vampire =new Vampire(100);
vampire.attackHero(warrior);
    }
}
