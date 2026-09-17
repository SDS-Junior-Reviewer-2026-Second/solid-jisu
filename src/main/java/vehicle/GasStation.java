package vehicle;

public class GasStation {
    public void refuel(Vehicle vehicle){
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }
}
