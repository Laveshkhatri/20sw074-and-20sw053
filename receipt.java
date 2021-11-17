
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

class createrec implements ActionListener {

    JFrame frame;
    JTextArea field1;
    JButton print;
ImageIcon icon;
JLabel label;

    createrec(){

        frame=new JFrame("receipt");
        frame.setBounds(400,0,420,750);
        frame.setVisible(true);
frame.setLayout(null);
field1=new JTextArea();
field1.setBounds(-150,0,620,600);


icon=new ImageIcon("bg.png");
label=new JLabel();
label.setIcon(icon);
label.setBounds(50,-40,430,300);
frame.setResizable(false);

field1.setText("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t*************************************" +
        "**********\n\t\t\t\t....RECEIPT....\n\t\t\t" +
        "*****************************" +
        "******************\n\t\t\t\tRoyalhotel.com\n\t\t\tnear baria town karachi,sindh pakistan\n\t\t\t\t03043934140\n*\t\t\t***" +
        "******************************************" +
        "\n\n\t\t\tName"+"\t:\tlovesh"+"\n\n\t\t\tRoom No"+"\t:\tr-N#20"+"\n\n\t\t\tDays stay"+"\t:\tfive\t"+"\n\n\t\t\t*******************************" +
        "***************" +
        "\n\t\t\tTotal Amount\t:\t50000\t"+""+"\n\t\t\t*********************************************" +
        "**\n\t\t\t....THANK YOU COME AGAIN....\n\t\t\t*************" +
        "**********************************" +
        "\n\t\t\tSoftware By : lovesh Khatri\n\t\t\tContact: loveshkhatri@gmail.com");
print=new JButton("print");
print.setBounds(290,600,80,30);



print.setBackground(Color.BLACK);
print.setForeground(Color.WHITE);
frame.getContentPane().setBackground(Color.WHITE);


        frame.add(field1);
        field1.add(label);
frame.add(print);
print.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            field1.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }
}












public class receipt {
    public static void main(String[] args) {

        createrec rec=new createrec();
    }
}
