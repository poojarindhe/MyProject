package com.test;

import java.util.Scanner;

public class CrudOperation 
{

	public static void main(String[] args) 
	{
		Employee emp[]=new Employee[10];
		Scanner sc =new Scanner(System.in);
		int count=0;
		int flag=0;

		while(true)
		{
			System.out.println("1.Add Emp");
			System.out.println("2.update Emp");
			System.out.println("3.Delete Emp");
			System.out.println("4.Show Emp");
			System.out.println("5.Search Emp");
			System.out.println("6.Exit");

			System.out.println("Enter choice :");
			int choice= sc.nextInt();
			int age,salary,id;
			String name;

			switch(choice)
			{
			case 1:
				System.out.println("Add Employee :");
				System.out.println("Enter no of Emp");
				int n=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter emp id :");
					id=sc.nextInt();
					System.out.println("Enter Emp name :");
					name=sc.next();
					System.out.println("Enter age");
					age=sc.nextInt();
					System.out.println("Enter salary");
					salary=sc.nextInt();
					emp[count]= new Employee(id,name,age,salary);
					count++;
					System.out.println("Add Employee succesfully");
				}
				break;
			case 2 :
				System.out.println("Update Employee :");
				System.out.println("Enter Emp id if you want to update");
				int e_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(emp[i].getEid()==e_id)
					{
						flag=1;
						System.out.println("Enter the Salary");
						int esalary=sc.nextInt();
						emp[i].setSalary(esalary);
						System.out.println("Update Emp sucessfully");
					}
					if(flag==0)
					{
						System.out.println("Emp not found");
					}

				}
				break;
			case 3 :
				System.out.println("Delete Employee :");
				System.out.println("Enter emp id if you want to delete");
				e_id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(emp[i].getEid()==e_id)
					{
						emp[i]=null;
						System.out.println("Delete Emp sucessfully");
					}

				}
				break;
			case 4 :
				System.out.println("Show Employee :");
				System.out.println(count);
				for(int i=0;i<count;i++)
				{
					if(emp[i]!=null)
					{
						System.out.println(emp[i]);
					}
				}
				break;
			case 5 :
				System.out.println("Search Employee :");
				System.out.println("Enter emp id if you want to search");
				e_id=sc.nextInt();
				int temp=0;
				for(int i=0;i<count;i++)
				{
					
						if(emp[i].getEid()==e_id && temp==0 && null!=emp[i])
						{
							System.out.println("Emp is present");
							System.out.println(emp[i]);
							temp=1;
						}
				}
				if(temp==0)
				{
					System.out.println("Emp not found :");
				}
				break;
			case 6 :
				System.exit(0);
				break;



			}

		}



	}


}
