package StreamOpreations.orders;

import java.awt.datatransfer.StringSelection;

public class OrderResponse {
    private int customerId;
    private double amount;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public OrderResponse(int customerId, double amount, String status) {
        this.customerId = customerId;
        this.amount = amount;
        this.status = status;
    }
    public OrderResponse(int customerId, double amount) {
        this.customerId = customerId;
        this.amount = amount;
    }

}
