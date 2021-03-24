import com.greenfoxacademy.animals.Bird;
import com.greenfoxacademy.animals.Mammal;
import com.greenfoxacademy.animals.Reptile;

public class Zoo {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Bird bird = new Bird();
        Reptile reptile = new Reptile();

        mammal.lifeCycle();
        bird.lifeCycle();
        reptile.lifeCycle();

        /*mammal.living();
        bird.living();
        reptile.living();


        mammal.eat();
        bird.eat();
        reptile.eat();

        mammal.breed();
        bird.breed();
        reptile.breed();

        mammal.lifeCycle();
        bird.lifeCycle();
        reptile.lifeCycle();*/

    }
}
