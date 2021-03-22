package Aircrafts;

public class Main {
    public static void main(String[] args) {
        PlaneF35 planeF35 = new PlaneF35();
        PlaneF16 planeF16 = new PlaneF16();

       //planeF16.refill(20);
       // planeF35.refill(20);
        //planeF16.fight(planeF35);
        //planeF16.refill(20);
        //planeF16.fight(planeF35);
        Carrier carrier = new Carrier();
        carrier.add(planeF16);
        carrier.add(planeF35);
        carrier.refillCarrier();
        //carrier.printCarrier();

        PlaneF16 planeF161 = new PlaneF16();
        PlaneF35 planeF351 = new PlaneF35();
        Carrier carrier1 = new Carrier();

        carrier1.add(planeF161);
        carrier1.add(planeF351);
        carrier.fightCarrier(carrier1);
        carrier1.getStatusCarrier();
        carrier.getStatusCarrier();

    }
}
