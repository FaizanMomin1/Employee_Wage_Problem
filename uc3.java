public class uc3 {
    public static void main(String[] args) {
        int min=0;
        int max=1;
        int Wage_perhr=20;
        int Is_parttimehr=4;
        int Full_hr=8;
        int Emp_wage=0;
        int num=(int) (Math.random()*(max-min+1)+min);
        if(num==1){
            System.out.println("employee present at fulltime work");
            Full_hr=8;
            Emp_wage= Wage_perhr * Full_hr;
            System.out.println("Employee daily wage is :"+Emp_wage);


        }
        else{
            System.out.println("employee part time work");
            Is_parttimehr=4;
            Emp_wage= Wage_perhr * Is_parttimehr;
            System.out.println("Employee daily wage is :"+Emp_wage);
        }



    }
}

