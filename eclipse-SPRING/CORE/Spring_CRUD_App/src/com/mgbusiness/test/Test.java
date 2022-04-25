package com.mgbusiness.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mgbusiness.controller.StudentController;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/mgbusiness/resources/applicationContext.xml");
		StudentController studentController = (StudentController) context.getBean("studentController");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1. ADD");
			System.out.println("2. SEARCH");
			System.out.println("3. UPDATE");
			System.out.println("4. DELETE");
			System.out.println("5. EXIT");
			System.out.print("Your option : ");
			int option = Integer.parseInt(br.readLine());
			switch (option) {
			case 1:
				studentController.addStudent();
				break;
			case 2:
				studentController.searchStudent();
				break;
			case 3:
				studentController.updateStudent();
				break;
			case 4:
				studentController.deleteStudent();
				break;
			case 5:
				System.out.println("--------------Thank you Visit Again-----------");
				System.exit(0);
				break;
			default:
				System.out.println("Enter only numbers 1 to 5");
				break;
			}
		}

	}

}
