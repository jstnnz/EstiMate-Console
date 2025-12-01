package src;

public class Labor extends ProjectItem {
    private double hourlyRate;
    private double hours;

    public double getHourlyRate() {
        return hourlyRate;
    }


    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Hourly rate must be positive.");
        }
        this.hourlyRate = hourlyRate;
    }


    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("Hours must be positive.");
        }
        this.hours = hours;
    }

    @Override
    public double getCost() {
        return hourlyRate * hours;
    }

    @Override
    public String getSummary() {
        return String.format("%-15s | %8.2f | %10.2f | %10.2f", getName(), hours, hourlyRate, getCost());
    }
}

