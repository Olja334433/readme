package Order;

import Buyer.BuyerController;
import Product.ProductController;

public interface OrderController  extends BuyerController , ProductController{
   public void orderCreation();
 //  public void closeOrder();
  // public void count();
   public void getAllOrders();
   void orederStatusChange();
}
