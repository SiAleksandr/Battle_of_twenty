package Game_classes;

public class Rogue extends Infantry {
    public Rogue(String nameHero, int posX, int posY) {
        super(
                nameHero,
                true,
                true,
                true,
                100,
                100,
                20,
                new int[]{19, 33},
                posX,
                posY);
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public String toString() {
        return "Разбойник " + super.toString();
    }
}
