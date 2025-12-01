package src;

public class Material extends ProjectItem {
    private double unitCost;

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        if (unitCost <= 0) {
            throw new IllegalArgumentException("Unit cost must be positive.");
        }
        this.unitCost = unitCost;
    }

    @Override
    public double getCost() {
        return getQuantity() * unitCost;
    }

    @Override
    public String getSummary() {
        return String.format("%-15s | %8.2f | %10.2f | %10.2f", getName(), getQuantity(), unitCost, getCost());
    }
}

