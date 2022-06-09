public class SwitchDemo {
    public static void main(String[] args) {

        int i;

        for (i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is equal with 0");
                    break;
                case 1:
                    System.out.println("i is equal with 1");
                    break;
                case 2:
                    System.out.println("i is equal with 2");
                    break;
                case 3:
                    System.out.println("i is equal with 3");
                    break;
                case 4:
                    System.out.println("i is equal with 4");
                    break;
                default:
                    System.out.println("i is equal or is higher than 5");
            }
        }
    }
}
