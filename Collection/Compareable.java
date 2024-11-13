package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Compareable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(3);
		a1.add(4);
		a1.add(2);
		a1.add(5);
		a1.add(6);
		Collections.sort(a1);   //since it follows insertion order manuallly sorting the aarray
		System.out.println(a1); 
		
		
		ArrayList<Employee> al1=new ArrayList<Employee>();
		Employee e1=new Employee(1,"jack", 30000);
		Employee e2=new Employee(2,"jacek", 30000);
		Employee e3=new Employee(4,"rahee", 30000);
		Employee e4=new Employee(3,"siddhi", 30000);
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		al1.add(e4);
		Collections.sort(al1);
		System.out.println(al1);
		
		ArrayList<Employee> al2=new ArrayList<Employee>();
		al2.add(e1);
		al2.add(e2);
		al2.add(e3);
		Collections.sort(al2,new IdComparator());
		System.out.println(al2);
		
		ArrayList<Employee> al3=new ArrayList<Employee>();
		al3.add(e1);
		al3.add(e2);
		al3.add(e3);
		Collections.sort(al3,new nameComparator());
		System.out.println(al3);
		
		ArrayList<Employee> al4=new ArrayList<Employee>();
		al4.add(e1);
		al4.add(e2);
		al4.add(e3);
		Collections.sort(al4,new salaryComparator());
		System.out.println(al4);
		
		System.out.println("-----------------");
		ArrayList<Student> s=new ArrayList<Student>();
		Student s1=new Student(1, "Parth", 60);
		Student s2=new Student(1, "Parth", 60);
		s.add(s1);
		s.add(s2);
	}

}
