package ClassWork6;

public class ArrayUtils {

    int i;

    ArrayUtils(int i) {
        this.i = i;
    }

    void demonstrateArray(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            System.out.println("Element [" + i + "]:" + arr[i]);
        }
        System.out.println("this was array of integers");
    }

    void demonstrateArray(String[] arr) {
        for (int i = 0; i< arr.length; i++) {
            System.out.println("Element [" + i + "]:" + arr[i]);
        }
        System.out.println("this was array of strings");
    }

     void sumSmth(int a, int b) {
        System.out.println(a+ b);
    }

    int sumSmth2(int a, int b) {
        return a+b;
    }

}
