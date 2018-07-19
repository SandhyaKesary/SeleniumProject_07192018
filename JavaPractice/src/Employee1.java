
  public class Employee1 {
	
	int empno;
	String empname;
	double sal;
	char Gender;
	
	Employee1(){
		
		empno = 345;
		empname = "Sandhya";
		sal = 10000000.00;
	}
	
	Employee1(int a,String b, double c){
		empno = a;
		empname = b;
		sal = c;
	}
	
	Employee1(int empno,String empname,char Gender){
		this.empno = empno;
		this.empname = empname;
		this.Gender = Gender;
	}
	
	
	public void getData() {
		System.out.println(empno+"    "+empname+ "    "+ sal);
	}
	
	public void getData1() {
		System.out.println(empno+"    "+empname+"      "+Gender);
	}
	
	public static void main(String[] args) {
		
		Employee1 e = new Employee1();
		Employee1 e1 = new Employee1(478,"Bharadwaj",45888.25);
		Employee1 e2 = new Employee1(589,"java",'F');
		e.getData();
		e1.getData();
		e2.getData1();
		
		
	}

}


