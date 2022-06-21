package ClassWork7;

public class PassObject {
    public static void main(String[] args) {

        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 has the same size as ob2: "
                + ob1.sameBlock(ob2));
        System.out.println("ob1 has the same size as ob3: "
                + ob1.sameBlock(ob3));
        System.out.println("ob2 has the same size as ob3: "
                + ob2.sameVolume(ob3));
    }
}
