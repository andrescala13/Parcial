/
package modelo;


public class Vcilindro extends Operacion
{
      public Vcilindro(double x, double y)
        {
            super(x,y);
        }
        public void Resta()
        {
            resultado =   Math.PI*(x*x)*y;
        }
    
}