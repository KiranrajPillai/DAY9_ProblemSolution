public class UC7 {
    static int FULL_TIME=0;
    static int PART_TIME=1;
    static int EmpHours=0;
    static int WagePerHour=20;
    static int TotalWorkingDays=0;
    static int TotalWorkingHours=0;
    static int Max_Hours=100;
    static int Max_Working_Days=20;

    // Initialize class Method calculWageMonth
    public static int calculWageMonth () {

        while (TotalWorkingHours  < Max_Hours && TotalWorkingDays <= Max_Working_Days) {
            TotalWorkingDays++;
            int num = (int) Math.floor((Math.random() *10 ) % 2);
            System.out.println(num);
            if(num == FULL_TIME)  // 0 -> Employee FullTime Present
            {
                EmpHours=8;
            }
            else if(num == PART_TIME)  // 1 -> Employee PartTime Present
            {
                EmpHours=4;
            }
            else
                System.out.println("Went Wrong");
            TotalWorkingHours += EmpHours;
            System.out.println("TotalWorkingHours = "+TotalWorkingHours);
        }
        return TotalWorkingHours;
    }

    public static void main(String[] args) {

        // Print the Employee Total Wage
        calculWageMonth();
        int TotalEmpWage=TotalWorkingHours*WagePerHour;
        System.out.println("TotalEmpWage = "+TotalEmpWage);
    }
}

