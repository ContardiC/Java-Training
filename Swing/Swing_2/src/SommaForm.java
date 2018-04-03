import jdk.internal.jline.internal.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SommaForm {


    JButton sumBtn=new JButton();

    public SommaForm() {
        sumBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1=Integer.parseInt(num1Txt.toString());
                Log.debug("Numero 1: "+n1);
            }
        });
    }

    public static void main(String args[]){
        JButton sumBtn=new JButton();

        JTextField num1Txt=new JTextField();
        JTextField num2Txt=new JTextField();
        JLabel risLbl=new JLabel();
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.add(num1Txt);
        panel.add(num2Txt);
        panel.add(sumBtn);
        panel.add(risLbl);
        Container container=frame.getContentPane();
        container.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);

    }


}
