package vista;

import controlador.Principal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PanelPrincipal extends JPanel
{
    // Atributos
    private JLabel lbY, lbR;
    private JTextField tfY1, tfY2, tfRadio;
    private JButton btCalcular;
    JTextArea taResultado;
    JScrollPane spResultado;
    
    public PanelPrincipal()
    {
        setLayout(null);
        
        TitledBorder borde = BorderFactory.createTitledBorder("CALCULADORA DE VOLUMENES");
        borde.setTitleColor(Color.RED);
        setBorder(borde);
        
        lbY = new JLabel("A :", JLabel.LEFT);
        lbY.setFont(new Font("Arial", Font.PLAIN, 12));
        lbY.setForeground(Color.BLUE);
        lbY.setBounds(10, 30, 160, 20);
        add(lbY);
        
        // Campo de texto 1
        tfY1 = new JTextField();
        tfY1.setBounds(50, 30, 50, 20);
        add(tfY1);
        tfY1.setFont(new java.awt.Font("Arial", Font.PLAIN, 14));
        tfY1.setForeground(new java.awt.Color(0, 0, 0));
        tfY1.setBackground(Color.white);        
        
                  
        
        // Etiqueta radio
        lbR = new JLabel("B:", JLabel.LEFT);
        lbR.setFont(new Font("Arial", Font.PLAIN, 12));
        lbR.setForeground(Color.BLUE);
        lbR.setBounds(10, 60, 160, 20);
        add(lbR);
        
        // Campo de texto Radio
        tfRadio = new JTextField();
        tfRadio.setBounds(50, 60, 50, 20);
        add(tfRadio);
        tfRadio.setFont(new java.awt.Font("Arial", Font.PLAIN, 14));
        tfRadio.setForeground(new java.awt.Color(0, 0, 0));
        tfRadio.setBackground(Color.white);
        
        // BotÃ³n calcular
        btCalcular = new JButton("Calcular");
        btCalcular.setBounds(10, 90, 280, 20);
        add(btCalcular);
        btCalcular.setActionCommand("Calcular");
        btCalcular.setBackground(Color.white);  
        
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10, 120, 280, 230);
        add(spResultado);  
    }

    public String getTA() 
    {
        return tfY1.getText();
    }
    
    public String getTB() 
    {
        return tfRadio.getText();
    }
    
    public void mostrarResultado(String string) 
    {
        taResultado.append(string+"\n");
    }
    
    public void agregarOyentesBotones(ActionListener pAL) 
    {
        btCalcular.addActionListener(pAL);
    }
    
    public void borrar()
    {
        taResultado.setText("");
    }
}