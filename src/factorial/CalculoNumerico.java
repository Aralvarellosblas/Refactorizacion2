package factorial;

/**
 *
 * @author Arturo
 */
public class CalculoNumerico {

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