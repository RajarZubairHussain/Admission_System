import java.util.*;

import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import javax.swing.*;

public class program implements ActionListener {
    Frame win = new Frame();
    Label fac = new Label("Faculty");
    Label dept = new Label("Department");
    Label proId = new Label("Program Id");
    Label proName = new Label("Program Name");
    Label sem = new Label("Duration-in-Semesters");
    Label remarks = new Label("Remarks");

    JComboBox combo1 = new JComboBox<>();
    JComboBox combo2 = new JComboBox<>();

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();

    TextArea ta = new TextArea();

    List li = new List();
    

    Button add = new Button("Add");
    Button update = new Button("Update");
    Button delete = new Button("Delete");
    Button clear = new Button("Clear");
    Button back = new Button("Back");

    Label heading = new Label("Program Table");

    Font f = new Font("arial",Font.BOLD,30);

    program(){
        win.setBounds(400,0,650,600);
        win.setLayout(null);

        heading.setBounds(250,50,200,30);
        heading.setFont(f);

        fac.setBounds(100,100,100,25);
        combo1.setBounds(250,100,100,25);

        dept.setBounds(100,150,100,25);
        combo2.setBounds(250,150,100,25);

        proId.setBounds(100,200,100,25);
        t1.setBounds(250,200,100,25);

        proName.setBounds(100,250,100,25);
        t2.setBounds(250,250,100,25);

        sem.setBounds(100,300,100,25);
        t3.setBounds(250,300,100,25);

        remarks.setBounds(100,350,100,25);
        ta.setBounds(100,380,270,100);

        add.setBounds(100,500,50,25);
        update.setBounds(155,500,50,25);
        delete.setBounds(210,500,50,25);
        clear.setBounds(265,500,50,25);
        back.setBounds(320,500,50,25);

        li.setBounds(380,100,200,375);


        win.add(add);
        win.add(clear);
        win.add(back);
        win.add(delete);
        win.add(update);

        win.add(heading);

        win.add(fac);
        win.add(dept);
        win.add(proId);
        win.add(proName);
        win.add(sem);

        win.add(remarks);

        win.add(combo1);
        win.add(combo2);
        win.add(li);

        win.add(t1);
        win.add(t2);
        win.add(t3);

        win.add(ta);

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
        program ob = new program();
    }
}