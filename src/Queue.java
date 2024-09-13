public class Queue {
    Node front;
    Node rear;

    public Queue() {
        front = null;
        rear = null;
    }
    public void enqueue(int data){
        Node temp = new Node(data);
        if(isEmpty()){
            front = temp;
            rear = temp;
            System.out.println("Insert First Data");
            return;
        }
        rear.nextNode = temp;
        rear = temp;
        System.out.println("Data Insert Successfully");
    }


    public void dequeue(){

        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        if (front == rear){
            System.out.println(front.data);
            front = null;
            rear = null;
            return;
        }
        System.out.println(front.data);
        front = front.nextNode;
    }

    public void display(){
        do {
            System.out.println(" | " + front.data + " | ");
            front = front.nextNode;
        } while (front != null);
    }


    private boolean isEmpty(){
        return front == null && rear == null;
    }
}
