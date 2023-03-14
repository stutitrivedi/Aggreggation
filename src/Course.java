public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void printInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + " (" + instructor.getOfficeNumber() + ")");
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor() + " (Publisher: " + textbook.getPublisher() + ")");
    }
}