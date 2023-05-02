package it.project1.monster;

import jakarta.persistence.*;

@Entity
@Table(name = "monsters")
public class MonsterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "monster_id")
    private int monsterId;
    @Column(name = "name")
    private String name;
    @Column(name = "m_level")
    private int m_level;
    @Column(name = "type")
    private String Type;
    @Column(name = "element")
    private String Element;


    public MonsterEntity() {
    }

    public MonsterEntity(int monsterId, String name, int m_level, String Type, String Element) {
        this.monsterId = monsterId;
        this.name = name;
        this.m_level = m_level;
        this.Type = Type;
        this.Element = Element;
    }

    public int getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(int monsterId) {this.monsterId = monsterId;}

    public String getMonsterName() {
        return name;
    }

    public void setMonsterName(String name) {
        this.name = name;
    }

    public int getMonsterLevel() {
        return m_level;
    }

    public void setMonsterLevel(int level) {
        this.m_level = level;
    }

    public String getMonsterType() {
        return Type;
    }

    public void setMonsterType(String type) {
        this.Type = type;
    }

    public String getMonsterElement() {
        return Element;
    }

    public void setMonsterElement(String element) {
        this.Element = element;
    }
}

