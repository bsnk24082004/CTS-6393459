
package task;

public class Main {
    public static void main(String[] args) {
        // Create a TaskList to manage tasks
        TaskList taskList = new TaskList();

        // Add some tasks
        taskList.addTask(new Task(1, "Complete Project Report", "In Progress"));
        taskList.addTask(new Task(2, "Attend Team Meeting", "Pending"));
        taskList.addTask(new Task(3, "Finish Code Review", "Completed"));
        taskList.addTask(new Task(4, "Prepare for Presentation", "In Progress"));

        // Traverse and display all tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task by ID
        System.out.println("\nSearching for Task with ID 2:");
        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println("Task found: " + task);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task by ID
        System.out.println("\nDeleting Task with ID 3:");
        taskList.deleteTask(3);
        taskList.traverseTasks();

        // Try to delete a non-existing task
        System.out.println("\nDeleting Task with ID 5 (non-existing):");
        taskList.deleteTask(5);
    }
}
