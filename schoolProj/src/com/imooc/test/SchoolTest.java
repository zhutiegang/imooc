package com.imooc.test;
import com.imooc.model.Subject;
import com.imooc.model.Student;
public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试Subject
		Subject sub1=new Subject("计算机科学与应用","J0001",4);
		Subject sub2=new Subject("软件工程","J0002",5);
		System.out.println(sub1.info());
		System.out.println("============================");
		Student student1=new Student("s01","张三","男",17,sub1);
		System.out.println(student1.introduction());
		System.out.println("============================");
		Student student2=new Student("s02","李四","男",19);
		System.out.println(student2.introduction("计算机科学与应用",4));
		System.out.println("============================");
		Student student3=new Student("s03","王五","女",18,sub1);
		System.out.println(student3.introduction(sub1));
		System.out.println("============================");
		Student student4=new Student("s03","王五","女",18,sub2);
		System.out.println(student4.introduction());
		/*sub1.addStudent(student1);
		sub1.addStudent(student2);
		sub1.addStudent(student3);
		sub1.addStudent(student4);*/
		System.out.println(sub1.getSubjectName()+"的专业中已有"+sub1.getStudentNum()+"个学生报名");
		System.out.print(sub1.getSubjectName()+"的学生：");
		for(int i=0;i<sub1.getMyStudents().length;i++){
			if(sub1.getMyStudents()[i]==null)break;
			System.out.print(sub1.getMyStudents()[i].getStudentName()+"  ");
		}

	}

}
