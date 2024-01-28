package Game_classes;

public class Monk extends Magican {
    public Monk(String nameHero, int posX, int posy) {
        super(
                nameHero,
                false,
                false,
                false,
                90,
                90,
                5,
                new int[]{-15, -20},
                75,
                75,
                35,
                posX,
                posy);
        this.posX = posX;
        this.posY = posy;
    }
    @Override
    public String toString() {
        return "Монах " + super.toString();
    }
}
