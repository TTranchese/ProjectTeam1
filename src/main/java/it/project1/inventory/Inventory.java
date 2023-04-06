package it.project1.inventory;

public class Inventory {

    private int id;
    private int idOwner;
    private int idItem;
    private int quantity;
    private boolean isEquipped;

    public Inventory(int id, int idOwner, int idItem, int quantity, boolean isEquipped) {
        this.id = id;
        this.idOwner = idOwner;
        this.idItem = idItem;
        this.quantity = quantity;
        this.isEquipped = isEquipped;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }
}
