package shoppingcart1;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class LinkedlistmodelEx {
	public static void main(String[] args)
	{
LinkedList<Emp1> list=new LinkedList<Emp1>();
list.add(new Emp1("tim",3000));
list.add(new Emp1("tom",2000));
list.add(new Emp1("thm",8000));
list.add(new Emp1("tdm",3600));

Collections.sort(list,new MySalaryComp());
System.out.println("sorted list");
for(Emp1 e: list)
{
	System.out.println(e);
}	
	} 
}
 class MySalaryComp implements Comparator<Emp1>{
	 public int compare(Emp1 e1,Emp1 e2){
		 if(e1.getSalary()<e2.getSalary()){
			 return 1;
		 }
		 else{
			 return -1;
		 }
	 }
 }
class Emp1 {
		private String name;
		private int salary;
		public Emp1(String n,int s)
		{
			this.name=n;
			this.salary=s;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String toString()
		{
			return "Name:"+this.name+"--Salary:"+this.salary;
		}
}
