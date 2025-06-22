package task;

public class TaskList {

    // Node class representing a task in the linked list
    private class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head; // Head of the list

    public TaskList() {
        this.head = null;
    }

    // Add a new task to the list (at the end)
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode; // If the list is empty, the new task becomes the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end
            }
            current.next = newNode; // Add the new task at the end
        }
    }

    // Search for a task by taskId
    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task; // Task found
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Traverse the list and print all tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.task); // Print the task details
            current = current.next; // Move to the next task
        }
    }

    // Delete a task by taskId
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks in the list to delete.");
            return;
        }

        // If the task to delete is the head task
        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task with ID " + taskId + " has been deleted.");
            return;
        }

        // Traverse to find the task and delete it
        Node current = head;
        while (current.next != null && current.next.task.getTaskId() != taskId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task with ID " + taskId + " not found.");
        } else {
            current.next = current.next.next; // Delete the task by skipping it
            System.out.println("Task with ID " + taskId + " has been deleted.");
        }
    }
}