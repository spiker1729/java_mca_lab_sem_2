import com.oracle.jrockit.jfr.DataType;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class list implements ListSelectionListener,ActionListener{
   // JList<String> jlst;
    JLabel jlab1,jlab2,jlab3;
	JButton jbtn1,jbtn2;
        JTextField jtf;
       
    JScrollPane jscrlp;
      int r,r1;
          DefaultListModel<String> model = new DefaultListModel<>();
    JList<String> jlst = new JList<>( model );
    //String names[] = {"James", "Frankle", "Jung", "Camus", "Nietzsche", "Vivekananda","Bose","Pothana"};
     
    list(){
        
    
        JFrame jfrm = new JFrame("JList Demo");
        
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(600, 560);
        jbtn1 =new JButton("push");
        jbtn2=new JButton("pop");
        jtf =new JTextField(50);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       // jlst = new JList<String>(names);
        
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
       jscrlp = new JScrollPane(jlst);
        
        jscrlp.setPreferredSize(new Dimension(500, 250));
        
        jlab1 = new JLabel("Please choose a name");
        jlab2 = new JLabel("please enter the string below to be added");
        jlab3 = new JLabel("");

        jlst.addListSelectionListener(this);
        jbtn1.addActionListener(this);
        jbtn2.addActionListener(this);
        
       jfrm.add(jscrlp);
             jfrm.add(jlab2);
           jfrm.add(jtf);
       // jfrm.add(jlab1);
    
        jfrm.add(jbtn1);
        jfrm.add(jbtn2);
        
        jfrm.add(jlab3);
        
        jfrm.setVisible(true);
    }
    
    public void valueChanged(ListSelectionEvent le){
     /*   int idx = jlst.getSelectedIndex();
        
        if (idx != -1){
            jlab1.setText("Current Selection: "+names[idx]);
            
        }else{
            jlab1.setText("Please choose a name");
        }*/
    }

     public void actionPerformed(ActionEvent ae) {
     
         if(ae.getActionCommand().equals("push")){
      //  int  r=jlst.getComponentCount();
       if("".equals(jtf.getText()))
       {
           jlab3.setText("enter something to be added");
       }
       else{
           model.addElement(jtf.getText());
           jtf.setText("");
                jlab3.setText("SUCESSFULLY ADDED");
       }
                
            }

         else{
         try{
                
            int r=jlst.getComponentCount();
                 model.removeElementAt(jlst.getLastVisibleIndex());
                jlab3.setText("ELEMENT REMOVED  SUCCESSFULLY");
            
              }    
              catch(ArrayIndexOutOfBoundsException e)
              {
                    jlab3.setText("Exception:-no elements in list please enter some elements");
             
              }

        }
        

    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               new list();
           }
        });
    }

    
   
}