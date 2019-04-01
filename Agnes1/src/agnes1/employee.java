package agnes1;
import java.util.*;
public class employee {
	public int salary;
	public int tax;
	public String name;
	public int hour;
        public int type;
	public int gross;
	public int rssb;
	public int net;

	public static class month extends employee{
		public void employee1()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter salary per month");
			salary=in.nextInt();
			
		tax= (salary*30)/100;
		rssb=(salary*3)/100;
		net=salary-(tax+rssb);
		
		
		}
		
		
	}
	public static class week extends employee{
		public void employee2(){
			System.out.println("Enter salary per week");
			Scanner in = new Scanner(System.in);
			salary=in.nextInt();
			net=salary;
			
		}
	}
	public static class hour extends employee{
		
	public  int employee3(){
		System.out.println("Please enter number of hours");
		Scanner in = new Scanner(System.in);
		hour = in.nextInt();
		System.out.println("Please enter salary per hours");
		salary = in.nextInt();
		
		if(hour<=40){
		return(net = hour*salary);
		
		}
		else{
			return(net=(hour*salary)+((40-hour)*salary));
			
			
		}
	}
	}


	
	public  static void main(String[] args) {
		
		hour b = new hour();
        week c=new week();
        month d=new month();
		System.out.println("Please enter employeeloyee name:");
		Scanner in = new Scanner(System.in);
      b.name=in.nextLine();
        System.out.println("Please select type of employee according to type:");
        System.out.println("*************************************************");
        System.out.println("1.month");
        System.out.println("2.weekly");
	System.out.println("3.hour");
        b.type=in.nextInt();
        System.out.println("Emp name is "+b.name);
		if(b.type==1)
		{
			d.employee1();
			System.out.println("Emp Salary is: "+d.net);
			
		}
		else if(b.type==2){
			c.employee2();
			System.out.println("Emp Salary is: "+c.net);
		}
		else if(b.type==3){
		    b.employee3();
			System.out.println("Emp Salary is: "+b.net);
			
		}
		else{
			System.out.println("Invalid type!");
		}
                
		
		}
	
}
