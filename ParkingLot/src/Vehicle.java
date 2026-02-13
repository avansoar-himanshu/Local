import Types.VehicleType;

abstract class Vehicle {
    private  String vehicleNumber;
    VehicleType vehicleType;

        public  Vehicle( String no,VehicleType type){
            this.vehicleNumber= no;
            this.vehicleType=type;
        }

        public  String getVehicleNumber(){
            return  vehicleNumber;
        }


    public VehicleType getType() {
        return vehicleType;
    }
}
