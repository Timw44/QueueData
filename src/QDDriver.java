public class QDDriver
{
    public static void main(String[] args)
    {
        QueueData myQueue = new QueueData();

        myQueue.Enqueue(3.5);
        myQueue.Enqueue(8.9);
        myQueue.Enqueue(4.4);

        myQueue.displayList();

        System.out.println();
        myQueue.Enqueue(2.8);
        myQueue.Dequeue();

        myQueue.displayList();

        System.out.println();
        myQueue.Enqueue(5.2);
        myQueue.displayList();

    }
}
