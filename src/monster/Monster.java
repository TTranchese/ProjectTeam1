/**
 * @author Figuccia
 */
package monster;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public abstract class Monster implements Rideable {
    private int id;
    private static Map<Class<? extends Monster>, Integer> nextIdByType = new HashMap<>();
    private String name;
    private int level;
    private int monsterHealthPoints;
    private int monsterAbilityPoints;
    private int monsterAttack;
    private int monsterDefense;
    private MonsterClass monsterClass;
    private List<Ability> abilities;
    private MoveSet moveSet;
    private List<String> abilities = new ArrayList<>();

    public Monster() {
        Class<? extends Monster> type = getClass();
        if (!nextIdByType.containsKey(type)) {
            nextIdByType.put(type, 0);
        }
        this.id = nextIdByType.get(type);
        nextIdByType.put(type, this.id + 1);
    }

    public int getId() {
        return id;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void addAbility(String ability) {
        abilities.add(ability);
    }

    @Override
    public void ride() {
        System.out.println("Riding the monster");
    }
}



        /*
public class Monsters {
    int idMonster;
    int level;

    private static int nextId = 0;
    private int id;
    private int energia;
    private int attacco;
    private int difesa;
    private List<String> abilità = new ArrayList<>();

    public Mostro(int energia, int attacco, int difesa) {
        this.id = nextId++;
        this.energia = energia;
        this.attacco = attacco;
        this.difesa = difesa;
    }

    public void addAbilità(String abilità) {
        this.abilità.add(abilità);
    }

    public int getId() {
        return id;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public List<String> getAbilità() {
        return abilità;
    }

    public abstract void cavalca();
}

}
*/