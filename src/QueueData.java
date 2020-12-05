public class QueueData
{

    private Node head;
    private Node tail;

    public QueueData()
    {
        this.head = null;
        this.tail = null;
    }

    public void Enqueue(double newData)
    {
        tail = new Node(newData, tail);
    }

    public void displayList()
    {
        Node position = tail;
        while(position != null)
        {
            System.out.print(position.getData() + " ");
            position = position.getLink();
        }
    }

    private class Node
    {
        private double data;
        private Node link;

        public Node(double data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        public double getData()
        {
            return data;
        }

        public Node getLink()
        {
            return link;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public String toString()
        {
            return "Data: " + data + ", Link: " + link + "";
        }
    }
}
