import java.util.ArrayList;


public class InterfacesTest {

    public static void main(String[] args){

        // Use traditional method to declare object
        Car oCar1 = new Car();
        // -- OR --
        // Use interface to declare object
        IMotorVehicle oCar2 = new Car();
        // But...
        // oCar1 can call methods unique to car, and oCar2 can't... see below:
        boolean b4Door;
        b4Door = oCar1.is4Door();   // Works because oCar11 is declared as Car type.
        //b4Door = oCar2.is4Door(); // Doesn't work because oCar2 is declared as IMotorVehicle type.

        // but... we can cast oCar2 into a car type specifically...
        if(oCar2 instanceof Car){

            // Cast oCar2 into car variable.
            Car oCar3 = (Car)oCar2;

            System.out.println("oCar2 has been cast to Car type ... is4Door = " + oCar3.is4Door());
        }

        IMotorVehicle oMotorcycle1 = new MotorCycle();

        // Create an ArrayList that holds IMotorVehicle types.
        // Add oCar1, oCar2, and oMotorcycle1 to the ArrayList
        ArrayList<IMotorVehicle> oArraylst = new ArrayList<>();
        oArraylst.add(oCar1);
        oArraylst.add(oCar2);
        oArraylst.add(oMotorcycle1);

        // for each loop of ArrayList, format: for(declare variable of type in list ':' array list name)
        // easy way to loop through loop without a counting index
        for(IMotorVehicle oVehicle: oArraylst){

            System.out.println("result of starting: " + oVehicle.start());

            if(oVehicle instanceof MotorCycle){
                                                                            // Casts oVehicle to MotorCycle type
                System.out.println("Motorcycle found and hasWindSheild = " + ((MotorCycle) oVehicle).hasWindSheild());
            }
        }
    }
}
