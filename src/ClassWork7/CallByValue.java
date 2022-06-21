package ClassWork7;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        int a = 15;
        int b = 20;

        System.out.println("Object's fields a & b before call: " + ob.a + " " + ob.b);
        System.out.println("Primitives a & b before call: " + a + " " + b);
        ob.change(ob);
        ob.noChange(a, b);
        System.out.println("Object's fields a & b after call: " + ob.a + " " + ob.b);
        System.out.println("Primitives a & b after call: " + a + " " + b);
    }
}
