package src;

/**
 * Material item for estimation.
 * Demonstrates inheritance and encapsulation.
 */
public class Material extends ProjectItem {
    private double unitCost;

    /**
     * Get the unit cost.
     */
    public double getUnitCost() {
        return unitCost;
    }

    /**
     * Set the unit cost (must be positive).
     */
    public void setUnitCost(double unitCost) {
        if (unitCost <= 0) {
            throw new IllegalArgumentException("Unit cost must be positive.");
        }
        this.unitCost = unitCost;
    }

    /**
     * Get total cost for material.
     */
    @Override
    public double getCost() {
        return getQuantity() * unitCost;
    }

    /**
     * Get summary string for material.
     */
    @Override
    public String getSummary() {
        return String.format("%-15s | %8.2f | %10.2f | %10.2f", getName(), getQuantity(), unitCost, getCost());
    }
}
