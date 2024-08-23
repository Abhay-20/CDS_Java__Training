import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICAL extends JFrame
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1;
    BMICAL(String s1)
    {
        super(s1);
    }
    BMICAL()
    {

    }

    void setComponent()
    {
        l1=new JLabel("ENTER Your weight :- ");
        l2=new JLabel("ENTER Your Height :- ");
        l3=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("Calculate");
        l4=new JLabel();
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(b1);
        add(l4);
        l1.setBounds(10,10,250,20);
        t1.setBounds(10,30,265,20);
        l2.setBounds(10,65,250,20);
        t2.setBounds(10,90,265,20);
        l3.setBounds(100,120,100,20);
        b1.setBounds(80,200,140,20);
        l4.setBounds(100,150,100,20);
        b1.addActionListener(new btn1());

    }
    public static void main(String[] args)
    {
        BMICAL a=new BMICAL("BMI CALCULATOR");
        a.setVisible(true);
        a.setSize(300,300);
        a.setComponent();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    class btn1 implements ActionListener
    {
        float bmi;

        @Override
        public void actionPerformed(ActionEvent e)
        {
            float he=Float.parseFloat(t2.getText());
            float we=Float.parseFloat(t1.getText());
            bmi=we/(he*he);
            if(bmi<=18.4)
            {
                l3.setText("UnderWeight");
                l3.setForeground(Color.RED);
            }
            if(18.5<bmi && bmi<24.9)
            {
                l3.setText("Normal Weight");
                l3.setForeground(Color.BLUE);
            }
            if(25.0<bmi && bmi<39.9)
            {
                l3.setText("Overweight");
                l3.setForeground(Color.magenta);
            }
            if(bmi>=40.0)
            {
                l3.setText("Obese");
                l3.setForeground(Color.GREEN);

            }
            l4.setText(String.valueOf(bmi));
        }
    }

}
