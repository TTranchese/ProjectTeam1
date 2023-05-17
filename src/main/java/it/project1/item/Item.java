package it.project1.item;

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
    private int id;
    @Column(nullable = false)
    private String name;
    @Column
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
    @Column(nullable = false)
    private boolean isStackable;
    @Column(nullable = false)
    private String type;
    @Column
    private String subtype1;
    @Column
    private int subtype2;

}
