package factorial;

/**
 * Esta clase contienen el metodo main para la generacion del numero
 *
 * @author Arturo 6037
 */
public class Factorial{

    /**
     * El metodo main se encarga de crear un objeto de la clase CalculoNumerico
     * y de recoger el numero que devuelve el metodo calculoNumero para despues
     * mostrarlo en pantalla
     *
     * @param args
     */
    public static void main(String[] args){
        int f;
        CalculoNumerico n=new CalculoNumerico();
        f=n.calculoNumero();
        System.out.println(f);

    }

}
