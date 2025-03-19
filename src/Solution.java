/**
 * Clase resuelta de la kata de String to Camel Case
 * @author Evelyn S.
 * @see <a href="https://github.com/EvelynSherlyn/KataLV6-StringToCamelCase.git">Repositorio</a>
 * @version V1.3, 19-03-2025
 * @method *toCamelCase: Transformación de String a String Camel Case
 */
public class Solution{
    /**
     * Este método pasará Strings para ser transformados a CamelCase
     * @param s donde se pasará la string. Esta String tendrá "-" y "_" que deberán ser borrados
     *          para así ser transformados en CamelCase, además de poner en
     *          mayúsculas la letra siguiente a estos.
     * @return String ya transformado en CamelCase
     * @example Entrada: hola-Don_pepito Salida: HolaDonPepito
     */
    static public String toCamelCase(String s){
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
