public class UC1 {

    private static final int PRESENT = 1;

    public static void main(String[] args) {
        int Num = (int) Math.floor((Math.random() *10 ) % 2);
        if ( Num == PRESENT )  {  // Check Condition
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }
}

