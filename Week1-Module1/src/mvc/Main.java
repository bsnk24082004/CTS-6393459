
package mvc;

public class Main {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("John Doe", "S123", "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
