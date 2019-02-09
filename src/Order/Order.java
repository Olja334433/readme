package Order;

import Buyer.Buyer;
import Buyer.BuyerController;
import Product.ProductController;

import java.util.HashMap;
import java.util.Map;

public class Order {
 private int id;
private Buyer buyer;
private String orderStatus;
    //лист заказазов
    private Map<Integer , Order> allOreders= new HashMap<Integer, Order>();

    public Order(int id, Buyer buyer, String orderStatus, Map<Integer, Order> allOreders) {
        this.id = id;
        this.buyer = buyer;
        this.orderStatus = orderStatus;
        this.allOreders = allOreders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Buyer.Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer.Buyer buyer) {
        this.buyer = buyer;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Map<Integer, Order.Order> getAllOreders() {
        return allOreders;
    }

    public void setAllOreders(Map<Integer, Order.Order> allOreders) {
        this.allOreders = allOreders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", buyer=").append(buyer);
        sb.append(", orderStatus='").append(orderStatus).append('\'');
        sb.append(", allOreders=").append(allOreders);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (buyer != null ? !buyer.equals(order.buyer) : order.buyer != null) return false;
        if (orderStatus != null ? !orderStatus.equals(order.orderStatus) : order.orderStatus != null) return false;
        return allOreders != null ? allOreders.equals(order.allOreders) : order.allOreders == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (allOreders != null ? allOreders.hashCode() : 0);
        return result;
    }
}
