package ClassWork7;

public class Overload {
    void ovlDemo(){
        System.out.println("No parameters");
    }

    void ovlDemo(int a){
        System.out.println("One parameter: " + a);
    }

    void ovlDemo(int a1, int b1){
        System.out.println("Two parameters of integer type: " + a1 + " " + b1);
    }

    void ovlDemo(double a2, double b2){
        System.out.println("Two parameters of double type: " + a2 + " " + b2);
    }

    int ovlDemo(float a){
        System.out.println("One parameter: " + a);
        return (int)a;
    }
}
