package Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    List<Order> findAll();
    Order findById(Integer id);
    void saveOrUpdate(Optional order);
    void delete(Integer id);

}
