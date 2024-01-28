package Game_classes;

import java.util.List;

public abstract class Infantry extends Hero{
    public Infantry(String nameHero, boolean isMovable, boolean isMelee, boolean isMilitary,
                    int health, int healthMax, int armor, int[] damage, int posX, int posY) {
        super(nameHero, 2, isMovable, isMelee, isMilitary, health, healthMax,
                armor, damage, posX, posY);
    }
    @Override
    public void step(List<Hero> enemies){}
    @Override
    public String toString() {
        return nameHero + "; здоровье " + health +"; броня " + armor
                + "; макс.урон " + damage[1] + "; позиция [" + posX + "," + posY + "]";
    }
}
