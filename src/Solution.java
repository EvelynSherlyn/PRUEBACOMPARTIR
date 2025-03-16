import java.util.Arrays;

/**
 * @author Evelyn S.
 * @link <a href="https://github.com/EvelynSherlyn/KataLV6-StringToCamelCase.git">...</a>
 */
class Solution{
    /**
     * @param s donde se pasará la string
     * @return String ya transformado en CamelCase
     */
    static String toCamelCase(String s){
        String[] aux = s.split("");
        for (int i=0; i< aux.length; i++) {
            if (aux[i].equals("-")) {
                aux[i] = "";
                aux[i+1] = aux[i+1].toUpperCase();
            }
        }
        return Arrays.toString(aux);
    }
}
