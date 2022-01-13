//  STUDENT MANAGEMENT SYSTEM  //  CRUD operation  //

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
	static ArrayList<Student> std=new ArrayList<Student>();
    public  int Id; String Name;String Quota; String Course; String Academy; String Sports; String place; String Des; String Exp;
	public Student(int Id, String Name, String Quota, String Course, String Academy, String Sports, String place, String Des, String Exp) 
	{
		super(); this.Id=Id; this.Name=Name; this.Quota=Quota;	this.Course=Course;  this.Academy=Academy; this.Sports=Sports; this.place=place; this.Des=Des; this.Exp= Exp;
	}
	
	public int getId(){
		return Id;
		}
	
	public String toString(){
		System.out.printf(" %10d %10S%10S%10S%10S%15S%15S%30S%20S %n", Id,Name,Quota,Course,Academy,Sports,place,Des,Exp);
		return Name;
	
		}
	
	//------------------------------------CREATE-----------------------------------------------//
	
		public static  void create()
		{
			
			std.add(new Student (1001,"AAA","MQ","BE-CSE","90%","NIL ","DELHI","SOFTWARE ENGINEER","1 YEARS"));
			std.add(new Student (1002,"BBB","GQ","BE-CSE","79%","CHESS","MUMBAI","SOFTWARE ENGINEER","2 YEARS"));
			std.add(new Student (1003,"CCC","GQ","BE-ECE","66%","CRICKET","CHENNAI","STUDENT","FRESHER"));
			std.add(new Student (1004,"DDD","GQ","BE-EEE","50%","BOXER","PUNJAB","STUDENT","FRESHER"));
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf(" %10s%10s%10s%10s%10s%10s%20s%30s%30s %n", "Std ID"," Name"," Quota","Course","Academy", "Sports ", "Place", "Designation", "Experience" );
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println(std);
			
			}
	//------------------------------------UPDATE-----------------------------------------------//	
	
		public static  void update()
		{
			Scanner add=new Scanner(System.in);
			System.out.println("Enter Id : ");                           
			int Id=add.nextInt();
			System.out.println("Enter Name : ");                      
			String Name=add.next();
			System.out.println("Enter Reservation : ");            
			String Quota=add.next();
			System.out.println("Enter Course : ");                    
			String Course=add.next();
			System.out.println("Enter Academy Report : ");    
			String  Academy=add.next();
			System.out.println("Enter Sports Report : ");        
			String Sports=add.next();
			System.out.println("Enter Place : ");                      
			String place=add.next();
			System.out.println("Enter Designation : ");           
			String Des=add.next();
			System.out.println("Enter Experience : ");            
			String Exp=add.next();

			create();
			System.out.printf(" %10d %10S%10S%10S%10S%15S%15S%30S%20S %n", Id,Name,Quota,Course,Academy,Sports,place,Des,Exp);
			
		}
	//------------------------------------READ-----------------------------------------------//	
		
		public static void read()
		{
			std.add(new Student (1001,"AAA","MQ","BE-CSE","90%","NIL ","DELHI","SOFTWARE ENGINEER","1 YEARS"));
			std.add(new Student (1002,"BBB","GQ","BE-CSE","79%","CHESS","MUMBAI","SOFTWARE ENGINEER","2 YEARS"));
			std.add(new Student (1003,"CCC","GQ","BE-ECE","66%","CRICKET","CHENNAI","STUDENT","FRESHER"));
			std.add(new Student (1004,"DDD","GQ","BE-EEE","50%","BOXER","PUNJAB","STUDENT","FRESHER"));
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Id :");
		int SId=sc1.nextInt();
		
		
		Iterator<Student> itr=std.iterator();
		while(itr.hasNext())
		{
			Student Std=itr.next();
			
			if(Std.getId()==SId)
			{
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.printf(" %10s%10s%10s%10s%10s%10s%20s%30s%30s %n", "Std ID"," Name"," Quota","Course","Academy", "Sports ", "Place", "Designation", "Experience" );
				System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
				
				System.out.println(Std);
				break;
			}
			
		}}

		//------------------------------------DELETE-----------------------------------------------//	
		
		public static void delete()
		{
			std.add(new Student (1001,"AAA","MQ","BE-CSE","90%","NIL ","DELHI","SOFTWARE ENGINEER","1 YEARS"));
			std.add(new Student (1002,"BBB","GQ","BE-CSE","79%","CHESS","MUMBAI","SOFTWARE ENGINEER","2 YEARS"));
			std.add(new Student (1003,"CCC","GQ","BE-ECE","66%","CRICKET","CHENNAI","STUDENT","FRESHER"));
			std.add(new Student (1004,"DDD","GQ","BE-EEE","50%","BOXER","PUNJAB","STUDENT","FRESHER"));
	    
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Id :");
		int SId=sc1.nextInt();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf(" %10s%10s%10s%10s%10s%10s%20s%30s%30s %n", "Std ID"," Name"," Quota","Course","Academy", "Sports ", "Place", "Designation", "Experience" );
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		Iterator<Student> itr=std.iterator();
		while(itr.hasNext())
		{
			Student Std=itr.next();
			
			if(Std.getId()==SId)
			{
				System.out.println( SId+"     Record Deleted   !");
			}
			else
			{
				
				System.out.println(Std);
				}
		}
		}
			
}
class StudentManagementDemo{
	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("      STUDENT MANAGEMENT SYSTEM");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Select the option :");
		System.out.println("Press 1 to Create Student details");
		System.out.println("Press 2 to Search Student details");
		System.out.println("Press 3 to Add new details");
		System.out.println("Press 4 to Delete Student details");
		System.out.println("Press 5 to Exit ");
		try {
		
		Scanner sc=new Scanner(System.in);
	    int	n=sc.nextInt();
		
		switch(n)
		{
		case 1:                                                          // Create
			Student.create();
			break;
		case 2:                                                         // Read 
            Student.read();
			break;
		case 3:                                                        // Update
			Student.update();
			break;
		case 4:                                                        //  Delete
			Student.delete();
			break;
		case 5:                                                       // Exit
			System.out.println("Exited");
			break;
		default :
			System.out.println("Invalid !   Select the correct option");
		}
	}
	catch(Exception e)
	{
		System.out.println("Invalid! Select the correct option");
	}
}}


