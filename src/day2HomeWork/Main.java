package day2HomeWork;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# + ANGULAR");
		Course course2 = new Course(2,"JAVA + REACT");
		Course course3 = new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs");
		
		Course[] courses = {course1,course2,course3};
		for(Course course:courses) {
			System.out.println(course.name);
		}
		
		Category category1 = new Category();
		category1.name = "tümü";
		
		Category category2 = new Category();
		category2.name = "Programlama";
		
		Teacher teacher1 = new Teacher();
		teacher1.name = "Engin Demiroð";
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.beIncludedÝnTheProgram(course1);
		courseManager.beIncludedÝnTheProgram(course2);
		courseManager.beIncludedÝnTheProgram(course3);
		
		
		
		

	}

}
