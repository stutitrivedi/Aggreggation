/* Driver program for one Instructor and Textbook*/
/*public class CourseDriver {
    public static void main(String[] args) {*/




public class CourseDriver {
    public static void main(String[] args) {
        System.out.print("code for one instructor and textbook");
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course course = new Course("Software Engineering", instructor, textbook);
        course.printInfo();

            System.out.print("\ncode for two instructor and textbook");
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 = new Instructor("John", "Doe", "4-1234");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");

        ModifyCourse modifycourse = new ModifyCourse("Software Engineering", instructor1, instructor2, textbook1, textbook2);

        modifycourse.printCourseInfo();
    }
}
