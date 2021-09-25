import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("digite a quantidade de alunos: ");
        int quantidade = ler.nextInt();
        
        String nome[] = new String[quantidade];
        double notaFinal[] = new double[quantidade];
        String situacao[] = new String[quantidade];

        for (int index = 0; index < quantidade; index ++) {
            System.out.println("Digite o nome do aluno: ");
            nome[index] = ler.next();
        }

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        
        for (int index = 0; index < quantidade; index ++) {
            System.out.println("Digite a nota do 1 trimestre " + nome[index]);
            nota1 = ler.nextDouble();
            if(nota1 <= 30) {
                System.out.println("Digite a nota do 2 trimestre " + nome[index]);
                nota2 = ler.nextDouble();
            } else {
                nota1 = 0;
                System.out.println("Valor Invalido! :(");
                System.out.println("Digite a nota do 1 trimestre " + nome[index]);
                nota1 = ler.nextDouble();
                System.out.println("Digite a nota do 2 trimestre " + nome[index]);
                nota2 = ler.nextDouble();
            } 
            if(nota2 <= 30) {
                System.out.println("Digite a nota do 3 trimestre " + nome[index]);
                nota3= ler.nextDouble();
            } else {
                nota2 = 0;
                System.out.println("Valor Invalido! :(");
                System.out.println("Digite a nota do 2 trimestre " + nome[index]);
                nota2 = ler.nextDouble();
                System.out.println("Digite a nota do 3 trimestre " + nome[index]);
                nota3 = ler.nextDouble();
            } 
            if(nota3 <= 40) {
                notaFinal[index] = nota1 + nota2 + nota3;
            } else {
                nota3 = 0;
                System.out.println("Valor Invalido! :(");
                System.out.println("Digite a nota do 3 trimestre " + nome[index]);
                nota3 = ler.nextDouble();
                notaFinal[index] = nota1 + nota2 + nota3;
            }
        }

        for (int index = 0; index < quantidade; index ++) {
            if (notaFinal[index] >= 60) {
                situacao[index] = ("Aprovado! :)");
            } else if (notaFinal[index] >= 50 && notaFinal[index] <= 60) {
                situacao[index]=("Prova final! :/");
            } else {
                situacao[index]=("Reprovado! :(");
            }
        }

        for (int index = 0; index < quantidade; index ++) {
            System.out.println("aluno: " + nome[index]+" sua nota final é: " + notaFinal[index]+" sua situação é: " + situacao[index]);
        }

        ler.close();
    }
}
