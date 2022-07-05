package ClassWork9.overriding;

public class overrideDemo {
    public static void main(String[] args) {
        B subObject = new B(1, 2,3);

        subObject.show();

        A tempA;
        tempA = subObject;

        tempA.show();

        Super superObject = new Super();
        Sub1 sub1Object = new Sub1();
        Sub2 sub2Object = new Sub2();

        Super superReference;

        superReference = superObject;
        superReference.who();

        superReference = sub1Object;
        superReference.who();

        superReference = sub2Object;
        superReference.who();
    }
}
