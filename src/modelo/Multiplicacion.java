
package modelo;


public class Vcono extends Operacion
{
      public Vcono (double x, double y)
        {
           super(x,y);
        }
        public void Multiplicacion()
        {
            resultado = (Math.PI * x * x * y) / 3;
        }
}

  