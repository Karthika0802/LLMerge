class DoublyLinkedList{
    
    Node Head;
    Node Tail;
    
    DoublyLinkedList(Node node)
    {
        Head = node;
        Tail = node;
    }
    
    void AddToTail(Node node){  //Adds node to tail
        
        if(Tail != null)
        {
        node.prev = Tail;
        Tail.next = node;
        Tail = node;
        Tail.next = null;
        }
        else
        {
        Head = Tail = node;
        }
       
    }
    
    void Insert(Node before, Node node){//Insert node into the middle
        
        Node after = before.next;
        before.next = node;
        node.prev = before;
        node.next = after;
        after.prev = node;
    
    }
    
    void AddToHead(Node node){//Adds node to head
    
        node.prev = null;
        node.next = Head;
        Head.prev = node;
        Head = node;
    
    }
    
   
    
    int ListLength(){
        int i = 0;
        Node Temp = Head;
        while(Temp!=null){
            Temp = Temp.next;
            i++;
        }
        
        return i;
    
    }
    
    void PrintList(){
        Node Temp = Head;
        while(Temp!=null){
            System.out.println(Temp.data);
            Temp = Temp.next;
        }
        
    }
    
    Node GetNode(int n)
    {
        if(n>ListLength())
        {
            return null;
        }
        
        Node Temp = Head; 
        
        for(int i = 0;i<n;i++){
            if(Temp!=null){
                Temp = Temp.next;
            }
        }
        
        Node returnNode=new Node(0);
        returnNode.data = Temp.data;
        //System.out.println("Temp:%x"+Temp.hashCode()+"RetrunNode:%x"+returnNode.hashCode());
        return returnNode;
        
    }
    
    DoublyLinkedList MergeLists(DoublyLinkedList List){
        Tail.next = List.Head;
        List.Head.prev = Tail;
        
        return this;
    }
    
}