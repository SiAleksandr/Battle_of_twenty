package Game_classes;
import java.util.List;
public abstract class Magican extends Hero {
    protected int maxPower;
    protected int power;
    protected int recovery;
    public Magican(String nameHero, boolean isMovable, boolean isMelee, boolean isMilitary,
                   int health, int healthMax, int armor, int[] damage,
                   int maxPower, int power, int recovery, int posX, int posY){
        super(nameHero, 1, isMovable, isMelee, isMilitary, health, healthMax,
                armor, damage, posX, posY);
        this.maxPower = maxPower;
        this.power = power;
        this.recovery = recovery;
    }
    @Override
    public void step(List<Hero> enemies){}
    @Override
    public String toString(){
        return nameHero + "; здоровье " + health +"; броня " + armor +
                "; макс.оздоровление " + damage[1] * (-1) + "; энергия " + power +
                "; позиция [" + posX + "," + posY + "]";
    }
}
