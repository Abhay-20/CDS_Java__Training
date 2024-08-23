import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConvert extends JFrame
{
    JLabel l11,l12,l3,l4;
    JTextField t1,t2;
    JButton b1;
    CurrencyConvert(String s1)
    {
        super(s1);
    }
    CurrencyConvert()
    {

    }
    void setComponent()
    {
        l11=new JLabel("INR");
        l12=new JLabel("Dollar");
        l3=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("Calculate");
        l4=new JLabel();
        setLayout(null);
        add(l11);
        add(l12);
        add(l3);
        add(t1);
        add(t2);
        add(b1);
        add(l4);
        l11.setBounds(10,10,250,20);
        t1.setBounds(10,30,265,20);
        l12.setBounds(10,65,250,20);
        t2.setBounds(10,90,265,20);
        l3.setBounds(100,120,100,20);
        b1.setBounds(80,200,140,20);
        l4.setBounds(100,150,100,20);
        b1.addActionListener(new btn());

    }

    public static void main(String[] args)
    {
        CurrencyConvert a=new CurrencyConvert("Currency Convert");
        a.setVisible(true);
        a.setSize(300,300);
        a.setComponent();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    class btn implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                float inr =Float.parseFloat(t1.getText());
                float cD= (float) (inr/83.73);
                l3.setText("INR to Dollar:-"+cD);
                float dol=Float.parseFloat((t2.getText()));
                float cI=(float)(dol*83.73);
                l4.setText("Dollar to INR:-"+cI);
            }
            catch(Exception e1){}






        }
    }
}
