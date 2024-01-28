package Game_classes;

public class Wizard extends Magican {
    protected int maxPower;
    protected int power;
    protected int recovery;
    public Wizard(String nameHero, int posX, int posY) {
        super(
                nameHero,
                false,
                false,
                false,
                85,
                85,
                5,
                new int[]{-13, -18},
                70,
                70,
                35,
                posX,
                posY);
        this.posX = posX;
        this.posY = posY;
    }
    @Override
    public String toString() {
        return("Колдун " + super.toString());
    }
}
