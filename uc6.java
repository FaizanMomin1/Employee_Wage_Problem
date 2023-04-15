public class uc6 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int Emp_RATE_PER_HR=20;
    public static final int NO_OF_WORKING_DAYS=20;
    public static final int MAX_HR_IN_MONTH=100;


    public static void main(String[] args) {
        int min=0;
        int max=2;

        int emphr=0,toatalemphr=0,totalworkingdays=0;




        while(toatalemphr <= MAX_HR_IN_MONTH && totalworkingdays < NO_OF_WORKING_DAYS ){
            totalworkingdays++;
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
            toatalemphr += emphr;
            System.out.println("day :"+totalworkingdays+ "hr :"+emphr);


        }
        int totalempwage = toatalemphr * Emp_RATE_PER_HR;
        System.out.println("Total Employee Wage :"+ totalempwage );

    }

}