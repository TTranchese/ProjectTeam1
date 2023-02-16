/**
 * @author Figuccia
 */
package monster;

public abstract class Element {
    private final String name;
    private final double damageModifier;

    public Element(String name, double damageModifier) {
        this.name = name;
        this.damageModifier = damageModifier;
    }

    public String getName() {
        return name;
    }

    public double getDamageModifier() {
        return damageModifier;
    }
}