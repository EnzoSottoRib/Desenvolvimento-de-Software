//Escrever um algoritmo que receba a altura e a largura de um retângulo e calcule a sua área.

import java.util.Scanner;

class Main{
    public static void main(String[ ] args){
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite a largura: ");
        
        int alt = myObj.nextInt();
        
        System.out.println("Digite o comprimento: ");
        
        int larg = myObj.nextInt();
        
        int area = alt*larg;
        
    System.out.println("A área é: " + area);
    }
    
}
