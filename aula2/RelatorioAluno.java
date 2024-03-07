import java.util.Scanner;

class Main {
    public static void main(String[ ] args){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Digite a matrícula: ");
        int matricula = myObj.nextInt();
        myObj.nextLine();
        
        System.out.println("Digite o nome: ");
        String nome = myObj.nextLine();
        
        System.out.println("Digite a primeira nota: ");
        int nota1 = myObj.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        int nota2 = myObj.nextInt();
        
        float notaFinal = (nota1 + nota2) / 2;
            
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
    
        if (notaFinal > 6){
            System.out.println("Aprovado: (x) Sim ( ) Não");
        } else {
            System.out.println("Aprovado: ( ) Sim (x) Não");
        }
        
        System.out.println("Nota final: " + notaFinal);
    }
}
