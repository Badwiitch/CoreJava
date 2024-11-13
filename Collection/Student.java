package Collection;

public class Student implements Comparable<Student>{

	private int rno;
	private String name;
	private int marks;
	
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ""
				+ ", name=" + name + ","
						+ " marks=" + marks + "]";
	}


	public Student(int rno, String name, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}


	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
