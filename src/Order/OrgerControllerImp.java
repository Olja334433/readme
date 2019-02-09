package Order;

import Buyer.Buyer;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.HashMap;
import java.util.Map;

public class OrgerControllerImp extends Order implements OrderController  {

    private Map<Integer , Order> orders = new HashMap<Integer, Order>();

    public OrgerControllerImp(int id, Buyer buyer, String orderStatus, Map<Integer, Order.Order> allOreders) {
        super(id, buyer, orderStatus, allOreders);
    }

    @Override
    public void orderCreation() {

    }

    @Override
    public void getAllOrders() {

    }

    @Override
    public void orederStatusChange() {

    }

    @Override
    public void registration(String name, String address) {

    }

    @Override
    public void getListByer() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void getAllProduct() {

    }

    @Override
    public void editProduct() {

    }
}
