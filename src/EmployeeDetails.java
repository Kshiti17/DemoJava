import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDetails {
	
	int empid;
	String empName;
	
////	EmployeeDetails(int empid,String empName){
//		this.empid = empid;
//		this.empName = empName;
//		System.out.println(empName+" "+empid);
//	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.setEmpid(444);
		emp1.setEmpName("Rakesh");
		
		
		ArrayList<String> array1 = new ArrayList<String>();
		
		
		array1.add("B");
		array1.add("C");
		array1.add("N");
		array1.add("D");

		Iterator it = array1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		ArrayList<EmployeeDetails> array2 = new ArrayList<EmployeeDetails>();
		
		EmployeeDetails emp2 = new EmployeeDetails();
		EmployeeDetails emp3 = new EmployeeDetails();
		EmployeeDetails emp4 = new EmployeeDetails();
		
		array2.add(emp2);
		array2.add(emp3);
		array2.add(emp4);
		array2.add(emp1);
		for (EmployeeDetails emp: array2)
		{
			System.out.println(emp.getEmpName());
		}
		
		
		
		
		
		
	}





	public int getEmpid() {
		return empid;
	}





	public void setEmpid(int empid) {
		this.empid = empid;
	}





	public String getEmpName() {
		return empName;
	}





	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
