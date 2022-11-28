package aplication;
import java.util.Locale;
import java.util.Scanner;
import entities.Salario;
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      Salario sa = new Salario();
      
      System.out.print("Nome: ");
      sa.nome = sc.nextLine();
      System.out.print(" Salario Bruto: ");
      sa.salario = sc.nextDouble();
      System.out.print("Valor do imposto: ");
      sa.taxa = sc.nextDouble();
      System.out.println();
      System.out.println("Salario: " + sa);
      System.out.println();
      System.out.print("Qual percentagem para acrementar ao salario? ");
      double percentage = sc.nextDouble();
      sa.increaseSalary(percentage);
      System.out.println();
      System.out.println("Novo salario com a taxa de aumento: " + sa);
      sc.close();
	}
}