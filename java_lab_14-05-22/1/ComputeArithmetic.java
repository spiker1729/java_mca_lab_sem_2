import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.StringTokenizer;
  
public class ComputeArithmetic {  
  
    public static void main(String[] args) throws IOException {  
        FileReader f=new FileReader("file.txt");      
BufferedReader b=new BufferedReader(f);      
int r=Integer.parseInt(b.readLine());

for(int i=0;i<r;i++)
{

    
    
    String s = b.readLine();
    StringTokenizer st = new StringTokenizer(s);  

   String part1=st.nextToken();
   String part2=st.nextToken();
      String part3=st.nextToken();

    
if(part1.equals("*"))
{
    System.out.println(""+(Integer.parseInt(part2)*Integer.parseInt(part3)));
}
if(part1.equals("/"))
{
    System.out.println(""+(Integer.parseInt(part2)+Integer.parseInt(part3)));
}
if(part1.equals("+"))
{
    System.out.println(""+(Integer.parseInt(part2)+Integer.parseInt(part3)));
}
if(part1.equals("-"))
{
    System.out.println(""+(Integer.parseInt(part2)-Integer.parseInt(part3)));
}

}



b.close();      
f.close();      
  
    }  
}  