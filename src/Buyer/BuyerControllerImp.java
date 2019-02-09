package Buyer;

import java.util.HashMap;
import java.util.Map;

public class BuyerControllerImp  implements BuyerController {
  private Map<Integer , Buyer> users = new HashMap<Integer, Buyer>();

    @Override
    public void registration( String name , String address) {
        int count = 0;
        if (users.isEmpty()) {
            count++;
        }
        else {
            int max = 0;
            for(Integer key: users.keySet()) {
                if (max < key) {
                    max = key;
                }
            }
            count = max;
        }
        Buyer buyer = new Buyer(name ,address);

        users.put(count, buyer);


    }

    @Override
    public void getListByer() {

    }
}

