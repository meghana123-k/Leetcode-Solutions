class MyLinkedList {
    class Node {
        int data;
        Node next;
        private Node(int data) {
            this.data = data;
            this.next = null;
        } 
    }
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) return -1;
        Node temp = head;
        int cnt = 0;
        while(temp != null) {
            if(cnt == index) {
                return temp.data;
            }
            cnt++;
            temp = temp.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            if(size == 0) {
                tail = newNode;
            }
        }
        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(tail == null) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return ;
        if(index == 0) {
            addAtHead(val);
        } else if(index == size) {
            addAtTail(val);
        } else {
            Node temp = head;
            for(int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return ;
        if(index == 0) {
            head = head.next;
            if(size == 1) {
                tail = null;
            }
            size--;
        } else {
            Node temp = head;
            for(int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(index == size - 1) {
                tail = temp;
            }
            size--;
        } 
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */