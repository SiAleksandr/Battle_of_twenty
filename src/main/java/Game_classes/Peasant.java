package Game_classes;

import java.util.List;

public class Peasant extends Hero {
    protected int reserve;
    public Peasant(String nameHero, int posX, int posY) {
        super(
                nameHero,
                0,
                false,
                false,
                false,
                100,
                100,
                0,
                new int[]{0, 0},
                posX,
                posY);
        this.reserve = 30;
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public String toString() {
        return "Крестьянин " + nameHero + "; здоровье " + health +"; броня " + armor
                + "; запас " + reserve + "; позиция [" + posX + "," + posY + "]";
    }
    @Override
    public void step(List<Hero> enemies){}
}
