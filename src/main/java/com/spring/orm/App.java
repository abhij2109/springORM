package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 for addition of new student.");
			System.out.println("Press 2 for display of all students.");
			System.out.println("Press 3 for display of a single student");
			System.out.println("Press 4 for deletion of student");
			System.out.println("Press 5 for update of new student");
			System.out.println("Press 6 for Exit.");

			try {
				int input = Integer.parseInt(br.readLine());
				switch (input) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:
					
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input Try with another one.!!");
				System.out.print(e.getMessage());
			}
		}
	}
}
