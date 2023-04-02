package markl72;
public class Addition //extends UnicastRemoteObject 
	implements AdditionInterface{
 		
	public Addition () {      
	}
 
      public int add(Object a)  {
    	  NumberPair b = (NumberPair)a;
    	  int result = b.number1 + b.number2;
    
    	  return result;
      }


      

 }