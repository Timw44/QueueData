public class QueueData
{
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
