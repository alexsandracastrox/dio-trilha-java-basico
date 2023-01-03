import java.util.Scanner;

public class AboutMe {

 public static void main(String[] args) {
    try (//criando o objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
        System.out.println("Alexsandra");
        String nome = scanner.next();
        
        System.out.println("Castro");
        String sobrenome = scanner.next();

        System.out.println("39");
        int idade = scanner.nextInt();
        
        System.out.println("1.58");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
    
    
}
}







   

    




