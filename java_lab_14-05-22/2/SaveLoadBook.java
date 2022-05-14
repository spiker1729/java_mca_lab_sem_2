import static java.awt.PageAttributes.MediaType.A;
import java.io.*;
import static javafx.scene.input.KeyCode.A;

class SaveLoadBook{
    public static void main(String[] args) throws IOException{
        try{
            
         String s=("hi!!! u r in ai lab");   
          
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("OData.txt"));
        Book bk= new Book(s.split(s)," yashwant kanetkar","let us  java ");
            Page pg=new Page(s);
            System.out.println("original");
            System.out.println(bk.getAuthor()+" "+bk.getTitle());
        oos.writeObject(bk);
        oos.close();
       
        System.out.println("\n"+"\n");
        
       
    }catch(IOException e){
        System.out.println("some thing is missing"+e);
    }
        try{
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("OData.txt"));
        Book second = (Book) ois.readObject();
      
         ois.close();
          System.out.println("Reading from OData.txt");
     System.out.println(second.getAuthor()+" "+second.getTitle()+"\n");
            
         
         
         
        }
        catch(IOException e){
        System.out.println("some thing is missing"+e);
    }
        catch(ClassNotFoundException e){
        System.out.println(e);
    }
        
    }
}