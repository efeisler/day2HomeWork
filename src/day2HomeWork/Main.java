package day2HomeWork;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# + ANGULAR");
		Course course2 = new Course(2,"JAVA + REACT");
		Course course3 = new Course(3,"Programlamaya Giri� ��in Temel Kurs");
		
		Course[] courses = {course1,course2,course3};
		for(Course course:courses) {
			System.out.println(course.name);
		}
		
		Category category1 = new Category();
		category1.name = "t�m�";
		
		Category category2 = new Category();
		category2.name = "Programlama";
		
		Teacher teacher1 = new Teacher();
		teacher1.name = "Engin Demiro�";
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.beIncluded�nTheProgram(course1);
		courseManager.beIncluded�nTheProgram(course2);
		courseManager.beIncluded�nTheProgram(course3);
		
		
		
		

	}

}
