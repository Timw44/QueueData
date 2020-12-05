public class QDDriver
{
    public static void main(String[] args)
    {
        QueueData myQueue = new QueueData();

        myQueue.Enqueue(3.5);
        myQueue.Enqueue(8.9);

        myQueue.displayList();
    }
}
