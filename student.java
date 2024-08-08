import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class student implements ActionListener {
    Frame win = new Frame();
    Label fac = new Label("Faculty");
    Label dept = new Label("Department");
    Label pro = new Label("Program");
    Label batchYear = new Label("Batch Year");
    Label shift = new Label("Shift");
    Label group = new Label("Group");
    Label stId = new Label("Student Id");
    Label stName = new Label("Student Name");
    Label fName = new Label("Father's Name");
    Label surname = new Label("Surname");
    Label rollNo = new Label("Roll no");
    Label remarks = new Label("Remarks");

    JComboBox combo1 = new JComboBox<>();
    JComboBox combo2 = new JComboBox<>();
    JComboBox combo3 = new JComboBox<>();
    JComboBox combo4 = new JComboBox<>();
    JComboBox combo5 = new JComboBox<>();
    JComboBox combo6 = new JComboBox<>();

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    TextField t4 = new TextField();
    TextField t5 = new TextField();

    Button add = new Button("Add");
    Button update = new Button("Update");
    Button delete = new Button("Delete");
    Button clear = new Button("Clear");
    Button back = new Button("Back");

    TextArea ta = new TextArea();
    List li = new List();

    Label heading = new Label("Student Table");

    Font f = new Font("arial",Font.BOLD,30);


    student(){
        win.setBounds(0,0,1000,800);
        win.setLayout(null);

        win.setBackground(Color.lightGray.brighter());

        heading.setBounds(400,50,200,30);
        heading.setFont(f);

        fac.setBounds(100,100,100,25);
        combo1.setBounds(200,100,100,25);

        dept.setBounds(100,150,100,25);
        combo2.setBounds(200, 150, 100, 25);

        pro.setBounds(100,200,100,25);
        combo3.setBounds(200,200,100,25);

        batchYear.setBounds(100,250,100,25);
        combo4.setBounds(200,250,100,25);

        shift.setBounds(330,250,100,25);
        combo5.setBounds(400,250,100,25);

        group.setBounds(530,250,100,25);
        combo6.setBounds(600,250,100,25);

        stId.setBounds(100,300,100,25);
        t1.setBounds(200,300,100,25);

        stName.setBounds(100,350,100,25);
        t2.setBounds(200,350,100,25);

        fName.setBounds(100,400,100,25);
        t3.setBounds(200,400,100,25);

        surname.setBounds(100,450,100,25);
        t4.setBounds(200,450,100,25);

        rollNo.setBounds(330,450,50,25);
        t5.setBounds(400,450,100,25);

        remarks.setBounds(100,500,100,25);
        ta.setBounds(100,530,550,100);

        add.setBounds(100,650,50,25);
        update.setBounds(185,650,50,25);
        delete.setBounds(270,650,50,25);
        clear.setBounds(355,650,50,25);
        back.setBounds(440,650,50,25);

        li.setBounds(730,100,200,530);

        win.add(combo1);
        win.add(combo2);
        win.add(combo3);
        win.add(combo4);
        win.add(combo5);
        win.add(combo6);

        win.add(fac);
        win.add(dept);
        win.add(pro);
        win.add(stId);
        win.add(stName);
        win.add(fName);
        win.add(rollNo);
        win.add(batchYear);
        win.add(surname);
        win.add(shift);
        win.add(group);
        win.add(remarks);


        win.add(t1);
        win.add(t2);
        win.add(t3);
        win.add(t4);
        win.add(t5);

        win.add(heading);
        

        win.add(ta);
        win.add(li);

        win.add(add);
        win.add(clear);
        win.add(back);
        win.add(delete);
        win.add(update);

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
        student ob = new student();
    }
    
}
