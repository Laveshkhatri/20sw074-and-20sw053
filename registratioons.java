import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.*;


class program1 implements ActionListener {
    JFrame frame;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
    JTextField field1, field3, field4, field5;
    JRadioButton button, button1;
    JButton button2, button3,button4;
    JComboBox box;
    JCheckBox box1;
    ButtonGroup gender;

    JPasswordField pass;


    program1() {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBounds(200, 0, 700, 680);
        frame.getContentPane().setBackground(new Color(64, 34, 35));
        ImageIcon icon = new ImageIcon("register3.png");
        label1 = new JLabel();
        label1.setIcon(icon);
        label1.setBounds(-60, 0, 750, 250);
        label2 = new JLabel("User Name");


        label3 = new JLabel("Password");
        label4 = new JLabel("Email");

        label2.setBounds(100, 260, 200, 100);
        label2.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));

        label3.setBounds(100, 300, 200, 100);
        label3.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));

        label4.setBounds(100, 340, 200, 100);
        label4.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));


        field1 = new JTextField();
        pass = new JPasswordField();
        field3 = new JTextField();

        field1.setBounds(200, 290, 300, 30);
        pass.setBounds(200, 330, 300, 30);
        field3.setBounds(200, 380, 300, 30);

        label5 = new JLabel("Gender");
        label5.setBounds(100, 390, 100, 100);
        label5.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));


        button = new JRadioButton("Male");
        button1 = new JRadioButton("Female");
        button.setBounds(200, 430, 100, 20);
        button1.setBounds(300, 430, 100, 20);
        button.setBackground(new Color(64, 34, 35));
        button1.setBackground(new Color(64, 34, 35));


        button1.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));
        button.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));
gender=new ButtonGroup();
gender.add(button);
gender.add(button1);
        label6 = new JLabel("City");
        label6.setBounds(100, 430, 100, 100);
        label6.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));
        String[] city = {"None", "Karachi", "hydrabad", "mirpurkhas", "jamshoro", "lahore", "Kashmore"};

        box = new JComboBox(city);
        box.setBounds(200, 470, 300, 30);
        box.setSelectedIndex(0);


        label7 = new JLabel("Country");

        label7.setBounds(100, 490, 200, 100);
        label7.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));

        field4 = new JTextField();
        field4.setBounds(200, 520, 300, 30);


        label8 = new JLabel("phone number");

        label8.setBounds(100, 530, 200, 100);
        label8.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));

        field5 = new JTextField();
        field5.setBounds(200, 560, 300, 30);


        box1 = new JCheckBox("Accept terms and condictions");
        box1.setBounds(90, 620, 300, 18);
        box1.setBackground(new Color(64, 34, 35));
        box1.setFont(new Font("Alternate Gothic.", Font.PLAIN, 20));


        button2 = new JButton("Register");
        button3 = new JButton("Clear");
        button2.setBounds(480, 600, 100, 30);
        button3.setBounds(600, 600, 80, 30);

        button2.setBackground(Color.BLACK);
        button2.setForeground(Color.WHITE);
        button2.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));


        button3.setBackground(Color.BLACK);
        button3.setForeground(Color.WHITE);
        button3.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));



        button4 = new JButton("back");
        button4.setBackground(Color.BLACK);
        button4.setForeground(Color.WHITE);
        button4.setFont(new Font("Alternate Gothic.", Font.PLAIN, 15));

        button4.setBounds(400, 600, 70, 30);



        label2.setForeground(Color.WHITE);
        label3.setForeground(Color.WHITE);
        label4.setForeground(Color.WHITE);
        label5.setForeground(Color.WHITE);
        label6.setForeground(Color.WHITE);
        label7.setForeground(Color.WHITE);

        label8.setForeground(Color.WHITE);
        button.setForeground(Color.WHITE);
        button1.setForeground(Color.WHITE);
        box1.setForeground(Color.white);





        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(field1);
        frame.add(pass);
        frame.add(field3);
        frame.add(button);
        frame.add(button1);
        frame.add(label6);
        frame.add(box);
        frame.add(label7);
        frame.add(field4);
        frame.add(label8);
        frame.add(field5);
        frame.add(box1);
        frame.add(button3);
        frame.add(button2);

frame.add(button4);
        


        button2.addActionListener(this);
button3.addActionListener(this);

        button4.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button2) {
            if (box1.isSelected()) {


                String cc;
                if (button.isSelected()) {


                    cc = "male";
                } else
                    cc = "female";


                String data1 = "Name:" + field1.getText() + "\n" + "Email:"

                        + field3.getText() + "\n"
                        + "Country:" + field4.getText() + "\n" + "password:" + pass.getText() + "\n"
                        + "Phone No:" + field5.getText() + "\n" + "city:" + box.getSelectedItem() + "\n" + "gender:" + cc;


                JOptionPane.showMessageDialog(frame, "Congratulation! Registration done succesfully" + "\n\n\n" + data1, "Registration", JOptionPane.PLAIN_MESSAGE);


            } else
                JOptionPane.showMessageDialog(frame, "please accept terms and condictions", "accept condictions", WARNING_MESSAGE);

        }


          else if (e.getSource()==button3) {
            String def = "";
     field1.setText(def);
     pass.setText(def);
     field3.setText(def);
     field4.setText(def); field5.setText(def);





        }


          else if (e.getSource()==button4){



               appp  ooomk= new appp();
              frame.dispose();

          }










    }

}



class registratioons {
    public static void main(String[] args) {

        program1 obj = new program1();
    }


    }





















