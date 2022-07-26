package ejecutable;

import controlador.Principal;
import modelo.Operacion;
import vista.VentanaPrincipal;


public class Ejecutable 
{
    public static void main(String[] args) 
    {
        // Llamar todo para la ejecución
        VentanaPrincipal pVentanaPrincipal = new VentanaPrincipal();
        Operacion pOperacion = null;

        Principal miPrincipal = new Principal(pVentanaPrincipal, pOperacion);
    }
}