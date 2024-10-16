import java.util.Scanner;  

class Task {  
    private String name;  
    private String description;  
    private boolean isCompleted;  

    public Task(String name, String description) {  
        this.name = name;  
        this.description = description;  
        this.isCompleted = false; // Default to not completed  
    }  

    // Getters  
    public String getName() { return name; }  
    public String getDescription() { return description; }  
    public boolean isCompleted() { return isCompleted; }  

    public void markAsCompleted() { isCompleted = true; }  

    @Override  
    public String toString() {  
        return "Name: " + name + ", Description: " + description + ", Completed: " + isCompleted;  
    }  
}  

public class TaskManager {  
    private static Task[] tasks = new Task[10]; // Array to hold tasks  
    private static int taskCount = 0; // Current number of tasks  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int choice;  

        do {  
            // Display menu  
            System.out.println("1. Add Task");  
            System.out.println("2. Remove Task");  
            System.out.println("3. Display Tasks");  
            System.out.println("4. Exit");  
            System.out.print("Choose an option: ");  

            choice = scanner.nextInt();  
            scanner.nextLine(); // Consume newline  

            switch (choice) {  
                case 1:  
                    addTask(scanner);  
                    break;  
                case 2:  
                    removeTask(scanner);  
                    break;  
                case 3:  
                    displayTasks();  
                    break;  
                case 4:  
                    System.out.println("Exiting application.");  
                    break;  
                default:  
                    System.out.println("Invalid option. Please try again.");  
            }  
        } while (choice != 4);  
        
        scanner.close();  
    }  

    private static void addTask(Scanner scanner) {  
        if (taskCount < tasks.length) {  
            System.out.print("Enter task name: ");  
            String name = scanner.nextLine();  
            System.out.print("Enter task description: ");  
            String description = scanner.nextLine();  
            tasks[taskCount] = new Task(name, description);  
            taskCount++;  
            System.out.println("Task added.");  
        } else {  
            System.out.println("Task list is full!");  
        }  
    }  

    private static void removeTask(Scanner scanner) {  
        System.out.print("Enter task index to remove (0 to " + (taskCount - 1) + "): ");  
        int index = scanner.nextInt();  
        if (index >= 0 && index < taskCount) {  
            for (int i = index; i < taskCount - 1; i++) {  
                tasks[i] = tasks[i + 1]; // Shift tasks left  
            }  
            tasks[--taskCount] = null; // Clear last position  
            System.out.println("Task removed.");  
        } else {  
            System.out.println("Invalid index.");  
        }  
    }  

    private static void displayTasks() {  
        if (taskCount == 0) {  
            System.out.println("No tasks available.");  
        } else {  
            for (int i = 0; i < taskCount; i++) {  
                System.out.println(i + ": " + tasks[i]);  
            }  
        }  
    }  
}