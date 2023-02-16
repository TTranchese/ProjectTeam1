package monster;

public interface ElementalMonster {
    double ELEMENTAL_DAMAGE_REDUCTION = 0.5;

    default double getDamageReductionFromElemental(Element element) {
        return element == getElement() ? ELEMENTAL_DAMAGE_REDUCTION : 0;
    }

    Element getElement();
}