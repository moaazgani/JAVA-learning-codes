public class reverse {
    Node head;
    private int size;

    reverse() {
        this.size = 0;
    }

    class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // addFirst first/last
    public void addFirst(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLastLast(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }
        currnode.next = newNode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("null");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastnode = head.next;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getsize() {
        return size;
    }

    public void reverseList() {
       if(head == null || head.next == null) {
           return;
       }

       Node prevNode = head;
       Node currNode = head.next;
       while(currNode != null) {
           Node nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
       }
       head.next = null;
       head = prevNode;
   }

    public static void main(String[] args) {
        reverse list = new reverse();

        list.addFirst(2);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(9);
        
        list.printlist();
        list.reverseList();
        list.printlist();
    }
}