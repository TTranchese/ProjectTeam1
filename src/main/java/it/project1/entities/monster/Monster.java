/**
 * @author Figuccia
 */
package it.project1.entities.monster;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public abstract class Monster implements Rideable {
    //id generato per ogni nuova classe mostro creata:
    private int id;
    private static Map<Class<? extends Monster>, Integer> nextIdByType = new HashMap<>();

    private String name;
    private int level;
    private int monsterHealtPoints;
    private int monsterAbilityPoints;
    private int monsterAttack;
    private int monsterDefense;
    private List<Ability> abilities;
    private MoveSet moveSet;

    public Monster(String name, int level, int monsterHealtPoints, int monsterAbilityPoints, int monsterAttack, int monsterDefense) {
        Class<? extends Monster> type = getClass();
        if (!nextIdByType.containsKey(type)) {
            nextIdByType.put(type, 0);
        }
        this.id = nextIdByType.get(type);
        nextIdByType.put(type, this.id + 1);
        this.name = name;
        this.level = level;
        this.monsterHealtPoints = monsterHealtPoints;
        this.monsterAbilityPoints = monsterAbilityPoints;
        this.monsterAttack = monsterAttack;
        this.monsterDefense = monsterDefense;
        this.abilities = new ArrayList<>();
        this.moveSet = new MoveSet();
    }

    //getter e setter dei vari valori
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMonsterHealtPoints() {
        return monsterHealtPoints;
    }

    public void setMonsterHealtPoints(int monsterHealtPoints) {
        this.monsterHealtPoints = monsterHealtPoints;
    }

    public int getMonsterAbilityPoints() {
        return monsterAbilityPoints;
    }

    public void setMonsterAbilityPoints(int monsterAbilityPoints) {
        this.monsterAbilityPoints = monsterAbilityPoints;
    }

    public int getMonsterAttack() {
        return monsterAttack;
    }

    public void setMonsterAttack(int monsterAttack) {
        this.monsterAttack = monsterAttack;
    }

    public int getMonsterDefense() {
        return monsterDefense;
    }

    public void setMonsterDefense(int monsterDefense) {
        this.monsterDefense = monsterDefense;
    }
    public List<Ability> getAbilities() {
        return abilities;
    }

    public void addAbility(Ability ability) {
        abilities.add(ability);
    }

    public MoveSet getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(MoveSet moveSet) {
        this.moveSet = moveSet;
    }
// interfaccia Rideable

    @Override
    public void ride() {
        System.out.println("Riding the it.project1.monster");
    }
    //metodi astratti per danni e tipo di mostri
    public abstract String getType();

    public abstract double getDamageReductionFromFlying();

    public abstract double getDamageReductionFromElemental(Element element);

    public boolean isFlying() {
        return this instanceof FlyingMonster;
    }

    public boolean isElemental() {
        return this instanceof ElementalMonster;
    }

    public boolean isNormal() {
        return this instanceof NormalMonster;
    }
}
    /* sotto ci sono vari tentativi di codice
        private String name;
        private int level;
        private int monsterHealthPoints;
        private int monsterAbilityPoints;
        private int monsterAttack;
        private int monsterDefense;
        private MonsterClass monsterClass;
        private List<String> abilities;
        private MoveSet moveSet;
        private List<String> abilities = new ArrayList<>();
    */
/*
    public int getId() {
        return id;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void addAbility(String ability) {
        abilities.add(ability);
    }
*/





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