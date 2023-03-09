/**
 * @author Figuccia
 */

package it.project1.monster;

public class BirdMonster extends Monster {
    public BirdMonster(String name, int level, int monsterHealtPoints, int monsterAbilityPoints, int monsterAttack, int monsterDefense) {
        super(name, level, monsterHealtPoints, monsterAbilityPoints, monsterAttack, monsterDefense);
    }

    @Override
    public String getType() {
        return null;
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