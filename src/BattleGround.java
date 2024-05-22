public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Murometz",100);
        Archer archer =new Archer("RobinHooD",100);
        Mage mage =new Mage("Volandemort",150);

        Zombie zombie =new Zombie(70);
        Vampire vampire = new Vampire(200);

        warrior.attackEnemy(vampire);
        vampire.attackHero(warrior);

        mage.attackEnemy(zombie);
        zombie.attackHero(mage);


    }
}
