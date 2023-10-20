
class Vehicle {

    private String vehicleType;
    private int vehicleWeight;
    private boolean loadUnload;
    // if LoadUnload = true = Full cargo
    // if LoadUnload = false = Empty

    @Override
    public String toString() {
        return "Type of Vehicle: " + vehicleType + " Weight: " + String.valueOf(vehicleWeight) + " KG ";
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


    public int getVehicleWeight() {
        return vehicleWeight;
    }
    public void setVehicleWeight(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }


    public void isLoadUnload(boolean loadUnload) {
        this.loadUnload = loadUnload;
    }

}

