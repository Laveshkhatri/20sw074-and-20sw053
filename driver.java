import com.sun.source.tree.StatementTree;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

class ride implements ActionListener{

    JFrame frame;
    JPanel tablepannel;
    JPanel imagepannel;
    JPanel formpannel;
    ImageIcon icon;
    JLabel imagelabel,namelabel,agelabel,genderlabel,joblabel,salarylabel,phonelabel,addresslabel,emaillabel,title;
    JComboBox genderbox,jobbox;
    JTextField namefield,agefield,phonefield,addressfield,emailfield;
    JButton add,update,delet,back;

    String[]job={"Yes","No"};
    String[]genderr={"male","female"};



    JTable table;
    DefaultTableModel model,model1;



    String [][]row={};
    String [] colum={"Name","Salary","Gender","Available","Phoneno"," Carbrand","Location"};





    ride(){

        frame=new JFrame("driverr managment");
        frame.setBounds(180,30,1000,600);
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
        icon=new ImageIcon("nn.png");
        imagelabel.setIcon(icon);
        imagelabel.setBounds(10,0,540,350);
        imagepannel.setLayout(null);








        formpannel=new JPanel();
        formpannel.setBackground(Color.WHITE);
        formpannel.setBounds(0,200,500,400);
        formpannel.setLayout(null);
        









        title=new JLabel("Manage Driver");
        title.setFont(new Font("Serif", Font.BOLD, 50));
        title.setBounds(10,0,500,80);
        namelabel =new JLabel("name");
        namelabel.setBounds(20,90,50,40);
        namefield=new JTextField();
        namefield.setBounds(90,100,130,30);
        agelabel =new JLabel("age");
        agelabel.setBounds(280,90,50,40);
        agefield=new JTextField();
        agefield.setBounds(350,100,130,30);


        genderlabel =new JLabel("Gender");
        genderlabel.setBounds(20,150,50,40);
        genderbox=new JComboBox(genderr);
        genderbox.setBounds(90,150,130,30);
        joblabel =new JLabel("Available");
        joblabel.setBounds(280,150,80,40);
        jobbox=new JComboBox(job);
        jobbox.setBounds(350,150,130,30);


        phonelabel =new JLabel("Phone No");
        phonelabel.setBounds(20,210,60,30);
        phonefield=new JTextField(10);
        phonefield.setBounds(90,210,130,30);


        addresslabel =new JLabel("Location");
        addresslabel.setBounds(280,210,70,40);

        addressfield=new JTextField(15);
        addressfield.setBounds(350,210,130,30);


        emaillabel =new JLabel("Car Brand");
        emaillabel.setBounds(20,270,60,40);
        emailfield=new JTextField(28);
        emailfield.setBounds(90,270,390,30);

        add=new JButton("add");
        update=new JButton("View");
        delet=new JButton("Clear");

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
        formpannel.add(agefield);

        formpannel.add(genderlabel);
        formpannel.add(genderbox);

        formpannel.add(joblabel);
        formpannel.add(jobbox);


        formpannel.add(phonelabel);
        formpannel.add(phonefield);


        formpannel.add(addresslabel);
        formpannel.add(addressfield);


        formpannel.add(emaillabel);
        formpannel.add(emailfield);


        formpannel.add(add);
        formpannel.add(update);


        formpannel.add(delet);
        formpannel.add(back);
        table.setBackground(Color.BLACK);
        table.setForeground(Color.WHITE);


        back.addActionListener(this);

        delet.addActionListener(this);
        add.addActionListener(this);
update.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == add) {
            String data1 = namefield.getText();
            String data2 = agefield.getText();


            String data3 = (String) genderbox.getSelectedItem();
            String data4 = (String) jobbox.getSelectedItem();
            String data5 = phonefield.getText();
            String data6 = emailfield.getText();

            String data7 = addressfield.getText();

            String[] newrow = {data1, data2, data3, data4, data5, data6, data7};

            model.addRow(newrow);


            String def = "";

            namefield.setText(def);
            agefield.setText(def);
            emailfield.setText(def);
            addressfield.setText(def);
            phonefield.setText(def);

            try {



                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelroyal", "root", "laveshkumar");

                Statement stat=con.createStatement();








                String linee = "insert into driver values('" + data1 + "','" + data2 + "','" + data3 + "', '" + data4 + "', '" + data5 + "' ,'" + data6 + "','" + data7 + "')";
                stat.executeUpdate(linee);

            } catch (Exception ee) {
                //ee.printStackTrace();

            }
        } else if (e.getSource() == back) {


            desine oobj = new desine();
            frame.dispose();

        }

        else if (e.getSource() == delet) {

            for (int x = 10-1 ; x >= 0; x--) {

model.removeRow(x);
        }
        }




        else if (e.getSource()==update) {


            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection obj = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelroyal", "root", "laveshkumar");

                Statement st=obj.createStatement();
                String sql="select * from driver";
                ResultSet rs=st.executeQuery(sql);
                while (rs.next()) {


                    String name = rs.getString(1);

                    String salary = rs.getString(2);

                    String gender = rs.getString(3);
                    String available = rs.getString(4);
                    String phoneno = rs.getString(5);
                    String location = rs.getString(6);
                    String carbrand = rs.getString(7);

                    String[] dekho = {name, salary, gender, available, phoneno, location,carbrand};
                    DefaultTableModel tbmodel = (DefaultTableModel) table.getModel();

                    tbmodel.addRow(dekho);








                }


            }

            catch (Exception eee) {
               eee.printStackTrace();

            }









        }


        }








}







public class driver {
    public static void main(String[] args) {
    ride ojb=new ride();
    }
}
