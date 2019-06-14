public class Car implements IMotorVehicle {


    // Reason for @Override: Won't compile if interface DOESN'T have this method,
    // so protects programmer from misspelling, etc.
    @Override
    public boolean start() {
        return true;
    }

    @Override
    public boolean stop() {
        return true;
    }

    public boolean is4Door() {
        return true;
    }
}
