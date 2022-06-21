package ClassWork7;

public class HorseHouse {
    public static void main(String[] args) {
        MyHorse unknown = new MyHorse();
        MyHorse knownHorse = new MyHorse("Greta");
        MyHorse knownHorse2 = new MyHorse("Grethren", 5);

        System.out.println(unknown);
        System.out.println(knownHorse);
        System.out.println(knownHorse2);
    }
}
