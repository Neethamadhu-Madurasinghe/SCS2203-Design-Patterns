package Builder;

import java.util.ArrayList;
import java.util.List;

public class CarSale {
    List<Vehicle> carList = new ArrayList<Vehicle>();

    public void addVehicle(Vehicle vehi) {
        carList.add(vehi);
    }

    public float getTotalValue() {
        float totalValue = 0.0f;
        for(Vehicle vehi : carList) {
            totalValue += vehi.price();
        }

        return totalValue;
    }

    public void showVehicles() {
        for(Vehicle vehi : carList) {
            System.out.println("Vehicle Model: " + vehi.model() + " Vehicle Price: " + vehi.price()
                    + " Suspention Type: " + vehi.suspention().getType());
        }
    }
}
