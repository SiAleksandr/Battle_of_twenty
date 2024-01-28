package Game_classes;

import java.util.List;
import java.util.Random;

public abstract class Hero implements GameI {
    protected static Random random;

    static {
        Hero.random = new Random();
    }
    protected int initiative;

    protected boolean isMovable;
    protected boolean isMelee;
    protected boolean isMilitary;
    protected int health;
    protected int healthMax;
    protected int armor;
    protected int posX;
    protected int posY;
    protected int[] damage;
    protected String nameHero;
    protected Vector2 position;

    public Hero(String nameHero, int initiative, boolean isMovable, boolean isMelee, boolean isMilitary,
                int health, int healthMax, int armor, int[] damage, int posX, int posY) {
        this.nameHero = nameHero;
        this.initiative = initiative;
        this.isMovable = isMovable;
        this.isMelee = isMelee;
        this.isMilitary = isMilitary;
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.position = new Vector2(posX, posY);
    }

    protected float[] distances(List<Hero> heroUnit) {
        float[] ranges = new float[heroUnit.size()];
        float fatalMax = 10;
        for (int i = 0; i < heroUnit.size(); i++) {
            if(heroUnit.get(i).isAlive())
                ranges[i] = heroUnit.get(i).position.rangeToEnemy(this.position);
            else ranges[i] = fatalMax;
        }
        return ranges;
    }
    protected int getNearest (float[] distances){
        int indexMin = 0;
        for (int i = 0; i < distances.length; i++)
            if (distances[i] < distances[indexMin]) indexMin = i;
        return indexMin;
    }
    public void getDamage(int damage) {
        if (this.armor > damage) this.health -= (damage - 3);
        else if (this.armor == damage) this.health -= damage;
        else this.health -= (damage + 2);
    }
    public boolean isAlive() {
        if (this.health <= 0) return false;
        else return true;
    }
    public int getInitiative(){
        return this.initiative;
    }
    @Override
    public void step(List<Hero> enemies){}
}
