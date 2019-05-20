class Study{
		
	
		String name;
		int age;
		String gender;


		public void student(String name){
			System.out.println("ѧϰ��"+name+"����");
		}
		public void eat(){
			System.out.println("ѧϰ��� ���˳Է�");
		}
		public void sleep(){
			System.out.println("ѧϰ���� ����˯��");
		}
}


class StudyDemo{
	public static void main(String[] args){
		

	Study s = new Study();
	

	s.name = "����";
	s.age = 20;
	s.gender = "��";
	
	//���÷���
	s.student("����");
	s.eat();
	s.sleep();
	
	System.out.println(s.name);
	System.out.println(s.age);
	System.out.println(s.gender);
	System.out.println();
	System.out.println();
	System.out.println(s.gender);
	}
}