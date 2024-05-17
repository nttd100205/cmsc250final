import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class TaskManagerGUI extends JFrame {
    private TaskManager taskManager;
    private DefaultListModel<String> listModel;
    private JList<String> taskList;

    public TaskManagerGUI(TaskManager taskManager) {
        this.taskManager = taskManager;
        setTitle("Task Manager");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Task");
        JButton editButton = new JButton("Edit Task");
        JButton completeButton = new JButton("Complete Task");
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(editButton);
        buttonPanel.add(completeButton);
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        add(panel);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                removeTask();
            }
        });

    }

    private void addTask() {
        String taskName = JOptionPane.showInputDialog(this, "Enter task name:");
        if (taskName != null && !taskName.trim().isEmpty()) {
            Task newTask = new Task(taskName);
            taskManager.addTask(newTask);
            listModel.addElement(newTask.toString());
        }
    }

    private void removeTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            taskManager.removeTask(selectedIndex);
            listModel.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to remove.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TaskManager taskManager = new TaskManager();
                new TaskManagerGUI(taskManager).setVisible(true);
            }
        });
    }
}
