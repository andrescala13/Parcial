
package modelo;


public class Vesfera extends Operacion
{
      public Vesfera (double x, double y)
        {
           super(x,y);
        }
        public void Division()
        {
            resultado = ((4/3) * Math.PI*(x*x*x));
        }
    
}