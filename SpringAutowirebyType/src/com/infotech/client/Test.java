package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee;
import com.infotech.model.Pancard;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee employee = ctx.getBean("employee", Employee.class);
		if(employee != null){
			System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getEmail());
			
			Pancard pancard = employee.getPancard();
			if(pancard != null)
				System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());
		}
		
		((AbstractApplicationContext) ctx).close();
	}

}
