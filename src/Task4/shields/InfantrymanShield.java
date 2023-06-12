package Task4.shields;

public class InfantrymanShield implements Shield {
    public InfantrymanShield() {
    }
    @Override
    public int protection() {
        return 10;
    }

    @Override
    public String toString() {
        return String.format("пехотинца: %d ", protection());
    }
}

