






















    import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.awt.Color.WHITE;

    class entrycustomer implements ActionListener {

        JFrame frame;
        JTable table;
        JTextField field;
        JTextField field1;
        JTextField field2;
        JTextField field3, field4, field5, field6;
        JButton button, button1, button2, button3, button4;
        private JPanel pannel;
        private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12, label13;

        private DefaultTableModel model;
        private ImageIcon icon;
        JScrollPane pane;
        private JComboBox box1, box2, box3, box4, box5, box6, box7;

        String data;
        String[][] row = {};
        String[] colum = {"name", "Gender", "Mobile No", "Nationality", "Room no", "Room type", "bed type",
                "tax", "CheckIn date", "Checkout Date", "No of days", "rent paid"};
        String[] gndr = {"male", "female"};
        String[] nat = {"pakistan", "india", "japan", "quba", "germani", "dubai", "london", "bangladas"};
        String[] room = {"01", "02", "03", "04", "05", "06", "07", "08"};
        String[] roomtype = {"Ac", " non Ac"};
        String[] badtype = {"single bad", "double bad"};


        entrycustomer() {

            frame = new JFrame("new customers entry");
            frame.setBounds(190, 30, 900, 600);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.getContentPane().setBackground(WHITE);

            icon = new ImageIcon("log.png");
            frame.setIconImage(icon.getImage());

            label1 = new JLabel("Name");
            label2 = new JLabel("Gender");
            label3 = new JLabel("mobile no");
            label1.setBounds(30, 300, 40, 20);
            label2.setBounds(30, 350, 70, 20);
            label3.setBounds(30, 400, 60, 20);


            label4 = new JLabel("Room no");
            label5 = new JLabel("Nattionality");
            label6 = new JLabel("tax");
            label4.setBounds(300, 300, 70, 20);
            label5.setBounds(300, 350, 100, 20);
            label6.setBounds(300, 400, 80, 20);


            label7 = new JLabel("manage customers");
            label7.setForeground(Color.BLACK);
            label7.setBounds(20, 200, 500, 70);
            label7.setFont(new Font("Serif", Font.BOLD, 45));


            label8 = new JLabel("Bad Type");
            label9 = new JLabel("No of days");
            label10 = new JLabel("Room Type");
            label8.setBounds(600, 350, 90, 20);
            label9.setBounds(600, 400, 100, 20);
            label10.setBounds(600, 300, 70, 20);


            label11 = new JLabel("Check in");
            label12 = new JLabel("Check out");
            label13 = new JLabel("Rent paid");
            label11.setBounds(30, 450, 70, 20);
            label12.setBounds(300, 450, 90, 20);
            label13.setBounds(600, 450, 100, 20);


            field = new JTextField();
            field.setBounds(100, 300, 130, 30);
            field1 = new JTextField();
            field1.setBounds(100, 400, 130, 30);
            field2 = new JTextField();
            field2.setBounds(400, 400, 130, 30);
            field3 = new JTextField();
            field3.setBounds(700, 400, 130, 30);
            field4 = new JTextField();
            field4.setBounds(100, 450, 130, 30);
            field5 = new JTextField();
            field5.setBounds(400, 450, 130, 30);
            field6 = new JTextField();
            field6.setBounds(700, 450, 130, 30);


            box1 = new JComboBox(gndr);
            box1.setBounds(100, 350, 130, 30);
            box2 = new JComboBox(nat);
            box2.setBounds(400, 350, 130, 30);
            box3 = new JComboBox(room);
            box3.setBounds(400, 300, 130, 30);
            box4 = new JComboBox(roomtype);
            box4.setBounds(700, 300, 130, 30);
            box5 = new JComboBox(badtype);
            box5.setBounds(700, 350, 130, 30);


            pannel = new JPanel(new GridLayout());
            pannel.setBounds(0, 0, 900, 200);
            model = new DefaultTableModel(row, colum);
            table = new JTable(model);


            button = new JButton("ADD");
            button.setBounds(30, 520, 80, 30);
            button1 = new JButton("View");
            button1.setBounds(150, 520, 80, 30);
            button2 = new JButton("Clear");
            button2.setBounds(280, 520, 80, 30);
            button.setBackground(Color.BLACK);
            button.setForeground(WHITE);
            button1.setBackground(Color.BLACK);
            button1.setForeground(WHITE);
            button2.setBackground(Color.BLACK);
            button2.setForeground(WHITE);


            button3 = new JButton("Back");
            button3.setBounds(750, 520, 80, 30);
            button3.setBackground(Color.BLACK);
            button3.setForeground(WHITE);


            button4 = new JButton("receipt");
            button4.setBounds(400, 520, 80, 30);

            button4.setBackground(Color.BLACK);
            button4.setForeground(WHITE);

            button4.setFont(new Font("Arial", Font.BOLD, 13));


            frame.add(label1);
            frame.add(label2);
            frame.add(label3);
            frame.add(label4);
            frame.add(label5);
            frame.add(label6);
            frame.add(label10);
            frame.add(label8);
            frame.add(label9);
            frame.add(label7);
            frame.add(label11);
            frame.add(label12);
            frame.add(label13);


            frame.add(button4);
            frame.add(button);
            frame.add(button1);
            frame.add(button2);
            frame.add(button3);

            frame.add(box1);
            frame.add(box2);
            frame.add(box3);
            frame.add(box4);
            frame.add(box5);


            frame.add(field);
            frame.add(field1);
            frame.add(field2);
            frame.add(field3);
            frame.add(field4);
            frame.add(field5);
            frame.add(field6);


            frame.add(pannel);
            pannel.add(new JScrollPane(table));
            pannel.setBackground(new Color(49, 43, 51));

            table.setForeground(WHITE);
            table.setBackground(Color.BLACK);


            button.addActionListener(this);
            button3.addActionListener(this);
            button1.addActionListener(this);
            button2.addActionListener(this);


            button4.addActionListener(this);


        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                data = field.getText();

                String data1 = (String) box1.getSelectedItem();
                String data2 = field1.getText();

                String data4 = (String) box3.getSelectedItem();
                String data3 = (String) box2.getSelectedItem();
                String data5 = (String) box4.getSelectedItem();
                String data6 = (String) box5.getSelectedItem();

                String data7 = field2.getText();
                String data8 = field5.getText();
                String data9 = field4.getText();
                String data10 = field3.getText();
                String data11 = field6.getText();


                String[] newrow = {data, data1, data2, data3, data4, data5, data6, data7, data9, data8, data10, data11};
                model.addRow(newrow);
                String def = " ";

                field.setText(def);
                field1.setText(def);
                field2.setText(def);
                field3.setText(def);
                field4.setText(def);
                field5.setText(def);
                field6.setText(def);


                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelroyal", "root", "laveshkumar");

                    Statement statt = con.createStatement();

                    String linee = "insert into customers values('" + data + "','" + data1 + "','"
                            + data2 + "', '" + data3 + "', '" + data4 + "' ,'" + data5 + "','" + data6 + "','" + data7 + "'" +
                            ",'" + data9 + "','" + data8 + "','" + data10 + "','" + data11 + "')";

                    statt.executeUpdate(linee);


                } catch (Exception ee) {
                    //ee.printStackTrace();

                }


            } else if (e.getSource() == button3) {
                desine oobj = new desine();
                frame.dispose();
            } else if (e.getSource() == button2) {
                int i = table.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);
                } else {

                    JOptionPane.showMessageDialog(frame, "please select row dear", "row missing", JOptionPane.WARNING_MESSAGE);

                }


            } else if (e.getSource() == button1) {


                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelroyal", "root", "laveshkumar");

                    Statement st = obj.createStatement();
                    String sql = "select * from customers";
                    ResultSet rs = st.executeQuery(sql);
                    while (rs.next()) {


                        String name = rs.getString(1);
                        String gender = rs.getString(2);
                        String mobileno = rs.getString(3);
                        String nationality = rs.getString(4);
                        String roomno = rs.getString(5);
                        String roomtype = rs.getString(6);
                        String badtype = rs.getString(7);
                        String tax = rs.getString(8);
                        String checkin = rs.getString(9);
                        String checkout = rs.getString(10);
                        String days = rs.getString(11);
                        String rent = rs.getString(12);

                        String[] dekho = {name, gender, mobileno, nationality, roomno, roomtype, badtype, tax, checkin, checkout, days, rent};
                        DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();

                        tbmodel.addRow(dekho);


                    }


                } catch (Exception eee) {
                    eee.printStackTrace();

                }


            } else if (e.getSource() == button4) {
                data = field.getText();
                createrec rec = new createrec();


            }


        }
    }





public class customer {
    public static void main(String[] args) {
        entrycustomer obb=new entrycustomer();

    }
}
