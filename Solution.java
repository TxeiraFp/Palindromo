
public class Solution {
    public static boolean isPalindrome(int numero) {
        String str = Integer.toString(numero); // Corrige o uso de Integer em vez de "integer"
        int left = 0;
        int right = str.length() - 1; // Corrige a atribuição para calcular o índice corretamente
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) { // Corrige o uso do método charAt nos índices corretos
                return false;
            }
            left++;
            right--;
        }

        return true; // Move o retorno verdadeiro para fora do loop
    }

    public static void main(String[] args) {
        int numero = 121;
        System.out.println(numero + " é palíndromo? " + isPalindrome(numero));

        numero = 123;
        System.out.println(numero + " é palíndromo? " + isPalindrome(numero));
    }
}
