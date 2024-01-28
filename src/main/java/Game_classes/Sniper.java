package Game_classes;

import java.util.ArrayList;

public class Sniper extends Archer {
    protected int maxAmmunition;
    protected int ammunition;
    public Sniper(String nameHero, int posX, int posY) {
        super(nameHero, false, false, true,
                75, 75, 10, new int[]{12, 17},
                6, 6, posX, posY);
        this.posX = posX;
        this.posY = posY;
    }
    public String toString() {
        return "Снайпер " + super.toString();
    }

//    public int getNearestB(ArrayList<Hero> enemies) {
//        int nearestIndex = 0;
//        for (int i = 0; i < enemies.size(); i++) {
//            if (position.rangeEnemy(enemies.get(i).position) < position.rangeEnemy(enemies.get(nearestIndex).position)) {
//                nearestIndex = i;
//            }
//        }
//        return nearestIndex;
//    }
}
