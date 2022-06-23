package ClassWork8;

public class Outer {

    int nums[];

    Outer(int[] nums) {
        this.nums = nums;
    }

    void analyze() {
        Inner inOb = new Inner();
        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());
    }

    class Inner {
        int min() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
            if (nums[i] < m) m = nums[i];
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++)
            if (nums[i] > m) m = nums[i];
            return m;
            }

        int avg() {
            int a = 0;
            for (int i = 1; i < nums.length; i++)
            a += nums[i];
            return  a / nums.length;
        }
    }
}
