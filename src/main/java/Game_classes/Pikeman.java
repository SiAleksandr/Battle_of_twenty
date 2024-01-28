package Game_classes;

public class Pikeman extends Infantry {
    public Pikeman(String nameHero, int posX, int posY) {
        super(
                nameHero,
                true,
                true,
                true,
                100,
                100,
                20,
                new int[]{22, 32},
                posX,
                posY);
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public String toString() {
        return "Копейщик " + super.toString();
    }
}
