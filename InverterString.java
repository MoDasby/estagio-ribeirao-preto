import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = palavra.length() -1; i >= 0; i--) {
            stringBuilder.append(palavra.charAt(i));
        }

        System.out.println(stringBuilder);

        scanner.close();
    }
}
