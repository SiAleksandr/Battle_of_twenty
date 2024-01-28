package Game_classes;
public class Vector2 {
    int numX;
    int numY;
    public Vector2(int posX, int posY) {
        this.numX = posX;
        this.numY = posY;
    }
    public float rangeToEnemy(Vector2 position) {
        double distance = Math.sqrt(Math.pow(numX - position.numX, 2) +
                Math.pow(numY - position.numY, 2));
        return (float)distance;
    }
}
