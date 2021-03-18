package FleetOfThings;
// - Create a fleet of things to have this output:
// 1. [ ] Get milk
// 2. [ ] Remove the obstacles
// 3. [x] Stand up
// 4. [x] Eat lunch

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing getMilk = new Thing("Get Milk");
        Thing removeObstacles = new Thing("Remove Obstacles");
        Thing standUp = new Thing("Stand up");
        standUp.complete();
        Thing eachLunch = new Thing("Eat Lunch");
        eachLunch.complete();
        fleet.add(getMilk);
        fleet.add(removeObstacles);
        fleet.add(standUp);
        fleet.add(eachLunch);
        fleet.printTheFleet();
    }
}
