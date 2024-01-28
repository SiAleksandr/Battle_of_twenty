package Game_classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Hero> whiteTeam = createWhite();
        List<Hero> blackTeam = createBlack();
        List<Hero> heroOrder = new ArrayList<>();
        heroOrder.addAll(whiteTeam);
        heroOrder.addAll(blackTeam);
        heroOrder.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());
        heroOrder.forEach(n -> System.out.println(n.toString()));
        for(Hero h: heroOrder){
            if (whiteTeam.contains(h)){
                h.step(blackTeam);
            }
            else h.step(whiteTeam);
        }
        System.out.println("*******************");
        whiteTeam.forEach(n -> System.out.println(n.toString()));
        System.out.println("---------------------");
        blackTeam.forEach(n -> System.out.println(n.toString()));
    }
    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].name();
    }
    static List<Hero> createWhite() {
        List<Hero> team = new ArrayList<>();
        Random random = new Random();
        int leftLine = 0;
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(0, 4);
            switch (rand) {
                case 0:
                    team.add(new Crossbowman(getName(), i, leftLine));
                    break;
                case 1:
                    team.add(new Pikeman(getName(), i, leftLine));
                    break;
                case 2:
                    team.add(new Monk(getName(), i, leftLine));
                    break;
                case 3:
                    team.add(new Peasant(getName(), i, leftLine));
                    break;
            }
        }
        return team;
    }
    static List<Hero> createBlack() {
        List<Hero> team = new ArrayList<>();
        Random random = new Random();
        int rightLine = 9;
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(0, 4);
            switch (rand) {
                case 0:
                    team.add(new Sniper(getName(), i, rightLine));
                    break;
                case 1:
                    team.add(new Rogue(getName(), i, rightLine));
                    break;
                case 2:
                    team.add(new Wizard(getName(), i, rightLine));
                    break;
                case 3:
                    team.add(new Peasant(getName(), i, rightLine));
                    break;
            }
        }
        return team;
    }
}
