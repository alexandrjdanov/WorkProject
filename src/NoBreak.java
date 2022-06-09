public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is lower than 1");
                case 1:
                    System.out.println("i is lower than 2");
                case 2:
                    System.out.println("i is lower than 3");
                case 3:
                    System.out.println("i is lower than 4");
                case 4:
                    System.out.println("i is lower than 5");
                default:
                    System.out.println("default operator");
            }
            System.out.println();
        }
//        int z = 2;
//        switch (z) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Будний день");
//                break;
//            case 6:
//            case 7:
//                System.out.println("выходной");
//                break;
//            default:
//                System.out.println("Это не день недели");
//        }

//        char ch1 = 'A';
//        char ch2 = 'A';
//
//        switch (ch1) {
//            case 'A':
//                System.out.println("Это раздел А внешнего оператора switch");
//                switch (ch2) {
//                    case 'A':
//                        System.out.println("Это раздел А внутреннего оператора switch");
//                        break;
//                    case 'B':
//                        System.out.println("Это раздел B внутреннего оператора switch");
//                        break;
//                }
//                break;
//            case 'B':
//                System.out.println("Это раздел B внешнего оператора switch");
//        }
    }
}