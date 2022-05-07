public class palindrome {
 
    
    static boolean isPalindrome(String string)
    {
 
        int i = 0, j = string.length() - 1;
 
        
        while (i < j) {
 
            
            if (string.charAt(i) != string.charAt(j))
	{
                return false;
	}
 
            
            i++;
            j--;
        }
 
        
        return true;
    }
 
    
    public static void main(String[] args)
    {
        String string = "abcddcba";
        
       
        
        
        
 
       
       
 
        if (isPalindrome(string))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");
 
        
        System.out.println();
 
        
        
    }
}