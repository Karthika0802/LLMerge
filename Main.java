/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
   public static void main(String[] args) {
        
        Node node = new Node(100);
        DoublyLinkedList MyList = new DoublyLinkedList(node);
     
        for(int i = 0;i<10;i++){
            MyList.AddToTail(new Node(i));
        }
        
        OddEvens(MyList).PrintList();
        
    }
  
  public static DoublyLinkedList OddEvens(DoublyLinkedList List)
  {
      int Len = List.ListLength();
      Node OddHead = new Node(0);
      Node EvenHead = new Node(0);
      DoublyLinkedList Odds = new DoublyLinkedList(OddHead);
      DoublyLinkedList Evens = new DoublyLinkedList(EvenHead);
      int OddLen = Odds.ListLength();
      int EvenLen = Evens.ListLength();
      int SecLen;
      DoublyLinkedList Interweave = new DoublyLinkedList(null);
      
      
      for(int i = 0;i<Len;i++){
          Node n = List.GetNode(i);
          n.prev = n.next = null;
          System.out.println(n.data);
          if(i%2 == 1)
          {
              
                                       
           
              Odds.AddToTail(n);
            }
            else
            {
               Evens.AddToTail(n);
            }
          
      }
      /*
      Node NextOdd = OddHead;
      Node NextEven = EvenHead;
      
      
      for(int j=0;j<OddLen;j++){
          if(NextOdd!=null){
              Interweave.AddToTail(Odds.GetNode(j));
              NextOdd = NextOdd.next;
          }
          
      }
      
      for(int q=0;q<OddLen;q++){
      if(NextEven!=null){
              Interweave.AddToTail(Evens.GetNode(q));
              NextEven = NextEven.next;
          }
          
        }
        */
      DoublyLinkedList Fin = Odds.MergeLists(Evens);
       
      return Fin;
      
      
    }
    
   
}
