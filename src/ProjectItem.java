package src;

/**
 * Abstract base class for estimable project items.
 * Demonstrates abstraction and encapsulation.
 */
public abstract class ProjectItem {
    private String name;
    private double quantity;

    /**
     * Get the item name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the item name.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name.trim();
    }

    /**
     * Get the quantity.
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Set the quantity (must be positive).
     */
    public void setQuantity(double quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }
        this.quantity = quantity;
    }

    /**
     * Get the total cost for this item.
     */
    public abstract double getCost();

    /**
     * Get a summary string for this item.
     */
    public abstract String getSummary();
}
