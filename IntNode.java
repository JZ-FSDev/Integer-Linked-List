/*
 * IntNode
 * 
 * PURPOSE: Defines a node which stores an integer value and the reference to the next node.
 */
public class IntNode{
  
  private int data;  //Integer data for this Node
  private IntNode link;  //Reference to next Node
  
 /*
  * Contructor of IntNode.  Creates a node with data and node passed as parameters.
  */       
  public IntNode(int data, IntNode link){
    this.data = data;
    this.link = link;
  }
  
 /*
  * Return the node of the link
  */       
  public IntNode getLink(){
    return link;
  }
  
 /*
  * Sets the link to passed parameter
  */       
  public void setLink(IntNode link){
    this.link = link;
  }
  
 /*
  * Returns the integer data of the Node
  */       
  public int getData(){
    return data;
  }
  
 /*
  * Returns the integer data of the node as a String.
  */       
  public String toString(){
    return "" + data;
  }
}
