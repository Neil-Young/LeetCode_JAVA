
class testing {
	public static void main(String[] args){
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);
	}
}

class Student{
	public void show(){
		System.out.println("爱学习");
	}
}

class StudentDemo{
	public void method(Student a){
		a.show();
	}
}