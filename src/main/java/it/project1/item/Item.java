package it.project1.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.project1.inventory.Inventory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne(mappedBy = "item")
    private Inventory inventory;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @Check(constraints = "value > 0")
    @Column(nullable = false)
    private int value;
    @Column(nullable = false)
    @Check(constraints = "weight > 0")
    private int weight;
    @Column(nullable = false)
    private String rarity;
    @Column(nullable = false)
    private int requirements;
    @Column
    @Check(constraints = "durability > 0 AND durability <= 100")
    private int durability;
    @Column(nullable = false, name = "is_stackable")
    private boolean isStackable;
    @Column
    private int quantity;
    @Column(nullable = false)
    private boolean isEquipped;
    @JsonProperty(value = "isEquipped")
    public boolean isEquipped() {
        return isEquipped;
    }
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ItemType type;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ItemSubtype subtype1;
    @Column
    private int subtype2;
    @JsonProperty(value = "isStackable")
    public boolean isStackable() {
        return isStackable;
    }
}
