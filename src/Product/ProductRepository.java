package Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Integer id);
    void saveOrUpdate(Product product);
    void delete(Integer id);

}
