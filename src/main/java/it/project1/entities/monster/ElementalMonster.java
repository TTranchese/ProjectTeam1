package it.project1.entities.monster;

public interface ElementalMonster {
    double ELEMENTAL_DAMAGE_REDUCTION = 0.5;

    default double getDamageReductionFromElemental(Element element) {
        return element.equals(getElement()) ? ELEMENTAL_DAMAGE_REDUCTION : 0;
    }

    String getElement();
}