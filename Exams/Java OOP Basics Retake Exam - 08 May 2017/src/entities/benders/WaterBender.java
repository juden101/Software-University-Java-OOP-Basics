package entities.benders;

import abstract_classes.BaseBender;

public class WaterBender extends BaseBender {
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.waterClarity = waterClarity;
    }

    @Override
    public double calculatePower() {
        return super.getPower() * this.waterClarity;
    }

    @Override
    public String toString() {
        return String.format("###Water Bender: %s, Power: %d, Water Clarity: %.2f",
                super.getName(), super.getPower(), this.waterClarity);
    }
}
