package com.sumitaccess007.client;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sumitaccess007.binding.Employee;

public class Marshalling {

	public static void main(String[] args) throws JAXBException {
		// Marshalling : Converting java object into XML

		// STEP-1 Create object which we want to convert
		Employee employee=new Employee();

		// STEP-2 Initiate getters methods of Employee class
		employee.setEmpNo(1);
		employee.setName("Sumit Sharma");
		employee.setSalary(50000.00);

		// STEP-3 Create JXBContext object
		// To create JAXBContect object we can use newInstance() from JAXBContect class
		// The newInstance() method is a static factory method
		// It is a static method so it will be called directly with class name
		// newInstance() method used object in java.lang.class format this can be done by two methods
		// first is employee.getClass() and second is Employee.class
		/* JAXBContext jaxbcontect=JAXBContext.newInstance(employee.getClass()); */
		//OR
		JAXBContext jaxbcontect=JAXBContext.newInstance(Employee.class);

		// STEP-4 Create MArshaller object from JXBContext object
		Marshaller marshaller=jaxbcontect.createMarshaller();

		// STEP-5 Create marshaller() function from Marshaller object
		// To display the generated XML on console
		// marshaller.marshal(employee, System.out);
		
		// To display the generated XML in file
		File file=new File("emp.xml");
		marshaller.marshal(employee, file);
		System.out.println("Done");

	}

}
