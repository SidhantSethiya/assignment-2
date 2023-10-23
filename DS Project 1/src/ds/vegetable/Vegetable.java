package ds.vegetable;

public class Vegetable implements Comparable<Vegetable> {
    public enum Type {
        Capsicum,
        Tomato,
        Lettuce,
        Onion
    }

    private Type type;
    private double weight;
    private double ripeness;
    
    public class InvalidVegetableWeightException extends Exception {
        public InvalidVegetableWeightException(String message) {
            super(message);
        }
    }
    
    public class InvalidVegetableRipenessException extends Exception {
        public InvalidVegetableRipenessException(String message) {
            super(message);
        }
    }
    
 

    public Vegetable(Type type, double weight, double ripeness) throws InvalidVegetableWeightException, InvalidVegetableRipenessException {
        // Sanity checks for weight and ripeness
        if (weight < 0) {
            throw new InvalidVegetableWeightException("Invalid vegetable weight: " + weight);
        }
        if (ripeness < 0 || ripeness > 1) {
            throw new InvalidVegetableRipenessException("Invalid vegetable ripeness: " + ripeness);
        }
        
        this.type = type;
        this.weight = weight;
        this.ripeness = ripeness;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws InvalidVegetableWeightException {
        if (weight < 0) {
            throw new InvalidVegetableWeightException("Invalid vegetable weight: " + weight);
        }
        this.weight = weight;
    }

    public double getRipeness() {
        return ripeness;
    }

    public void setRipeness(double ripeness) throws InvalidVegetableRipenessException {
        if (ripeness < 0 || ripeness > 1) {
            throw new InvalidVegetableRipenessException("Invalid vegetable ripeness: " + ripeness);
        }
        this.ripeness = ripeness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vegetable vegetable = (Vegetable) o;

        if (Double.compare(vegetable.weight, weight) != 0) return false;
        if (Double.compare(vegetable.ripeness, ripeness) != 0) return false;
        return type == vegetable.type;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(ripeness);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Vegetable other) {
        // Implement comparison logic here
        // For example, you can compare based on type, weight, or ripeness
        // Return a negative value if this < other, 0 if they are equal, and a positive value if this > other
        // Example: Compare based on type first, then weight, and finally ripeness
        int typeComparison = this.type.compareTo(other.type);
        if (typeComparison != 0) {
            return typeComparison;
        }
        
        int weightComparison = Double.compare(this.weight, other.weight);
        if (weightComparison != 0) {
            return weightComparison;
        }
        
        return Double.compare(this.ripeness, other.ripeness);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "type=" + type +
                ", weight=" + weight +
                ", ripeness=" + ripeness +
                '}';
    }
}
