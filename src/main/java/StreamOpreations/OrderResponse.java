package StreamOpreations;

public class OrderResponse {
    private int customerId;
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public OrderResponse(int customerId,double amount) {
        this.customerId = customerId;
        this.amount = amount;
    }


}
