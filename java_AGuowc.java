import java.util.Scanner;
public class Primeiraclasse{
  public static void main(String[]args){
    Aluno patropi = new Aluno();
    Scanner entrada = new Scanner(System.in);
    
    System.out.printf("Nome do aluno:");
    patropi.nome = entrada.nextLine();
    
    System.out.printf("Nota em Matematica:");
    patropi.notaMat = entrada.nextDouble();
    
    System.out.printf("Nota em Fisica:");
    patropi.notaFis = entrada.nextDouble();
    
    //Exibindo dados
    
    System.out.printf("O aluno \"%s\" tirou %2.2f em Matematica,"+ "%2.2f em Fisica e obteve media %2.2f\n", patropi.nome,patropi.notaMat,patropi.notaFis,(patropi.notaMat+patropi.notaFis)/2);
  }
}

    
  	
    