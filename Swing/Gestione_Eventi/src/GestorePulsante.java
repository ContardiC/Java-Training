

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GestorePulsante implements ActionListener{
    private JTextArea area;
    public GestorePulsante(JTextArea a){
        this.area=a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pulsante=e.getActionCommand();
        if(pulsante.equals("superiore")){


                System.out.println(" E' stato premuto il pulsante superiore ");


            // area.append(" E' stato premuto il pulsante superiore");
        }
        if(pulsante.equals("inferiore")){
            System.out.println(" E' stato premuto il pulsante inferiore");

            // area.append("E' stato premuto il pulsante inferiore");
        }
    }
}
