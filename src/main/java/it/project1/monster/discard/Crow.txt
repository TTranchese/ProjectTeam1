package it.project1.monster;

public class Crow extends Monster implements FlyingMonster {
    public Crow(String name, int level, int monsterHealtPoints, int monsterAbilityPoints, int monsterAttack, int monsterDefense) {
        super(name, level, monsterHealtPoints, monsterAbilityPoints, monsterAttack, monsterDefense);
    }
    @Override
    public String getType() {
        return "Flying";
    }

    @Override
    public double getDamageReductionFromFlying() {
        return 0;
    }

    @Override
    public double getDamageReductionFromElemental(Element element) {
        return 0;
    }
}