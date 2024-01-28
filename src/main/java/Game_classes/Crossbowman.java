package Game_classes;

import java.util.ArrayList;

public class Crossbowman extends Archer {
    public Crossbowman(String nameHero, int posX, int posY) {
        super(nameHero, false, false, true,
                80, 80, 12, new int[]{10, 15},
                7, 7, posX, posY);
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public String toString() {
        return "Арбалетчик " + super.toString();
    }

//    public int getNearestW(ArrayList<Hero> enemies) {
//        int nearestIndex = 0;
//        for(int i = 0; i < enemies.size(); i++) {
//            if (position.rangeOfEnemy(enemies.get(i).position) < position.rangeOfEnemy(enemies.get(nearestIndex).position)) {
//                nearestIndex = i;
//            }
//        }
//        return nearestIndex;
//    }
}
