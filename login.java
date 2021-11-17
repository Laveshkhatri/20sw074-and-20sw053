import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.*;


class appp implements ActionListener {

    JFrame frame;
    JLabel label1, label2, label3, label4, label5, label6;

    JPanel panel;
    JLabel text;
    JTextField field;
    JPasswordField field1;
    JButton button, button1;


    appp() {

        frame = new JFrame("simple Gui app");

        frame.setLayout(null);
        frame.setBounds(170, 30, 800, 600);
frame.setVisible(true);

        frame.getContentPane().setBackground(Color.WHITE);
        frame.setResizable(false);


        panel = new JPanel();
        panel.setBounds(0, 0, 400, 600);
        panel.setBackground(new Color(59, 9, 11));
        panel.setLayout(null);


        label1 = new JLabel();
        ImageIcon icon = new ImageIcon("bg.png");
        label1.setIcon(icon);
        label1.setBounds(-60, 10, 500, 500);

        label2 = new JLabel("lovesh.ego");
        label2.setBounds(130, 320, 300, 80);
        label2.setFont(new Font("Serif", Font.BOLD, 40));
        label2.setForeground(new Color(44, 55, 77));


        label3 = new JLabel();
        ImageIcon icon1 = new ImageIcon("iv.png");
        label3.setIcon(icon1);
        label3.setBounds(550, 40, 128, 120);

        label4 = new JLabel("user name");
        label4.setBounds(480, 200, 100, 80);
        label4.setFont(new Font("Serif", Font.BOLD, 20));

        field = new JTextField();
        field.setBounds(480, 260, 240, 40);


        label5 = new JLabel("Password");
        label5.setBounds(480, 300, 100, 80);
        label5.setFont(new Font("Serif", Font.BOLD, 20));


        field1 = new JPasswordField();
        field1.setBounds(480, 360, 240, 40);


        button = new JButton("login");
        button.setBounds(480, 430, 100, 40);
        button.setFont(new Font("Serif", Font.BOLD, 20));
        button.setForeground(Color.white);
        button.setBackground(Color.BLACK);
        frame.add(panel);
        panel.add(label1);



        label6 = new JLabel("Not have account?");
        label6.setBounds(480, 470, 200, 40);
        label6.setFont(new Font("Serif", Font.PLAIN, 20));


        button1 = new JButton("Register");
        button1.setBounds(600, 430, 110, 40);
        button1.setFont(new Font("Serif", Font.BOLD, 20));
        button1.setForeground(Color.white);
        button1.setBackground(Color.BLACK);


        frame.add(label3);
        frame.add(label4);
        frame.add(field);

        frame.add(field1);
        frame.add(button);
        frame.add(label5);

        frame.add(button1);
        button1.addActionListener(this);
        button.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource()==button1) {
            program1 oooe=new program1();
            frame.dispose();
        }

        else if (e.getSource()==button){

            desine oobj=new desine();
            frame.dispose();
        }




    }
}

public class login {
    public static void main(String[] args) {
        appp obj = new appp();


    }
}














