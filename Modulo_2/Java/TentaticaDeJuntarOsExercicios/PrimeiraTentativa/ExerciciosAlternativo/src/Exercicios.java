import java.util.Scanner;

public class Exercicios {
    public static void exercicio1_1_1(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome!");
        String nome = leia.nextLine();
        System.out.println("Digite o seu sobrenome nome!");
        String sobrenome = leia.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome + ", seja bem vindo(a)!");
    }
    public static void exercicio1_1_2(){
        Scanner leia = new Scanner(System.in);
        int[] idade = new int[4];
        int media = 0;

        System.out.println("Digite 4 idades para o programa calcular a média entre elas.");

        for (int i = 0; i < 4; i++) {
            idade[i] = leia.nextInt();
            media = media + idade[i];
        }

        System.out.println("A média é " + media / 4);
    }

    public static void exercicio1_1_3(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o raio de um círculo para calcular a area dele!");

        double pi = 3.14;
        double raioCirculo = leia.nextDouble();

        double area = pi * Math.pow(raioCirculo, 2);

        System.out.println("A area do circulo é " + area);
    }
    public static void exercicio1_2_1(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite sua idade!");
        int idade = leia.nextInt();

        if (idade >= 18) {
            System.out.println("O usuário é maior de idade!");
        } else {
            System.out.println("O usuário é menor de idade!");
        }
    }

    public static void exercicio1_2_2(){
        Scanner leia = new Scanner(System.in);

        int[] nota = new int[4];
        double media = 0;

        System.out.println("Digite as 4 notas de 1 aluno!");

        for (int i = 0; i < 4; i++) {
            nota[i] = leia.nextInt();
            media = media + nota[i];
        }

        media = media / 4;

        if (media >= 5) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }

    public static void exercicio1_2_3(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome de Filomena ou Joselito para exibir sua rotina!");
        String nome = leia.nextLine();

        if (nome.equals("Filomena")) {
            System.out.println("1. Escola das 07h às 12h");
            System.out.println("2. Almoço das 12h as 13");
            System.out.println("3. Futebol das 14h as 16h");
            System.out.println("4. Dever de casa das 16h as 18h");
        } else if (nome.equals("Joselito")) {
            System.out.println("1. Escola das 07h às 12:30");
            System.out.println("2. Almoço das 13h as 14h");
            System.out.println("3. Natação das 14h as 16h");
            System.out.println("4. Reforço escolar das 16h as 19h");
        } else {
            System.out.println("Nome incorreto! Favor, digite um nome válido!");
        }
    }

    public static void exercicio1_3_1(){
        Scanner leia = new Scanner(System.in);

        int contador = 0;

        while (contador < 3) {
            System.out.println("jogador 1, digite a opcao \"pedra\", \"papel\" ou \"tesoura\".");
            String jogador1 = leia.nextLine();
            System.out.println("jogador 2, digite a opcao \"pedra\", \"papel\" ou \"tesoura\".");
            String jogador2 = leia.nextLine();

            if (jogador1.equals("papel")) {
                if (jogador2.equals("papel")) {
                    System.out.println("Empate! Jogue novamente.");
                }
                if (jogador2.equals("pedra")) {
                    System.out.println("Jogador 1 venceu a " + (contador + 1) + "º rodada.");
                    contador++;
                }
                if (jogador2.equals("'tesoura")) {
                    System.out.println("Jogador 2 venceu " + (contador + 1) + "º rodada.");
                    contador++;
                }
            }

            if (jogador1.equals("pedra")) {
                if (jogador2.equals("papel")) {
                    System.out.println("Jogador 2 venceu " + (contador + 1) + "º rodada.");
                    contador++;
                }
                if (jogador2.equals("pedra")) {
                    System.out.println("Empate! Jogue novamente.");
                }
                if (jogador2.equals("tesoura")) {
                    System.out.println("Jogador 1 venceu " + (contador + 1) + "º rodada.");
                    contador++;
                }
            }
            if (jogador1.equals("tesoura")) {
                if (jogador2.equals("papel")) {
                    System.out.println("Jogador 1 venceu " + (contador + 1) + "º rodada.");
                    contador++;
                }
                if (jogador2.equals("pedra")) {
                    System.out.println("Jogador 2 venceu " + (contador + 1) + "º rodada.");
                    contador++;
                }
                if (jogador2.equals("tesoura")) {
                    System.out.println("Empate! Jogue novamente.");
                }
            }
        }
    }

    public static void exercicio1_3_2(){
        Scanner leia = new Scanner(System.in);

        int maiorIdade = 0;
        int[] idade = new int[3];

        System.out.println("Digite a idade de 3 pessoas!");

        for (int i = 0; i < idade.length; i++) {
            idade[i] = leia.nextInt();
            if (maiorIdade < idade[i]) {
                maiorIdade = idade[i];
            }
        }

        System.out.println("Maior das tres idade é " + maiorIdade);
    }

    public static void exercicio1_3_3(){
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
        System.out.println("Percentual de pessoas com salario ate R$1000,00: " + percentualSalarial + "%");
    }

    public static void exercicio1_4_1(){
        Scanner leia = new Scanner(System.in);

        int contador = 0;

        while (contador < 3) {
            String nomeUsuario = leia.nextLine();
            String senha = leia.nextLine();

            if (nomeUsuario.equals("admin") && senha.equals("123")) {
                System.out.println("Login realizado com sucesso!");
                contador = 3;
            } else{
                System.out.println("Usúario ou senha incorreto. Favor, tente mais " + (2 - contador) + " vezes antes de bloquear!");
                contador++;
            }
        }

        if (contador == 3){
            System.out.println("Sua conta foi bloqueada!");
        }
    }

    public static void exercicio1_4_2(){
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void exercicio1_4_3(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void exercicio1_5_1_1(){

    }

    public static void exercicio1_5_1_2(){

    }

    public static void exercicio1_5_1(){

    }

    public static void exercicio1_5_2(){

    }

    public static void exercicio1_5_3(){

    }

    public static void exercicio1_6_1(){

    }

    public static void exercicio1_6_2(){

    }

    public static void exercicio1_6_3(){

    }

    public static void exercicio1_6_4(){

    }

    public static void exercicio1_6_5(){

    }

    public static void exercicio2_2_1(){

    }

    public static void exercicio2_2_2(){

    }

    public static void exercicio2_3_1(){

    }

    public static void exercicio2_3_2(){

    }

    public static void exercicio2_4_1(){

    }

    public static void prova1(){
        Scanner leia = new Scanner(System.in);

        double catetoAdjascente = leia.nextDouble();
        double catetoOposto = leia.nextDouble();

        double hipotenusa = Math.cbrt(Math.pow(catetoAdjascente, 2) + Math.pow(catetoOposto, 2));

        System.out.println("A hipotenusa do cateto adjascente e do cateto oposto atribuido é " + hipotenusa);

    }

    public static void prova2(){
        Scanner leia = new Scanner(System.in);

        double media = 0;
        int[] nota = new int[3];
        for (int i = 0; i < nota.length; i++) {
            nota[i] = leia.nextInt();
            media = media + nota[i];
        }
        media = media / 4;

        if (media >= 5) {
            System.out.println("Aluno aprovado! Nota: " + media);
        } else {
            System.out.println("Aluno reprovado! Nota: " + media);
        }
    }

    public static void prova3(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual o periodo do dia, manha tarde ou noite?");
        String periodoDoDia = leia.next();

        if (periodoDoDia.equals("manha")) {
            System.out.println("Dona Isaurinha, tome o Remedia A!");
        } else if (periodoDoDia.equals("tarde")) {
            System.out.println("Dona Isaurinha, tome o Remedia B!");
        } else if (periodoDoDia.equals("noite")) {
            System.out.println("Dona Isaurinha, tome o Remedia C!");
        } else {
            System.out.println("Opcao incorreta! Favor, digite manha, tarde ou noite!");
        }
    }

    public static void prova4(){
        Scanner leia = new Scanner(System.in);

        String nomeUsuario = leia.nextLine();
        int senha = leia.nextInt();

        if (nomeUsuario.equals("admin") && senha == 123) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Sua conta foi bloqueada!");
        }
    }

    public static void prova5(){
        Scanner leia = new Scanner(System.in);

        int[] idade = new int[3];
        int maiorIdade = 0;

        for (int i = 0; i < idade.length; i++) {
            idade[i] = leia.nextInt();
            if (maiorIdade < idade[i]) {
                maiorIdade = idade[i];
            }
        }

        System.out.println("A maior idade é " + maiorIdade);
    }

    public static void prova6(){
        Scanner leia = new Scanner(System.in);

        int quantidadeDeLeituras = leia.nextInt();
        int[] valor = new int[quantidadeDeLeituras];

        int somatorio = 0;
        double mediaDosValores = 0;

        for (int i = 0; i < valor.length; i++) {
            valor[i] = leia.nextInt();

            somatorio = somatorio + valor[i];
        }
        mediaDosValores = somatorio/quantidadeDeLeituras;

        System.out.println("O somatorio dos valores lidos sao: " + somatorio);
        System.out.println("A media dos valores lidos sao: " + mediaDosValores);
        System.out.println("O total de valores lidos sao: " + valor.length);
    }

    public static void prova7(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número para exibir todos os pares de 0 até o número!");
        int numero = leia.nextInt();

        for (int i = 0; i < (numero + 1); i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void prova8(){
        Scanner leia = new Scanner(System.in);

        int somatoria = 0;
        System.out.println("Digite um número para exibir todos os impares de 0 até o número!");
        int impar = leia.nextInt();

        for (int i = 0; i < (impar + 1); i++) {
            if (i % 2 == 1){
                somatoria = somatoria + i;
            }
        }
        System.out.println("O somatório de todos os número ímpares entre 0 e o número digitado é: " + somatoria);
    }
}
