import java.util.*;
import java.awt.*;
import java.awt.List;
import java.awt.event.*;


public class  faculty implements ActionListener{
    Frame win = new Frame();
    Label facId = new Label("Faculty Id");
    Label facName = new Label("Faculty Name");
    Label remarks = new Label("Remarks");

    TextField tf1 = new TextField();
    TextField tf2 = new TextField();

    TextArea ta = new TextArea();
    List list = new List();

    Button add = new Button("Add");
    Button update = new Button("Update");
    Button delete = new Button("Delete");
    Button clear = new Button("Clear");
    Button back = new Button("Back");

    Label heading = new Label("Department Table");
    Font f = new Font("arial",Font.BOLD,30);
         faculty(){
                 win.setBounds(200,0,700,500);
                 win.setLayout(null);
                 heading.setBounds(200,50,300,30);
                 heading.setFont(f);
  
             
                facId.setBounds(50,100,80,25);
                tf1.setBounds(140,100,100,25);

                facName.setBounds(50,150,80,25);
                tf2.setBounds(140,150,100,25);

                remarks.setBounds(50,200,100,25);
                ta.setBounds(50,230,350,100);

                list.setBounds(430,100,200,300);

                add.setBounds(50,350,50,25);
                update.setBounds(120,350,50,25);
                delete.setBounds(190,350,50,25);
                clear.setBounds(260,350,50,25);
                back.setBounds(330,350,50,25);

                win.add(add);
                win.add(clear);
                win.add(back);
                win.add(delete);
                win.add(update);

                win.add(tf1);
                win.add(tf2);
                win.add(facId);
                win.add(facName);
                win.add(remarks);
                win.add(ta);
                win.add(list);

                win.add(heading);

                

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
            faculty ob = new faculty();
    }

    
}