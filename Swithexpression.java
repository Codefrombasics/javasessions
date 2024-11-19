public class Swithexpression {
    public static void main(String[] args) {
//        var a=(var x,var y)->x*2;
//        enum Month { JANUARY, FEBRUARY, MARCH,
//            APRIL, MAY, JUNE, JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER; }
//        Month month=Month.JUNEETH;
//        System.out.println(month);
//        int quarter = switch (month) {
//            case JANUARY, FEBRUARY, MARCH-> 1;
//
//            case  APRIL, MAY, JUNE -> 2;
//            case JULY,AUGUST,SEPTEMBER->3;
//            case OCTOBER,NOVEMBER,DECEMBER->4;
//            default -> {
//                throw new IllegalStateException("No Such Month"+month);
//            }
//        };
//        System.out.println(quarter);

        String loanType="JEWELLOAN";
        float interestRate=switch(loanType){
            case "HOMELOAN"->7.8f;
            case "PERSONALLOAN"->12.1f;
            case "CARLOAN"->14.3f;
            default -> {
                System.out.println("Unknown Loan Type");
                yield 0.0f;
            }
        };
        System.out.println(interestRate);
    }
}
