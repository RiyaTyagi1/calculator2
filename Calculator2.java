import java.awt.*;
import java.awt.event.*;


class Calculator2 implements ActionListener
{
    Frame F= new Frame();
    Label l1 = new Label("First Number ");
    Label l2 = new Label("Second  Number ");
    Label l3 = new Label("Result ");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();


    Button b1 = new Button("ADD");
    Button b2 = new Button("SUB");
    Button b3 = new Button("MUL");
    Button b4 = new Button("DIV");
    Button b5 = new Button("CANCEL");

    Calculator2()
    {
        l1.setBounds(50,100,100,20);
        l2.setBounds(50,140,100,20);
        l3.setBounds(50,180,100,20);
        t1.setBounds(200,100,100,20);
        t2.setBounds(200,140,100,20);
        t3.setBounds(200,180,100,20);
        b1.setBounds(50,250,50,20);
        b2.setBounds(110,250,50,20);
        b3.setBounds(170,250,50,20);
        b4.setBounds(230,250,50,20);
        b5.setBounds(290,250,50,20);

        F.add(l1);
        F.add(l2);
        F.add(l3);
        F.add(t1);
        F.add(t2);
        F.add(t3);
        F.add(b1);
        F.add(b2);
        F.add(b3);
        F.add(b4);
        F.add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this); 
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        F.setLayout(null);
        F.setVisible(true);
        F.setSize(400, 350);
    }

        public void actionPerformed(ActionEvent  e)
        {
            int n1= Integer.parseInt(t1.getText());
            int n2= Integer.parseInt(t2.getText());

            if(e.getSource()==b1)
            {
                t3.setText(String.valueOf(n1+n2));
            }
             if(e.getSource()==b2)
            {
                t3.setText(String.valueOf(n1-n2));
            }
             if(e.getSource()==b3)
            {
                t3.setText(String.valueOf(n1*n2));
            }
             if(e.getSource()==b4)
            {
                t3.setText(String.valueOf(n1/n2));
            }
             if(e.getSource()==b5)
            {
              System.exit(0);
            }
        }
        public static void main(String...s) 
        {   new Calculator2();}
            
    }



