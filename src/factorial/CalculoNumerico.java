package factorial;

/**
 * Esta clase permite el calculo de un numero
 *
 * @author Arturo 6037
 */
public class CalculoNumerico{

    /**
     * Constructor por defecto de la clase CalculoNumerico
     */
    public CalculoNumerico(){
    }

    /**
     * Metodo encargado de calcular un número en función del valor inicial de j
     *
     * @return el metodo devuelve el valor resultante de la operacion
     */
    public int calculoNumero(){
        int j;
        int f;
        j=8;
        int i;
        if(j==0){
            f=1;
        }else{
            f=1;
            for(i=j; i>=1; i--){
                f=f*i;
            }
        }
        return f;
    }

}
