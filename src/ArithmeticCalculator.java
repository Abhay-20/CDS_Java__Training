import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ArithmeticCalculator extends JFrame
{
    JTextField t1;
    JButton eq,AC,div,mul,mi,add;
    JButton on,tw,th,fo,fi,si,se,ei,ni,ze;

    ArithmeticCalculator(String s1)
    {
        super(s1);
    }
    ArithmeticCalculator()
    {

    }

    void setComponent()
    {
        Font f1=new Font("Times New Roman",Font.BOLD,40);
        Font f2=new Font("Times New Roman",Font.BOLD,30);
        eq = new JButton("=") ;
        eq.setFont(f1);
        AC = new JButton("AC") ;
        AC.setFont(f1);
        div = new JButton("/") ;
        div.setFont(f1);
        mul = new JButton("*") ;
        mul.setFont(f1);
        mi = new JButton("-") ;
        mi.setFont(f1);
        add = new JButton("+") ;
        add.setFont(f1);
        on = new JButton("1") ;
        on.setFont(f1);
        tw = new JButton("2") ;
        tw.setFont(f1);
        th = new JButton("3") ;
        th.setFont(f1);
        fo = new JButton("4") ;
        fo.setFont(f1);
        fi = new JButton("5") ;
        fi.setFont(f1);
        si = new JButton("6") ;
        si.setFont(f1);
        se = new JButton("7") ;
        se.setFont(f1);
        ei = new JButton("8") ;
        ei.setFont(f1);
        ni = new JButton("9") ;
        ni.setFont(f1);
        ze = new JButton("0") ;
        ze.setFont(f1);
        t1 =new JTextField();t1.setFont(f2);

        t1.setHorizontalAlignment(JTextField.RIGHT);

        setLayout(null);


        add(eq);add(AC);add(div);add(mul);add(mi);add(add);
        add(on);add(tw);add(th);add(fo);add(fi);add(si);add(se);
        add(ei);add(ni);add(ze);add(t1);
        eq.setBounds(359,559,92,92);
        AC.setBounds(359,250,92,92);
        div.setBounds(359,353,92,92);
        mul.setBounds(359,456,92,92);
        mi.setBounds(253,559,92,92);
        add.setBounds(50,559,92,92);
        on.setBounds(50,456,92,92);
        tw.setBounds(153,456,92,92);
        th.setBounds(253,456,92,92);
        fo.setBounds(50,353,92,92);
        fi.setBounds(153,353,92,92);
        si.setBounds(256,353,92,92);
        se.setBounds(50,250,92,92);
        ei.setBounds(153,250,92,92);
        ni.setBounds(256,250,92,92);
        ze.setBounds(153,559,92,92);

        t1.setBounds(50,40,400,180);
        AC.addActionListener(new Ac());
        on.addActionListener(this::btn1);
        tw.addActionListener(this::btn2);
        th.addActionListener(this::btn3);
        fo.addActionListener(this::btn4);
        fi.addActionListener(this::btn5);
        si.addActionListener(this::btn6);
        se.addActionListener(this::btn7);
        ei.addActionListener(this::btn8);
        ni.addActionListener(this::btn9);
        ze.addActionListener(this::btn0);
        add.addActionListener(this::add);
        mi.addActionListener(this::mi);
        div.addActionListener(this::di);
        mul.addActionListener(this::mul);
        eq.addActionListener(this::eqqu);


    }

    public static void main(String[] args)
    {
        ArithmeticCalculator a=new ArithmeticCalculator("ArithmeticCalculator");
        a.setVisible(true);
        a.setSize(500,700);
        a.setComponent();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Ac implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            t1.setText("");
        }
    }
    String Total,option;
    int num1;
    int num2;
    int result;
    private void txt(ActionEvent e1)
    {

    }
    private void add(ActionEvent ead)
    {
        option="+";
        num1=Integer.parseInt(t1.getText());
        t1.setText("");
    }
    private void mi(ActionEvent emi)
    {
        option="-";
        num1=Integer.parseInt(t1.getText());
        t1.setText("");
    }
    private void di(ActionEvent edi)
    {
        option="/";
        num1=Integer.parseInt(t1.getText());
        t1.setText("");
    }
    private void mul(ActionEvent emul)
    {
        option="*";
        num1=Integer.parseInt(t1.getText());
        t1.setText("");
    }
    private void btn1(ActionEvent e1)
    {
        String Total = t1.getText();
        t1.setText(Total+"1");
    }
    private void btn2(ActionEvent e2)
    {
        String Total = t1.getText();
        t1.setText(Total+"2");
    }
    private void btn3(ActionEvent e3)
    {
        String Total = t1.getText();
        t1.setText(Total+"3");
    }
    private void btn4(ActionEvent e4)
    {
        String Total = t1.getText();
        t1.setText(Total+"4");
    }
    private void btn5(ActionEvent e5)
    {
        String Total = t1.getText();
        t1.setText(Total+"5");
    }
    private void btn6(ActionEvent e6)
    {
        String Total = t1.getText();
        t1.setText(Total+"6");
    }
    private void btn7(ActionEvent e7)
    {
        String Total = t1.getText();
        t1.setText(Total+"7");
    }
    private void btn8(ActionEvent e8)
    {
        String Total = t1.getText();
        t1.setText(Total+"8");
    }
    private void btn9(ActionEvent e9)
    {
        String Total = t1.getText();
        t1.setText(Total+"9");
    }
    private void btn0(ActionEvent e0)
    {
        String Total = t1.getText();
        t1.setText(Total+"0");
    }
    private void eqqu(ActionEvent eq)
    {
        num2=Integer.parseInt(t1.getText());
        if(option.equals("+"))
        {
            result=num1+num2;
        }
        if(option.equals("-"))
        {
            result=num1-num2;
        }
        if(option.equals("*"))
        {
            result=num1*num2;
        }
        if(option.equals("/"))
        {
            result=num1/num2;
        }
        t1.setText(result+"");
    }



}
