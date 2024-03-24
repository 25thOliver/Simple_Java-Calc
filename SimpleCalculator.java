import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame
{
   private JLabel l1, l2, l3, l4, l5, l6, l7;
   private JTextField t1, t2, t3;
   private JButton b1, b2, b3;
   
   public Calculator()
   {
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(null);
      l1 = new JLabel("Simple Calculator");
      l1.setFont(new Font("Times New Roman", Font.BOLD,30));
      l1.setForeground(Color.BLUE);
      l1.setBounds(60,10,300,30);
      add(l1);

      l2 = new JLabel("First Number");
      l2.setBounds(60,60,200,30);
      l2.setToolTipText("first number");
      add(l2);
      
      l3 = new JLabel("Second Number");
      l3.setBounds(60,120,200,30);
      l3.setToolTipText("second number");
      add(l3);

      l4 = new JLabel("Third Number");
      l4.setBounds(60,180,200,30);
      l4.setToolTipText("third number");
      add(l4);

      l5 = new JLabel("Sum: ");
      l5.setBounds(350,60,200,30);
      l5.setToolTipText("sum of three number");
      add(l5);

      l6 = new JLabel("Product: ");
      l6.setBounds(350,100,200,30);
      l6.setToolTipText("product of three numbers");
      add(l6);
    
      l7 = new JLabel("Average: ");
      l7.setBounds(350,140,200,30);
      l7.setToolTipText("average of three numbers");
      add(l7);

      t1 = new JTextField(10);
      t1.setBounds(160,60,120,30);
      add(t1);

      t2 = new JTextField(10);
      t2.setBounds(160,120,120,30);
      add(t2);

      t3 = new JTextField(10);
      t3.setBounds(160,180,120,30);
      add(t3);

      b1 = new JButton("Calculate");
      b1.setBounds(60, 220, 100, 30);
      b1.setForeground(Color.BLUE);
      b1.setToolTipText("click for calculations");
      add(b1);

      b2 = new JButton("Clear");
      b2.setBounds(180, 220, 100, 30);
      b2.setForeground(Color.BLUE);
      b2.setToolTipText("click to clear initial inputs");
      add(b2);

      b3 = new JButton("Exit");
      b3.setBounds(300, 220, 100, 30);
      b3.setForeground(Color.BLUE);
      b3.setToolTipText("quit/close the calculator");
      add(b3);

      b1.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double num3 = Double.parseDouble(t3.getText());
            l5.setText("Sum: " + (num1 + num2 + num3));
            l6.setText("Product: " + (num1 * num2 * num3));
            l7.setText("Average: " + ((num1 + num2 + num3)/3));
         }
      });

      b2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            t1.setText("");
            t2.setText("");
            t3.setText("");
         }
      });
  
      b3.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            System.exit(0);
         }
      });

   }
}

class SimpleCalculator
{
   public static void main(String args[])
   {
      Calculator c = new Calculator();
      c.setBounds(400,200,700,350);
      c.setVisible(true);
   }
}