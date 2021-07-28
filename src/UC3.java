public class UC3 {
    private static final int FULL_TIME=0;
    private static final int PART_TIME=1;
    private static final int FullTimeHour=8;
    private static final int PartTimeHour=4;
    private static final int WagePerHour=20;

    public static void main(String[] args) {

        int num = (int) Math.floor((Math.random() *10 ) % 2);   // Generate Random Number either 0 or 1
        System.out.println(num);
        if(num == FULL_TIME)  {                 // 0 -> FullTime Employee
            int sum =FullTimeHour*WagePerHour;
            System.out.println("FullTime Employee Wage Per Day = "+ sum);
        }
        else if(num == PART_TIME) {             // 1 -> PartTime Employee
            int sum =PartTimeHour*WagePerHour;
            System.out.println("PartTime Employee Wage Per Day = "+ sum);
        }
        else
            System.out.println("Some Thing Went Wrong");
    }
}