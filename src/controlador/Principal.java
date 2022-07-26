package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Division;
import modelo.Multiplicacion;
import modelo.Operacion;
import modelo.Resta;
import modelo.Acubo;
import vista.VentanaPrincipal;


public class Principal implements ActionListener
{
    private VentanaPrincipal pVentanaPrincipal;
    private  Operacion pOperacion;

       public Principal(VentanaPrincipal pVentanaPrincipal, Operacion pOperacion)
    {
        this.pVentanaPrincipal = pVentanaPrincipal;
        this.pOperacion = pOperacion;

        this.pVentanaPrincipal.miPanelPrincipal.agregarOyentesBotones(this);
    }

       @Override
    public void actionPerformed(ActionEvent e) 
    {
        String comando = e.getActionCommand();
 if(comando.equals("Calcular"))
        {
            pVentanaPrincipal.miPanelPrincipal.borrar();
            double x = Double.parseDouble(pVentanaPrincipal.miPanelPrincipal.getTA());
            double y = Double.parseDouble(pVentanaPrincipal.miPanelPrincipal.getTB());

            Acubo miVcubo = new Vcubo(x);
            miVcubo.Vcubo();

            Resta miVcilindro = new Cilindro(x,y);
            miVcilindro.Cilindro();

            Multiplicacion miVcono = new Cono (x,y);
            miVcono.Cono();

            Division miVesfera = new Esfera(x,y);
            miVesfera.Esfera();

            pVentanaPrincipal.miPanelPrincipal.mostrarResultado("El volumen del cubo es " + miAcubo.mostrarResultado() + 
             "\n El volumen del cilindro es" +  miVcilindro.mostrarResultado() +
             "\n el volumen del cono es" + miVcono.mostrarResultado() + 
             "\n el volumen de la esfera es" + miDivision.mostrarResultado());


        }7

    }

}