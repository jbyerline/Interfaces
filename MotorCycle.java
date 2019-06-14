public class MotorCycle implements IMotorVehicle{


    @Override
    public boolean start() {
        return true;
    }

    @Override
    public boolean stop() {
        return true;
    }

    public boolean hasWindSheild(){
        return true;
    }
}
