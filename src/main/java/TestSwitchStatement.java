public class TestSwitchStatement {

    public static void main(String[] args) {
        Weekday day =  Weekday.Monday;
        switch (day) {
            case Tuesday:
                System.out.println("It's Tuesday");
                break;
            case Wednesday:
                System.out.println("It's Wednesday");
                break;
//            default:
//                System.out.println("Looking forward to the Weekend");
        }
    }
}



