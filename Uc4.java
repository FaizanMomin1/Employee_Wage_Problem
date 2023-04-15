public class Uc4 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int Emp_RATE_PER_HR=20;

    public static void main(String[] args) {
        int min=0;
        int max=2;
        int Wage_perhr=20;
        int emphr=0;

        int Emp_wage=0;

        int num=(int) (Math.random()*(max-min+1)+min);
        switch(num){
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
        Emp_wage =  Wage_perhr * emphr;
        System.out.println("Employee wage  is :"+Emp_wage);



    }

}