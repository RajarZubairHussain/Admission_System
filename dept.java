import java.util.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.*; 
import javax.swing.*;



public class dept implements ActionListener {
    Frame win = new Frame();
    Label fac = new Label("Faculty");
    Label deptId = new Label("Department Id");
    Label deptName = new Label("Department Name");
    Label remarks = new Label("Remarks");

    JComboBox combo = new JComboBox<>();

    TextField t1 = new TextField();
    TextField t2 = new TextField();

    TextArea ta = new TextArea();

    List li = new List();
    

    Button add = new Button("Add");
    Button update = new Button("Update");
    Button delete = new Button("Delete");
    Button clear = new Button("Clear");
    Button back = new Button("Back");

    Label heading = new Label("Department Table");

    Font f = new Font("arial",Font.BOLD,30);

    dept(){
        win.setBounds(400,0,650,600);
        win.setLayout(null);

        heading.setBounds(200,50,300,30);
        heading.setFont(f);

        fac.setBounds(100,100,100,25);
        combo.setBounds(190,100,180,25);

        li.setBounds(400,100,150,280);

        deptId.setBounds(100,150,100,25);
        t1.setBounds(210,150,160,25);

        deptName.setBounds(100,200,100,25);
        t2.setBounds(210,200,160,25);

        remarks.setBounds(100,250,100,25);
        ta.setBounds(100,280,290,100);

        add.setBounds(100,400,50,25);
        update.setBounds(170,400,50,25);
        delete.setBounds(240,400,50,25);
        clear.setBounds(330,400,50,25);
        back.setBounds(400,400,50,25);

        win.add(add);
        win.add(clear);
        win.add(back);
        win.add(delete);
        win.add(update);

        win.add(heading);

        win.add(fac);
        win.add(deptId);
        win.add(deptName);
        win.add(remarks);

        win.add(combo);
        win.add(li);

        win.add(t1);
        win.add(t2);

        win.add(ta);

        win.setVisible(true);

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);
        clear.addActionListener(this);
        back.addActionListener(this);




    }
    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        dept ob = new dept();
    }

}
