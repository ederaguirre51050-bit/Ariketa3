import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Este es el tercer ejercicio de Jon Artzeniega y Eder Aguirre");
        Scanner sc = new Scanner(System.in);
        int radio;
        System.out.println("Dime el radio.");
        radio = sc.nextInt();
        double total = Math.PI * radio * radio;
        System.out.println(total);
        sc.close();

    }
}