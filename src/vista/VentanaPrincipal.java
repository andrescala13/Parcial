/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class VentanaPrincipal extends JFrame
{
    // Atributos
    public PanelPrincipal miPanelPrincipal;

    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //Creación y adición del inicio de sesion
        miPanelPrincipal = new PanelPrincipal();
        miPanelPrincipal.setBounds(10, 10, 300, 360);
        add(miPanelPrincipal);

        //Caracteristicas de la ventana
        setTitle("Operaciones Herencia");
        setSize(335, 415);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
}