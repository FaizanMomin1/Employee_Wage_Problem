public class uc5 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int Emp_RATE_PER_HR=20;
    public static final int NO_OF_WORKING_DAYS=20;

    public static void main(String[] args) {
        // calculate wages for a month assuming 20 working days in a month
        int min=0;
        int max=2;

        int emphr=0;

        int Emp_wage=0,totalEmployee=0;


        for(int day=0;day<NO_OF_WORKING_DAYS;day++){
            int num1=(int) (Math.random()*(max-min+1)+min);

            switch(num1){
                case IS_FULL_TIME:
                    System.out.println("employee present at fulltime work");
                    emphr=8;

                    break;

                case IS_PART_TIME:

                    System.out.println("employee part time work");
                    emphr=4;

                    break;

                default:
                    emphr=0;

            }
            Emp_wage =  Emp_RATE_PER_HR * emphr;
            totalEmployee +=  Emp_wage;
            System.out.println("Employee wage  is :"+Emp_wage);

        }
        System.out.println("Total Employee Wage :"+ totalEmployee );


    }
}