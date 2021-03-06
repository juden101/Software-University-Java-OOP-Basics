package classes;

import abstractClasses.Microbe;

public class Bacteria extends Microbe {
    public Bacteria(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }

    @Override
    public String getAdditionalProperty() {
        return "Virulence";
    }

    @Override
    public int getEnergy() {
        return (this.health + this.virulence) / 3;
    }

    @Override
    public String getSpecificCellType() {
        return "Bacteria";
    }
}
