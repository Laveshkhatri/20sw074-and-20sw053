import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


class desine implements ActionListener, MouseListener {

    JFrame frame;
    JButton button1, button2, button3, button4;
    JPanel panel1, panel2, panel3, panel4, panel5, panel6;
    JLabel label1, label2, label3, callimage;
    ImageIcon icon, icon1, icon2, icon3, icon4;
    ImageIcon icon5, icon6;


    desine() {
        frame = new JFrame("hotel managment system");
        frame.setBounds(100, 10, 1100, 650);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);

        icon5 = new ImageIcon("opy1.jpg");
        frame.setIconImage(icon5.getImage());

        panel1 = new JPanel();
        panel1.setBounds(0, 0, 1100, 280);
        panel1.setBackground(Color.BLACK);
        panel1.setLayout(null);
        label1 = new JLabel();
        icon = new ImageIcon("bg.png");

        label1.setIcon(icon);
        label1.setBounds(260, -40, 440, 400);

        label2 = new JLabel("03043934140");
        label2.setBounds(70, 10, 130, 30);
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        label2.setForeground(Color.white);


        callimage = new JLabel();
        icon6 = new ImageIcon("iconcal.png");

        callimage.setIcon(icon6);
        callimage.setBounds(20, 10, 50, 50);


        panel2 = new JPanel();
        panel2.setBounds(0, 260, 1100, 320);
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(null);

        icon1 = new ImageIcon("lllo.png");

        button1 = new JButton("manage customers", icon1);
        button1.setHorizontalTextPosition(JButton.CENTER);
        button1.setVerticalTextPosition(JButton.BOTTOM);

        button1.setBounds(130, 100, 180, 160);

        button1.setFont(new Font("Serif", Font.BOLD, 15));
        button1.setFocusable(false);

        button1.setBackground(Color.orange);


        icon2 = new ImageIcon("llllo.png");

        button2 = new JButton("Manage Rooms", icon2);
        button2.setHorizontalTextPosition(JButton.CENTER);
        button2.setVerticalTextPosition(JButton.BOTTOM);

        button2.setFocusable(false);
        button2.setBounds(330, 100, 180, 160);

        button2.setFont(new Font("Serif", Font.BOLD, 15));


        icon3 = new ImageIcon("lapt1.png");
        button3 = new JButton("manage employee", icon3);

        button3.setBounds(530, 100, 180, 160);


        button3.setHorizontalTextPosition(JButton.CENTER);
        button3.setVerticalTextPosition(JButton.BOTTOM);
        button3.setFont(new Font("Serif", Font.BOLD, 15));

        button3.setFocusable(false);

        icon4 = new ImageIcon("car.png");
        button4 = new JButton("manage Drivers", icon4);

        button4.setBounds(730, 100, 180, 160);


        button4.setHorizontalTextPosition(JButton.CENTER);
        button4.setVerticalTextPosition(JButton.BOTTOM);
        button4.setFont(new Font("Serif", Font.BOLD, 15));


        button4.setFocusable(false);
        panel3 = new JPanel();
        panel3.setBounds(0, 580, 1100, 70);
        panel3.setBackground(Color.black);
        panel3.setLayout(null);
        label3 = new JLabel("Developed by lovesh Khatri-All Rights Reserved ®2021");
        label3.setBounds(360, 0, 500, 30);
        label3.setForeground(Color.WHITE);

        label3.setFont(new Font("Serif", Font.PLAIN, 15));


        panel2.setBackground(Color.BLACK);


        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.white);
        button4.setBackground(Color.WHITE);


        frame.add(panel1);


        panel1.add(label1);
        panel1.add(label2);
        panel1.add(callimage);
        frame.add(panel2);

        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);

        frame.add(panel3);

        panel3.add(label3);
        button3.addActionListener(this);
        button1.addActionListener(this);
        button4.addActionListener(this);
        button2.addActionListener(this);

        button3.addMouseListener(this);
        button1.addMouseListener(this);
        button4.addMouseListener(this);
        button2.addMouseListener(this);
        frame.validate();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {

            entrycustomer obj = new entrycustomer();
            frame.dispose();
        } else if (e.getSource() == button3) {

            addemp oooobj = new addemp();
            frame.dispose();

        } else if (e.getSource() == button4) {

            ride ojb = new ride();
            frame.dispose();

        } else if (e.getSource() == button2) {

            roomsmanag ojbt = new roomsmanag();
            frame.dispose();
        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == button1) {
            button1.setBackground(Color.orange);
        } else if (e.getSource() == button2) {
            button2.setBackground(Color.orange);

        } else if (e.getSource() == button3) {
            button3.setBackground(Color.orange);
        } else if (e.getSource() == button4) {
            button4.setBackground(Color.orange);

        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==button1) {
            button1.setBackground(Color.WHITE);

        }
        else if (e.getSource()==button2) {
            button2.setBackground(Color.WHITE);

        }
        else if (e.getSource()==button3) {
            button3.setBackground(Color.WHITE);

        }
        else if (e.getSource()==button4) {
            button4.setBackground(Color.WHITE);

        }



    }
}










public class home {

    public static void main(String[] args) {
    desine oobj=new desine();
    }
}
