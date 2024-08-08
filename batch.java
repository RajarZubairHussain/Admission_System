import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class batch implements ActionListener {
    Frame win = new Frame();
    Label fac = new Label("Faculty");
    Label dept = new Label("Department");
    Label pro = new Label("Program");
    Label batchId = new Label("Batch Id");
    Label batchYear = new Label("Batch Year");
    Label batchYear1 = new Label("Batch Year");
    Label shift = new Label("Shift");
    Label group = new Label("Group");
    Label remarks = new Label("Remarks");
    

    JComboBox combo1 = new JComboBox<>();
    JComboBox combo2 = new JComboBox<>();
    JComboBox combo3 = new JComboBox<>();
    JComboBox combo4 = new JComboBox<>();
    JComboBox combo5 = new JComboBox<>();

    TextField t1 = new TextField();
    TextField t2 = new TextField();

    TextArea ta = new TextArea();
    List li = new List();

    Button add = new Button("Add");
    Button update = new Button("Update");
    Button delete = new Button("Delete");
    Button clear = new Button("Clear");
    Button back = new Button("Back");

    Label heading = new Label("Batch Table");

    Font f = new Font("arial",Font.BOLD,30);

    batch(){
        win.setBounds(400,0,750,700);
        win.setLayout(null);

        heading.setBounds(300,50,200,30);

        heading.setFont(f);

        fac.setBounds(100,100,100,25);
        combo1.setBounds(200,100,100,25);

        batchYear1.setBounds(560,75,100,25);

        dept.setBounds(100,150,100,25);
        combo2.setBounds(200,150,100,25);

        pro.setBounds(100,200,100,25);
        combo3.setBounds(200,200,100,25);

        batchId.setBounds(100,250,100,25);
        t1.setBounds(200,250,100,25);

        batchYear.setBounds(100,300,100,25);
        t2.setBounds(200,300,100,25);

        shift.setBounds(100,350,100,25);
        combo4.setBounds(200,350,100,25);

        group.setBounds(330,350,100,25);
        combo5.setBounds(400,350,100,25);

        remarks.setBounds(100,400,100,25);
        ta.setBounds(100,430,420,100);

        add.setBounds(100,550,50,25);
        update.setBounds(185,550,50,25);
        delete.setBounds(270,550,50,25);
        clear.setBounds(355,550,50,25);
        back.setBounds(440,550,50,25);

        li.setBounds(530,100,150,430);

        win.add(combo1);
        win.add(combo2);
        win.add(combo3);
        win.add(combo4);
        win.add(combo5);

        win.add(heading);

        win.add(fac);
        win.add(dept);
        win.add(pro);
        win.add(batchId);
        win.add(batchYear);
        win.add(batchYear1);
        win.add(shift);
        win.add(group);
        win.add(remarks);


        win.add(add);
        win.add(clear);
        win.add(back);
        win.add(delete);
        win.add(update);

        win.add(t1);
        win.add(t2);

        win.add(ta);
        win.add(li);

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        clear.addActionListener(this);
        back.addActionListener(this);

        win.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){


    }

    public static void main(String[] args) {
        batch ob = new batch();
    }
}
