import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {
    private String name;
    private boolean completed;
    private int priority;
    private Date dueDate;
    private Date dueTime;

    public Task(String name) {
        this.name = name;
        this.completed = false;
        this.priority = 1;
        this.dueDate = null;
        this.dueTime = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dueDateString = (dueDate != null) ? sdf.format(dueDate) : "Not set";
        String dueTimeString = (dueTime != null) ? sdf.format(dueTime) : "Not set";
        String status = completed ? "(Completed)" : "";
        return name + " - Priority: " + priority + " - Due Date: " + dueDateString + " - Due Time: " + dueTimeString
                + " " + status;
    }
}
 Task {
    
}
