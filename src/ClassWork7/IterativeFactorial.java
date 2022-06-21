package ClassWork7;

public class IterativeFactorial {
    int calculateFactorial(int n) {
        int t;
        int result = 1;

        for (t=1; t<=n; t++) result *= t;
        return result;
    }
}
