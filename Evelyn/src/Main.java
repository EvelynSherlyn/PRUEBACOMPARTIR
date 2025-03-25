public class Main {
    public static void main(String[] args) {
        String frase= "Buenas-esto-es-una_prueba";
        String output = Solution.toCamelCase(frase);
        System.out.println(frase+"\n"+output);
    }
}