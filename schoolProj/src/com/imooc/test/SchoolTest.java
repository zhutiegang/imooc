package com.imooc.test;
import com.imooc.model.Subject;
import com.imooc.model.Student;
public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Subject
		Subject sub1=new Subject("�������ѧ��Ӧ��","J0001",4);
		Subject sub2=new Subject("�������","J0002",5);
		System.out.println(sub1.info());
		System.out.println("============================");
		Student student1=new Student("s01","����","��",17,sub1);
		System.out.println(student1.introduction());
		System.out.println("============================");
		Student student2=new Student("s02","����","��",19);
		System.out.println(student2.introduction("�������ѧ��Ӧ��",4));
		System.out.println("============================");
		Student student3=new Student("s03","����","Ů",18,sub1);
		System.out.println(student3.introduction(sub1));
		System.out.println("============================");
		Student student4=new Student("s03","����","Ů",18,sub2);
		System.out.println(student4.introduction());
		/*sub1.addStudent(student1);
		sub1.addStudent(student2);
		sub1.addStudent(student3);
		sub1.addStudent(student4);*/
		System.out.println(sub1.getSubjectName()+"��רҵ������"+sub1.getStudentNum()+"��ѧ������");
		System.out.print(sub1.getSubjectName()+"��ѧ����");
		for(int i=0;i<sub1.getMyStudents().length;i++){
			if(sub1.getMyStudents()[i]==null)break;
			System.out.print(sub1.getMyStudents()[i].getStudentName()+"  ");
		}

	}

}
