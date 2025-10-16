package com.student.jdbc.test;

import java.util.Scanner;

import com.student.jdbc.Student;
import com.student.jdbc.courseTest.Delete;
import com.student.jdbc.courseTest.DeleteC;
import com.student.jdbc.courseTest.Insert;
import com.student.jdbc.courseTest.Update;
import com.student.jdbc.courseTest.View;

public class Admin {
	public static void admin(Student s) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		if(s.getId()==1) {
			System.out.println("-----ADMIN INFO-----");
			
			do {
				System.out.println("1. VIEW ALL STUDENT");
				System.out.println("2. Delete User");
				System.out.println("3. Add Course");
				System.out.println("4. UpdateCourse");
				System.out.println("5. DeleteCourse");
				System.out.println("6. View Payment");
				System.out.println("7. Approve Payment");
				System.out.println("8. Exit");
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:View.view();
					break;
				case 2:Delete.delete();
					break;
				case 3: Insert.insert();
					break;
				case 4:Update.update();
					break;
				case 5:DeleteC.delete();
					break;
				case 6:ViewP.viewp();
					break;
				case 7:Approve.payment(s);
					break;
				case 8:System.out.println("Apllication ends");
					break;
				default:System.out.println("Enter the valid choice");
				
				}
				
			}while(choice!=8);
			
		}
	}

}
