
package converter.assessment;

import javax.swing.JOptionPane;

public class ConverterAssessment 
    {
    
    public static void main(String[] args) 
        {

        String user_num;
        int num;
        double inch;
        double feet;
     
        do
        {
          
        user_num = JOptionPane.showInputDialog("Enter Number 1, 2 or 3 ");
        num = Integer.parseInt(user_num);
         
        switch(num)
        {

            case 1:
                user_num = JOptionPane.showInputDialog
                (null, "Enter value in cm");
                num = Integer.parseInt(user_num);
                inch = num*0.393701;
                JOptionPane.showMessageDialog(null, ""+ inch);
                break;
            case 2:
                user_num = JOptionPane.showInputDialog
                (null, "Enter value in m");
                num = Integer.parseInt(user_num);
                feet = num*3.28084;
                JOptionPane.showMessageDialog(null, ""+ feet);
                break;
            case 3:
                break;        
        }
        }

        while(num !=3);
        }
    }
