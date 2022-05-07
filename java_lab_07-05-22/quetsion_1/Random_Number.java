/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import javafx.scene.layout.Border;
import javax.swing.border.LineBorder;
import java.util.Random;   
import static javafx.scene.input.KeyCode.R;
import java.util.Random;   

/**
 *
 * @author HP
 */
public class Random_Number implements ActionListener {
    JTextField jtf;
    JLabel jlbl1,jlbl2,jlbl3,jlbl4;
    JButton jbtn,jbtn2;
   Random random = new Random();
   int x = random.nextInt(50);  
    int input,trials=1,r;

     Random_Number() {
        JFrame jfrm=new JFrame("Random number generator");
        javax.swing.border.Border blackline = BorderFactory.createLineBorder(Color.black);
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(800,800);
         jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf = new JTextField(15);
        jbtn = new JButton("submit");
        jbtn.addActionListener(this);
        
        jlbl1=new JLabel();
        jlbl2=new JLabel();
        jlbl3=new JLabel();
         jlbl4=new JLabel();
      //  jlbl3.setText(Integer.toString(x));
        jbtn2=new JButton("EXIT");
        jbtn2.addActionListener(this);
        jfrm.add(jtf);
        jfrm.add(jbtn);
        jfrm.add(jlbl1);
        jfrm.add(jlbl2);
         jfrm.add(jlbl4);
        jfrm.add(jlbl3);
        jfrm.add(jbtn2);
         jlbl1.setBorder(new LineBorder(Color.BLACK));
        // change label size
        jlbl1.setPreferredSize(new Dimension(400,100));
        jlbl2.setBorder(new LineBorder(Color.BLACK));
        // change label size
        jlbl2.setPreferredSize(new Dimension(400,100));
        
      //  jlbl2.setText("TRIALS");
       jlbl3.setBorder(new LineBorder(Color.BLACK));
        // change label size
        jlbl3.setPreferredSize(new Dimension(400,100));
        
       
        //jlbl1.setText("HELLO");
        jfrm.setVisible(true);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    
     public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("submit")){
            input=Integer.parseInt(jtf.getText());
    
             if(input>100||input<0){
             jtf.setText("invalid number");
             jlbl1.setText("");
             jlbl2.setText("");
             jlbl3.setText("");
             jlbl4.setText("");
         }
            
    
             if(input==x){
                 jlbl1.setText("no of trials you took"+Integer.toString(trials));
                       jlbl4.setText("wow u just guessed the number press exit button to exit");
                       
             jlbl2.setText("");
             
             jlbl3.setText("");
                       
         }
         if(input<x&&input>=0){
             jlbl2.setText("the input number is less than the random number try again");
              jlbl1.setText("trials"+Integer.toString(trials));
              jlbl4.setText("");
             trials++;
            
             
         }
        
         if(input>x&&input<=100){
             
              jlbl2.setText("the input number is greater than the random number try again");
             jlbl1.setText("trials"+Integer.toString(trials));
             jlbl4.setText("");
              trials++;
                    
            
         }
      
      
        }
        else
        {
            exit(0);
        }
     }    
         
        
     
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               new Random_Number();
           }
        });
    }
    
}
