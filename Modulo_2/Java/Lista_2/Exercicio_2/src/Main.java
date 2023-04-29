import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        final int numeroDeHabitantes = 4;
        int[] numeroDeFlhos = new int[numeroDeHabitantes];
        double mediaNumeroDeFilhos = 0.0;

        double[] salario = new double[numeroDeHabitantes];
        double mediaSalario = 0.0, maiorSalario = 0.0;
        int percentualSalarial = 0;

        for (int i = 0; i < numeroDeHabitantes; i++) {
            System.out.println("Digite o salário do " + (i + 1) + "º habitante e quantos filhos ele tem!");
            salario[i] = leia.nextDouble();
            numeroDeFlhos[i] = leia.nextInt();

            mediaSalario = mediaSalario + salario[i];
            mediaNumeroDeFilhos = mediaNumeroDeFilhos + numeroDeFlhos[i];

            if (maiorSalario < salario[i]) {
                maiorSalario = salario[i];
            }

            if (salario[i] < 1000) {
                percentualSalarial++;
            }
        }

        percentualSalarial = (percentualSalarial * 100) / numeroDeHabitantes;

        System.out.println("Medial salarial: " + mediaSalario / numeroDeHabitantes + "R$");
        System.out.println("Media do numero de filhos por habitante: " + mediaNumeroDeFilhos / numeroDeHabitantes);
        System.out.println("Maior salario: " + maiorSalario + "R$");
        System.out.println("Percentual de pessoas com salario ate R$1000,00 é " + percentualSalarial + "%");
    }
}