
import java.util.Scanner;

public class PrintMultiplicationTable{
public void findTable(int n){
    for(int i=1; i<=10; i++){
        System.out.println(n + " * " + i + " = " + (n * i));
    }
}
public static void main(String[] args) {
    System.out.println("Enter The Number To Print Multiplication Table:");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    PrintMultiplicationTable table = new PrintMultiplicationTable();
    table.findTable(number);
}
}