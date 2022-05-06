package arraylistAndHashmaps;
import java.math.*;
public class totalSalary {
    public static int totalSalary(int Basic, char grade){
        double Basic2 =(double) Basic;
        double total1=0;
        double hra = (20 * Basic2 / 100) ;
        System.out.println(Basic2);
        System.out.println(hra);
        double da = (50 * Basic2 / 100);
        System.out.println(da);
        double allowance = 0.0;
        if(grade == 'A'){
            allowance = 1700.00;
        }else if(grade == 'B'){
             allowance = 1500.00;
        }else{
             allowance = 1300.00;
        }
        System.out.println(allowance);
        double pf = (11 * Basic2/100);
        System.out.println(pf);

        double total = (Basic2 + hra + da + allowance - pf);
        System.out.println(total);

        System.out.println(Math.ceil(total));

        double diff = total - (Math.floor(total))  ;
        System.out.println(diff);
        if(diff >= 0.50){
            total = Math.ceil(total);
        }else{
           total = Math.floor(total);
        }

        return (int) total;
    }


    public static void main(String args[]){
        int basic = 1775 ;
        char grade = 'A';
        int total = totalSalary(basic,grade);
        System.out.println(total);

    }
}
