/*
 * IntLinkedList
 * 
 * PURPOSE: Defines an integer linked list with general methods to access and modify it.
 */
public class IntLinkedList{
  
  private IntNode top;  //First Link
  
 /*
  * Contructor of IntLinkedList.  Creates an empty IntLinkedList.
  */  
  public IntLinkedList(){
    top = null;
  }
  
 /*
  * Contructor of IntLinkedList.  Creates an IntLinkedList in the same order as an array of data.
  */    
  public IntLinkedList(int[] data){
    for(int i = data.length-1; i >= 0; i--){
      add(data[i]);
    }
  }
  
 /*
  * Adds a node with data passed as parameter to the start of the list.
  */    
  public void add(int data){
    IntNode newNode = new IntNode(data, top);
    top = newNode;
  }

 /*
  * Returns the size of the list as an integer.
  */     
  public int size(){
    if(top == null){
      return 0;
    }
    int size = 1;
    IntNode current = top;
    while(current.getLink() != null){
      size++;
      current = current.getLink();
    } 
    return size;
  }
  
 /*
  * Checks if the list contains a node with data the same as passed as parameter.
  */     
  public boolean contains(int data){
    if(top == null){
      return false;
    }
    IntNode current = top;
    if(current.getData() == data){
      return true;
    }
    while(current.getLink() != null){
      if(current.getData() == data){
        return true;
      }
      current = current.getLink();
    }
    return false;
  }
  
 /*
  * Removes the first node from the list.
  */     
  public void removeFirst(){
    if(top == null){
      return;
    }
    top = top.getLink();
  }
  
 /*
  * Returns a String representation of the entire list separated by commas and enclosed by brackets.
  */     
  public String toString(){
    String result = "<<";
    if(top != null){
      IntNode current = top;
      result += current;
      while(current.getLink() != null){
        result += ",";
        current = current.getLink();
        result += current;
      }
    }
    return result + ">>";
  }
  
 /*
  * Returns the first node of a deep copy of the list.
  */     
  public IntLinkedList clone(){
    if(top == null){
      return new IntLinkedList();
    }
    int[] data = new int[this.size()];
    IntNode current = top;
    data[0] = current.getData();
    for(int i = 1; i < data.length; i++){
      current = current.getLink();
      data[i] = current.getData();
    }
    return new IntLinkedList(data);
  }
  
 /*
  * Checks for empty case then calls the maxFrom method.
  */     
  public int max(){
    if(top == null){
      return Integer.MIN_VALUE;
    }
    return maxFrom(top);
  }
  
 /*
  * Returns the value of the node that contains the greatest data.
  */     
  public static int maxFrom(IntNode start){
    if(start.getLink() == null){
      return start.getData();
    }else{
      return Math.max(start.getData(), maxFrom(start.getLink()));
    }
  }
    
 /*
  * Checks for empty case then calls reverseOrder method.
  */     
  public void reverse(){
    if(top != null){
      top = reverseOrder(top);
    }
  }
  
 /*
  * Reverses the order of the list by relinking all the nodes in the reverse order.
  */     
  public static IntNode reverseOrder(IntNode start){
    if(start.getLink() == null){
      return start;
    }else{
      IntNode newStart = reverseOrder(start.getLink());
      start.getLink().setLink(start);
      start.setLink(null);
      return newStart;
    }
  }
}
