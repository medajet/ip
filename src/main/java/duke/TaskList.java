package duke;

import java.util.ArrayList;

/**
 * The duke.TaskList class, containing the duke.TaskList and methods that interact with Tasks.
 *
 * @author Jet Tan
 */
public class TaskList {
    public static ArrayList<Task> taskList = new ArrayList<>();

    /**
     * Getter for the duke.TaskList.
     *
     * @return the duke.TaskList
     */
    public static ArrayList<Task> getTasks() {
        return taskList;
    }
    
    /**
     * Marks the specified task as done.
     */
    public static void mark(int tasknum) {
        Task t = taskList.get(tasknum - 1);
        System.out.println(Ui.getBorder() + "Well done! I've marked this task as done: \n");
        t.markAsDone();
        System.out.println(t + "\n" + Ui.getBorder());
    }

    /**
     * Unmarks the specified task.
     */
    public static void unmark(int tasknum) {
        Task t = taskList.get(tasknum - 1);
        System.out.println(Ui.getBorder() + "No problem, I've marked this task as undone: \n");
        t.unmarkAsDone();
        System.out.println(t + "\n" + Ui.getBorder());
    }
    
    /**
     * Deletes the specified task.
     */
    public static void delete(int tasknum) {
        Task t = taskList.get(tasknum - 1);
        System.out.println(Ui.getBorder() + "No problem, I've deleted the following task:\n" + t);
        taskList.remove(tasknum - 1);
        System.out.println("There are now " + taskList.size() + " task(s) remaining.\n" + Ui.getBorder());
    }
}