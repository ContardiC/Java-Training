import javax.swing.*;
import java.awt.*;

public class Pulsanti {
    public static void main(String args[]){
        JFrame frame= new JFrame("Pulsanti");
        JPanel panel=new JPanel();
        JButton sup=new JButton("superiore");
        JButton inf=new JButton("inferiore");
        JTextArea area=new JTextArea(50,10);
        panel.setLayout(new BorderLayout());
        panel.add(sup,"North");
        panel.add(inf,"South");
        panel.add(area,"Center");
        sup.addActionListener(new GestorePulsante(area));
        inf.addActionListener(new GestorePulsante(area));
        area.setEditable(false);
        frame.getContentPane().add(panel);
        frame.setSize(450,300);
        frame.setVisible(true);
    }
}
