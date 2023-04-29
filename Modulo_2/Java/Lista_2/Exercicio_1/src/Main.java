import java.util.Scanner;

public class Main {
    public static String categoria(int idade){
        String resultado = "";

        if(idade >= 5 && idade <= 7){
            resultado = "Infantil A";
        }else if(idade >= 8 && idade <= 10){
            resultado = "Infantil B";
        }else if(idade >= 11 && idade <= 13){
            resultado = "Juvenil A";
        }else if(idade >= 14 && idade <= 17){
            resultado = "Juvenil B";
        }else if(idade >= 18){
            resultado = "Adulto";
        }else{
            resultado =  "Idade inválida!";
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String resultado = "";
        int idade = leia.nextInt();
        resultado = categoria(idade);
        System.out.println("Categoria " + resultado);
    }
}