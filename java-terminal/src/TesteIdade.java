 import java.util.Scanner;
    public class TesteIdade {


   

public class Main {
    public static void main(String[] args)  { 
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite a primeira idade: ");
            int idade1 = leitor.nextInt();

            System.out.println("Digite a segunda idade: ");
            int idade2 = leitor.nextInt();

            System.out.println("Digite a terceira idade: ");
            int idade3 = leitor.nextInt();


            int media = (idade1 + idade2 + idade3)/3;


            if (media >= 0 && media <= 25){
                System.out.println("A turma é jovem");

            }else if
                (media >= 26 && media <= 60){
                System.out.println("a turma é adulta");

                }else{
                    if (media > 60){
                    System.out.println("A turma é idosa");
                }
            }
        }
    }
  }

    
}
