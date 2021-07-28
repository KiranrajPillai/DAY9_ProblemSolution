public class UC6 {

    // Declaration part
    private static final int FULL_TIME=0;
    private static final int PART_TIME=1;
    private static final int WagePerHour=20;
    private static final int Max_Hours=100;
    private static final int Max_Working_Days=20;
    private static int EmpHours=0;
    private static int TotalWorkingDays=0;
    private static int TotalWorkingHours=0;

    public static void main(String[] args) {

        // Loop continue until reach Max_Hours=100 and Max_Working_Days=20
        while (TotalWorkingHours <= Max_Hours && TotalWorkingDays < Max_Working_Days) {
            TotalWorkingDays++;
            int num = (int) Math.floor((Math.random() *10 ) % 2);
            System.out.println(num);
            if(num == FULL_TIME) {  // 0 -> Employee FullTime Present
                EmpHours=8;
            }
            else if(num == PART_TIME) {  // 1 -> Employee PartTime Present
                EmpHours=4;
            }
            else
                System.out.println("Went Wrong");
            TotalWorkingHours += EmpHours;
            System.out.println("TotalWorkingHours = "+TotalWorkingHours);
        }
        int TotalEmpWage=TotalWorkingHours*WagePerHour;
        System.out.println("TotalEmpWage = "+TotalEmpWage);
    }
}
