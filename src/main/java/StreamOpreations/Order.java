package StreamOpreations;

public class Order {

    private int customerId;
    private String status;
    private double amount;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Order(int customerId, String status, double amount) {
        this.customerId = customerId;
        this.amount = amount;
        this.status = status;
    }
}
