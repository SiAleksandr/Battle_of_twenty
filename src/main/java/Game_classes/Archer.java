package Game_classes;
import java.util.List;

public abstract class Archer extends Hero{
    protected int maxAmmunition;
    protected int ammunition;
    public Archer (String nameHero, boolean isMovable, boolean isMelee, boolean isMilitary,
                   int health, int healthMax, int armor, int[] damage,
                   int maxAmmunition, int ammunition,  int posX, int posY) {
        super(nameHero, 3, isMovable, isMelee, isMilitary, health, healthMax,
                armor, damage, posX, posY);
        this.maxAmmunition = maxAmmunition;
        this.ammunition = ammunition;
    }
    public void attack (Hero hero){
        int damage = Hero.random.nextInt(this.damage[0], this.damage[1] + 1);
        float dis = this.position.rangeToEnemy(hero.position);
        double bestDis = 5;
        if (dis > bestDis) {
            double temp = damage / (dis / bestDis) + 0.5;
            damage = (int)temp;
        }
        if (this.ammunition > 0) {
            hero.getDamage(damage);
            ammunition -= 1;
        }
    }
    @Override
    public void step (List<Hero> enemies) {
        if (this.isAlive()) {
            float[] dis = distances(enemies);
            int indexMin = getNearest(dis);
            attack(enemies.get(indexMin));
        }
        else return;
    }
    @Override
    public String toString(){
        return nameHero + "; здоровье " + health +"; боеприпасов " + ammunition + "; броня " + armor
                + "; макс.урон " + damage[1] + "; позиция [" + posX + "," + posY + "]";
    }
}
