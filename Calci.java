 import java.awt.*;
 import java.awt.event.*;


 
 class Calci 
 {    
public static void main(String Arg[])
{
    MarvellousCalculator mobj = new MarvellousCalculator(400,500,"Calculater");

}
 }
 class MarvellousCalculator extends WindowAdapter implements ActionListener
 {
   public Frame fobj ; 
   public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b11,b10,b12,b13,b14,b15;
   public TextField t1,t2;
   public Label lobj;
   public Integer No1,No2;

   public  MarvellousCalculator(int width,int height,String title){
       fobj = new Frame (title);
       fobj.setSize(width,height);

       fobj.addWindowListener(this);

       b1  = new Button("ADD (+)");
       b2  = new Button ("SUB (-)");
       b3  = new Button("MULTI (*))");
       b4  = new Button ("DIV (/)");
       b5  = new Button ("1");
       b6  = new Button ("2");
       b7  = new Button ("3");
       b8  = new Button ("4");
       b9  = new Button ("5");
       b10 = new Button ("6");
       b11 = new Button ("7");
       b12 = new Button ("8");
       b13 = new Button ("9");
       b14 = new Button ("0");
       b15 = new Button ("00");

     
       t1 = new TextField();
       t2 = new TextField();

       b1.setBounds(290,210,80,40);
       b2.setBounds(290, 270,80,40);
       b3.setBounds(290,330,80,40);
       b4.setBounds(290,390,80,40);
       
       b5.setBounds(20,210,50,40);         //  1
       b6.setBounds(100,210,50,40);        //  2
       b7.setBounds(180,210,50,40);        //   3

       b8.setBounds(20,270,50,40);         //   4
       b9.setBounds(100,270,50,40);        //    5
       b10.setBounds(180,270,50,40);       //   6

       b11.setBounds(20,330,50,40);        //   7
       b12.setBounds(100,330,50,40);       //    8
       b13.setBounds(180,330,50,40);       //    9

       b14.setBounds(60,390,50,40);         //    0
       b15.setBounds(140,390,50,40);        //    00

       //   Numerbs Buttons 
       t1.setBounds(70,100,100,40);
       t2.setBounds(220,100,100,40);

       fobj.add(b1);
       fobj.add(b2);
       fobj.add(b3);
       fobj.add(b4);
       fobj.add(b5);
       fobj.add(b6);
       fobj.add(b7);
       fobj.add(b8);
       fobj.add(b9);
       fobj.add(b10);
       fobj.add(b11);
       fobj.add(b12);
       fobj.add(b13);
       fobj.add(b14);
       fobj.add(b15);



       fobj.add(t1);
       fobj.add(t2);
      

       lobj = new Label();
       lobj.setBounds(150,25,200,100);
       fobj.add(lobj);

       b1.addActionListener(this);   // Pluse Action Listener 
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);

       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       b10.addActionListener(this);
       b11.addActionListener(this);
       b12.addActionListener(this);
       b13.addActionListener(this);
       b14.addActionListener(this);
       b15.addActionListener(this);

       


       fobj.setLayout(null);
       fobj.setVisible(true);

   }
   public void WindoClosing(WindowEvent obj)  // Event Handeler for Frame
   {
    System.exit(0);
   }
   
 
   public void actionPerformed(ActionEvent aobj){
    try 
    {
       int  No1 = Integer.parseInt(t1.getText());

       int  No2 = Integer.parseInt(t2.getText());
        
       
      
        if(aobj.getSource() == b1)  {
            lobj.setText("Addition is : "+(No1 + No2));
        }
        if(aobj.getSource() == b2)  {
            lobj.setText("Substraction is : "+(No1 - No2));
        }
        if(aobj.getSource() == b3)  {
            lobj.setText("Multiplication is : "+(No1 * No2));
        }
        if(aobj.getSource() == b4)  {
            lobj.setText("Division is : "+(No1 / No2));
        }
    }
    catch (Exception eobj){}
   }
}