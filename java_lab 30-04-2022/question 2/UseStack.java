import java.util.*;
import java.lang.*;
import java.sql.Array;

class UseStack{

	public static boolean isParanthesisMatching(char[] expr){
		int l = expr.length;
		char x = 'a';
		stack ps = new stack(5);
		for(int i = 0; i < l; i++){
			if(expr[i] == '('){
				ps.push(expr[i]);
			}
			else{
				if(expr[i] == ')'){
					x = ps.pop();
				}
			}
		}
		return ps.isEmpty;
	}
   public class  OverFlowException extends Exception{
        int n;
      
        
        OverFlowException(int i){
            n = i;
            
        }
        
        public String toString(){
            return "the size of stack is "+n;
        }
    }
    public class  UnderFlowException extends Exception{
        int n;
       
        
        UnderFlowException(int i){
            n = i;
         
        }
        
        public String toString(){
            return "the size of stack is "+n;
        }
    }


	
 
  
	public static void main(String[] args)
    {
char[] arr={'(',')','(',')','(',')'};
System.out.println(isParanthesisMatching(arr));



		
    }

	
}