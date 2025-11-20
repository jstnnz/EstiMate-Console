package src;

/**
 * Labor item for estimation.
 * Demonstrates inheritance and encapsulation.
 */
public class Labor extends ProjectItem {
    private double hourlyRate;
    private double hours;

    /**
     * Get the hourly rate.
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * Set the hourly rate (must be positive).
     */
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate must be positive.");
        }
        this.hourlyRate = hourlyRate;
    }

    /**
     * Get the hours worked.
     */
    public double getHours() {
        return hours;
    }

    /**
     * Set the hours worked (must be positive).
     */
    public void setHours(double hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("Hours must be positive.");
        }
        this.hours = hours;
    }

    /**
     * Get total cost for labor.
     */
    @Override
    public double getCost() {
        return hourlyRate * hours;
    }

    /**
     * Get summary string for labor.
     */
    @Override
    public String getSummary() {
        return String.format("%-15s | %8.2f | %10.2f | %10.2f", getName(), hours, hourlyRate, getCost());
    }
}
