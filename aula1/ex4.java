//Desenvolver um algoritmo para ler o valor inteiro da idade de uma pessoa e imprimir uma das mensagens:se idade <= 13: Criança, 
//se idade > 13 e <= 18: Adolescente, se idade > 18 e <= 60: Adulto e se idade > 60:Idoso.

import java.util.Scanner;

class Main{
    public static void main(String[ ] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        
        int idade = myObj.nextInt();
        
        if (idade <= 13){
            System.out.println("Criança");
        } else if (idade > 13 && idade <= 18){
            System.out.println("Adolescente");    
        } else if (idade > 18 && idade <= 60){
            System.out.println("Adulto");
        } else{
            System.out.println("Idoso");
        }
    }
}
