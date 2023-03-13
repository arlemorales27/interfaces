package ejemplo2;
/*Ejemplo del mundo real: Consideremos el ejemplo de vehículos como bicicleta,
        automóvil, bicicleta………, tienen funcionalidades comunes. Así que hacemos
        una interface y ponemos todas estas funcionalidades comunes. Y permite que
        Bicycle, Bike, car...etc implementen todas estas funcionalidades en su propia
        clase a su manera.*/
interface Vehicle {

    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    public int speed;
    public int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

class Bike implements Vehicle {
    public int speed;
    public int gear;

    // to change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

}
class GFG {
    public static void main (String[] args) {

        // creating an instance of Bicycle
        // doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bicycle.printStates();

        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state :");
        bike.printStates();
    }
}

