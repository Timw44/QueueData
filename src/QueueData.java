public class QueueData
{
    //variables
    private Node head;
    private Node tail;

    public QueueData()//constructor
    {
        this.head = null;
        this.tail = null;
    }

    public void Enqueue(double newData) // adds a new node to the tail
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

    public void Dequeue() // deletes a node from the head
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

    public void listLength() // displays the # of nodes
    {
        int count = 0;
        Node heads = head;
        while(heads != null)
        {
            count++;
            heads = heads.getLink();
        }
        System.out.println("The list length is: " + count);
    }

    public void setData(double oldData, double newData) // changes the Node data that the user selects
    {
        Node heads = head;
        while (heads != null)
        {
            if (heads.getData() == oldData)
            {
                heads.setData(newData);
            }
            heads = heads.getLink();
        }
    }

    public void displayList() // shows all the Node data in a row
    {
        Node position = head;

        while(position != null)
        {
            System.out.print(position.getData() + " ");
            position = position.getLink();
        }
    }

    private class Node // Node class
    {
        //variables
        private double data;
        private Node link;

        //constructor
        public Node(double data, Node link)
        {
            this.data = data;
            this.link = link;
        }

        //getters & setters
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

        // toString
        public String toString()
        {
            return "Data: " + data + ", Link: " + link + "";
        }
    }
}
