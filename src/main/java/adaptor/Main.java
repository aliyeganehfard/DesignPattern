package adaptor;

public class Main {
    public static void main(String[] args) {

        /*
           در واقع adaptor اجازه میدهد دو تا object که به هم مربوط نیستند و سازگاری ندارند
           اجازه میدهد با یک دیگر کا کنند
           این الگو اجازه میدهد که کلاس های ناسازگار از قابلیت های هم استفاده کنند
        */
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck...");
        toyDuck.squeak();


        System.out.println("BirdAdapter...");
        birdAdapter.squeak();
    }
}
