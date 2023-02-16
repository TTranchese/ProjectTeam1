package monster;

public interface FlyingMonster {
    double FLYING_DAMAGE_REDUCTION = 0.05;

    default double getDamageReductionFromFlying() {
        return FLYING_DAMAGE_REDUCTION;
    }
}