package src;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Main application class for the Architecture Estimator.
 */
public class EstimatorApp {
    private static Estimate estimate = new Estimate();

    public static void main(String[] args) {
        showWelcome();
        boolean running = true;
        while (running) {
            showMenu();
            int choice = InputHelper.promptMenuOption("Select option: ", 1, 5);
            switch (choice) {
                case 1:
                    createNewEstimate();
                    break;
                case 2:
                    addItemMenu();
                    break;
                case 3:
                    viewSummary();
                    break;
                case 4:
                    saveEstimateToMarkdown();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting. Goodbye!");
                    break;
            }
        }
    }

    private static void showWelcome() {
        System.out.println("\n==============================");
        System.out.println(" ARCHITECTURE ESTIMATOR TOOL ");
        System.out.println("==============================\n");
    }

    private static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Create new estimate");
        System.out.println("2. Add item (Material/Labor)");
        System.out.println("3. View summary");
        System.out.println("4. Save estimate to markdown");
        System.out.println("5. Exit");
    }

    private static void createNewEstimate() {
        estimate = new Estimate();
        System.out.println("New estimate created.");
    }

    private static void addItemMenu() {
        System.out.println("Add Item:");
        System.out.println("1. Material");
        System.out.println("2. Labor");
        int type = InputHelper.promptMenuOption("Select item type: ", 1, 2);
        if (type == 1) {
            addMaterial();
        } else {
            addLabor();
        }
    }

    private static void addMaterial() {
        Material material = new Material();
        try {
            material.setName(InputHelper.promptString("Material name: "));
            material.setQuantity(InputHelper.promptPositiveDouble("Quantity: "));
            material.setUnitCost(InputHelper.promptPositiveDouble("Unit cost: "));
            estimate.addItem(material);
            System.out.println("Material added.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void addLabor() {
        Labor labor = new Labor();
        try {
            labor.setName(InputHelper.promptString("Labor name: "));
            labor.setHours(InputHelper.promptPositiveDouble("Hours: "));
            labor.setHourlyRate(InputHelper.promptPositiveDouble("Hourly rate: "));
            labor.setQuantity(labor.getHours()); // For summary alignment
            estimate.addItem(labor);
            System.out.println("Labor added.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewSummary() {
        System.out.println("\nEstimate Summary:");
        System.out.println(estimate.getSummary());
    }

    private static void saveEstimateToMarkdown() {
        String filename = "estimate_output.md";
        System.out.print("Saving estimate");
        for (int i = 0; i < 5; i++) {
            try { Thread.sleep(300); } catch (InterruptedException e) {}
            System.out.print(".");
        }
        System.out.println();
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("# Architecture Estimate\n\n");
            writer.write("```");
            writer.write("\n" + estimate.getSummary() + "\n");
            writer.write("```");
            System.out.println("Estimate saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
