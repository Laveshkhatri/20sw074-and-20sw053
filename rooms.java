
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


class roomsmanag implements ActionListener{




    JFrame frame;
    JPanel tablepannel;
    JPanel imagepannel;
    JPanel formpannel;
    ImageIcon icon;
    JLabel imagelabel,namelabel,agelabel,genderlabel,joblabel,salarylabel,phonelabel,addresslabel,emaillabel,title;
    JComboBox genderbox,jobbox,roomtypebox,conditionbox,floorbox;
    JTextField namefield,phonefield;
    JButton add,update,delet,back;

    String[]job={"booked","available"};
    String[]genderr={"double bad","single bad"};


    String[]room={"Ac Room","non Ac room"};
    String[]condition={"cleaned","dirty"};

    String[]floor={"1st","2nd","3rd","4th","5th","6th","7th"};



    JTable table;
    DefaultTableModel model;



    String [][]row={};
    String [] colum={"room no","room type","bad type","condition","floor","rent","status"};




    roomsmanag(){






        frame=new JFrame("manage rooms");
        frame.setBounds(150,30,1000,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);



        tablepannel=new JPanel();

        tablepannel.setBounds(0,0,1000,200);
        tablepannel.setLayout(new GridLayout());
        model= new DefaultTableModel(row,colum);



        table=new JTable(model);



















        imagepannel=new JPanel();
        imagepannel.setBackground(Color.WHITE);
        imagepannel.setBounds(500,200,500,400);





        imagelabel=new JLabel();
        icon=new ImageIcon("chabi.png");
        imagelabel.setIcon(icon);
        imagelabel.setBounds(60,0,400,400);
        imagepannel.setLayout(null);








        formpannel=new JPanel();
        formpannel.setBackground(Color.WHITE);
        formpannel.setBounds(0,200,500,400);
        formpannel.setLayout(null);

        title=new JLabel("Manage Rooms");
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setBounds(20,0,500,80);
        namelabel =new JLabel("Room No");
        namelabel.setBounds(20,90,80,40);
        namefield=new JTextField();
        namefield.setBounds(90,100,130,30);
        agelabel =new JLabel("RoomType");
        agelabel.setBounds(280,95,90,40);
        roomtypebox=new JComboBox(room);
        roomtypebox.setBounds(350,100,130,30);


        genderlabel =new JLabel("Bed Type");
        genderlabel.setBounds(20,150,120,40);
        genderbox=new JComboBox(genderr);
        genderbox.setBounds(90,150,130,30);
        joblabel =new JLabel("status ");
        joblabel.setBounds(280,150,90,40);
        jobbox=new JComboBox(job);
        jobbox.setBounds(350,150,130,30);


        phonelabel =new JLabel("rent");
        phonelabel.setBounds(20,210,60,30);
        phonefield=new JTextField();
        phonefield.setBounds(90,210,130,30);



        addresslabel =new JLabel("Floor");
        addresslabel.setBounds(280,210,70,40);


conditionbox=new JComboBox(condition);
conditionbox.setBounds(90,280,130,30);

        emaillabel =new JLabel("condition");
        emaillabel.setBounds(20,270,60,40);
floorbox=new JComboBox(floor);
floorbox.setBounds(350,220,130,30);



        add=new JButton("add");
        update=new JButton("View");
        delet=new JButton("Clean");

        add.setBackground(Color.BLACK);
        delet.setBackground(Color.BLACK);
        update.setBackground(Color.BLACK);

        add.setForeground(Color.WHITE);
        add.setBounds(20,320,80,30);
        update.setForeground(Color.WHITE);
        update.setBounds(160,320,80,30);
        delet.setForeground(Color.WHITE);
        delet.setBounds(270,320,80,30);



        back=new JButton("back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(400,320,80,30);






        frame.add(tablepannel);
        tablepannel.add(new JScrollPane(table));
        frame.add(formpannel);
        frame.add(imagepannel);
        imagepannel.add(imagelabel);

        formpannel.add(title);

        formpannel.add(namelabel);
        formpannel.add(namefield);


        formpannel.add(agelabel);
        formpannel.add(roomtypebox);

        formpannel.add(genderlabel);
        formpannel.add(genderbox);

        formpannel.add(joblabel);
        formpannel.add(jobbox);


        formpannel.add(phonelabel);
        formpannel.add(phonefield);


        formpannel.add(addresslabel);
        formpannel.add(conditionbox);


        formpannel.add(emaillabel);
        formpannel.add(floorbox);


        formpannel.add(add);
        formpannel.add(update);


        formpannel.add(delet);
        formpannel.add(back);
        table.setBackground(Color.BLACK);
        table.setForeground(Color.WHITE);

        add.addActionListener(this);
        back.addActionListener(this);
        update.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == add) {
            String data1 = namefield.getText();
            String data2 = (String) roomtypebox.getSelectedItem();

            String data3 = (String) genderbox.getSelectedItem();
            String data4 = (String) jobbox.getSelectedItem();

            String data5 = (String) floorbox.getSelectedItem();
            String data6 = phonefield.getText();
            String data7 = (String) conditionbox.getSelectedItem();

            String[] newrow = {data1, data2, data3, data7, data5, data6, data4};
            model.addRow(newrow);
            String def = "";

            namefield.setText(def);

            phonefield.setText(def);


            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelroyal", "root", "laveshkumar");

                Statement kkk=con.createStatement();







                String linee = "insert into rooms values('" + data1 + "','" + data2 + "','"
                        + data3 + "', '" + data7 + "', '" + data5 + "' ,'" + data6 + "','" + data4 + "')";
                kkk.executeUpdate(linee);

            } catch (Exception ee) {
                //ee.printStackTrace();

            }


        } else if (e.getSource() == back) {


            desine oobj = new desine();
            frame.dispose();

        } else if (e.getSource() == update) {


            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelroyal", "root", "laveshkumar");

                Statement st = obj.createStatement();
                String sql = "select * from rooms";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {


                    String roomno = rs.getString(1);

                    String roomtype = rs.getString(2);

                    String bedtype = rs.getString(3);
                    String condition = rs.getString(4);
                    String floor = rs.getString(5);
                    String rent = rs.getString(6);
                    String status = rs.getString(7);

                    String[] dekho = {roomno, roomtype, bedtype, condition, floor, rent, status};
                    DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();

                    tbmodel.addRow(dekho);


                }


            }
            catch (Exception eee) {
                eee.printStackTrace();

            }







//else if

        }

    }
    }










public class rooms {
    public static void main(String[] args) {

        roomsmanag ojbt=new roomsmanag();

    }
}
