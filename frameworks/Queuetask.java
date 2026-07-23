import java.util.LinkedList;
import java.util.Queue;
class Queuetask
{
    public static void main(String[] args)
    {
        Queue<String> tasks = new LinkedList<>();
        tasks.offer("send gmail");
        tasks.offer("generate report");
        tasks.offer("Database");
        System.out.println("Tasks in Queue:");
        System.out.println(tasks);


        while(!tasks.isEmpty())
        {
            String currentTasks = tasks.poll();
            System.out.println("processing :"+currentTasks);

        }
        System.out.println("Queue after processing:");
        System.out.println(tasks );
    }
}