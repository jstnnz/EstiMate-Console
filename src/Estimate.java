package src;

/**
 * Manages a list of ProjectItem objects for an estimate.
 * Demonstrates polymorphism and array management.
 */
public class Estimate {
    private ProjectItem[] items;
    private int itemCount;
    private static final int INITIAL_SIZE = 10;

    public Estimate() {
        items = new ProjectItem[INITIAL_SIZE];
        itemCount = 0;
    }

    /**
     * Add a ProjectItem to the estimate.
     * Resizes array if needed.
     */
    public void addItem(ProjectItem item) {
        if (itemCount == items.length) {
            // Resize array
            ProjectItem[] newItems = new ProjectItem[items.length * 2];
            for (int i = 0; i < items.length; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[itemCount++] = item;
    }

    /**
     * Get all items in the estimate.
     */
    public ProjectItem[] getItems() {
        ProjectItem[] result = new ProjectItem[itemCount];
        for (int i = 0; i < itemCount; i++) {
            result[i] = items[i];
        }
        return result;
    }

    /**
     * Get total cost of all items.
     */
    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getCost();
        }
        return total;
    }

    /**
     * Get a summary of all items.
     */
    public String getSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------------------\n");
        sb.append(String.format("%-15s | %8s | %10s | %10s\n", "Item", "Qty/Hrs", "Rate/Cost", "Total"));
        sb.append("-------------------------------------------------------------\n");
        for (int i = 0; i < itemCount; i++) {
            sb.append(items[i].getSummary()).append("\n");
        }
        sb.append("-------------------------------------------------------------\n");
        sb.append(String.format("%-36s | %10.2f\n", "TOTAL", getTotalCost()));
        sb.append("-------------------------------------------------------------\n");
        return sb.toString();
    }
}
