package Task4.shields;

public class ArcherShield implements Shield {
    public ArcherShield() {
    }

    @Override
    public int protection() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("лучника: %d ", protection());
        }
    }
