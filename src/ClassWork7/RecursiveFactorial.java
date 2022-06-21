package ClassWork7;

public class RecursiveFactorial {
    int calculateFactorial(int n) {
        int result;

        if (n == 1) return 1;
        result = calculateFactorial(n-1) * n;
        return result;
    }
}
