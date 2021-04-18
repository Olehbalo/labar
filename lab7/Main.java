import squeezer.Squeezer;

public class Main {
    public static void main(String[] args) {
        Squeezer strongSqueeze = new Squeezer();
        System.out.println(strongSqueeze);

        Squeezer forOrangeJuice = new Squeezer( 4, "white", "Haeger", 2400, "one hundret wat");
        System.out.println(forOrangeJuice);

        
        Squeezer pureJuice = new Squeezer( 3, "metallic", " SCARLETT", 3700, "two hundret wat");
        System.out.println(pureJuice);

        strongSqueeze.printobjectCountField();
        forOrangeJuice.printobjectCountField();
        pureJuice.printobjectCountField();

        Squeezer.printobjectCountField();

    }
}