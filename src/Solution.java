import java.util.Arrays;

/**
 * @author Evelyn S.
 * @link
*/
class Solution{
    /**
     * @param s donde se pasará la string
     * @return String ya transformado en CamelCase
     */
    static String toCamelCase(String s){
        String[] aux = s.split("");
        for (int i=0; i< aux.length; i++) {
            if (aux[i].equals("-") || aux[i].equals("_")) {
                aux[i] = "";
                aux[i+1] = aux[i+1].toUpperCase();
            }
        }
        return String.join("",aux);
    }
}
