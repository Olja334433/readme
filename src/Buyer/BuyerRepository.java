package Buyer;

import java.util.List;

public interface BuyerRepository {
    List<Buyer> findAll();
    Buyer findById(Integer id);
    void saveOrUpdate(Buyer buyer);
    void delete(Integer id);
}
