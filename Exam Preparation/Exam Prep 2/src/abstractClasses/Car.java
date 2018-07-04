package abstractClasses;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsepower;
    private int acceleration;
    private int suspension;
    private int durability;

    public Car(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.horsepower = horsepower;
        this.acceleration = acceleration;
        this.suspension = suspension;
        this.durability = durability;
    }

    private String getBrand() {
        return this.brand;
    }

    private String getModel() {
        return this.model;
    }

    private int getYearOfProduction() {
        return this.yearOfProduction;
    }

    protected int getHorsepower() {
        return this.horsepower;
    }

    protected void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    private int getAcceleration() {
        return this.acceleration;
    }

    protected int getSuspension() {
        return this.suspension;
    }

    protected void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    private int getDurability() {
        return this.durability;
    }

    public abstract void tuneCar(int tuneIndex, String tuneAddOn);


    public String toString() {
        //“{brand} {model} {yearOfProduction}
        // {horsepower} HP, 100 m/h in {acceleration} s
        // {suspension} Suspension force, {durability} Durability”
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s %s %s", this.getBrand(), this.getModel(), this.getYearOfProduction()))
                .append(System.lineSeparator());
        sb.append(String.format("%s HP, 100 m/h in %s s", this.getHorsepower(), this.getAcceleration()))
                .append(System.lineSeparator());
        sb.append(String.format("%s Suspension force, %s Durability", this.suspension, this.durability))
                .append(System.lineSeparator());

        return sb.toString();
    }
}
