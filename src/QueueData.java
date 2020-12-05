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
            head = null;
            Node tails = tail;
            while(tails != null)
            {
                head = new Node(tails.getData(), head);
                tails = tails.getLink();
            }
    }

    public void Dequeue()
    {
        if(head != null)
        {
            head = head.getLink();
            Node heads = head;
            tail = null;
            while(heads != null)
            {
                tail = new Node(heads.getData(), tail);
                heads = heads.getLink();
            }
        }
        else
        {
            System.out.println("Nothing left to delete.");
            System.exit(0);
        }
    }

    public void listLength()
    {
        int count = 0;
        Node position = head;
        while(position != null)
        {
            count++;
            position = position.getLink();
        }
        System.out.println("The list length is: " + count);
    }

    public void setData(double oldData, double updateData)
    {
        Node position = head;
        while (position != null)
        {
            if (position.getData() == oldData)
            {
                position.setData(updateData);
            }
            position = position.getLink();
        }
    }

    public void displayList()
    {
        Node position = head;

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

        public void setData(double data)
        {
            this.data = data;
        }

        public String toString()
        {
            return "Data: " + data + ", Link: " + link + "";
        }
    }
}
