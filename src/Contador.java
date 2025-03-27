import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
        //chamando o método contendo a lógica de contagem.......
            contar(parametroUm, parametroDois );
        }catch(ParametrosInvalidosException e){
        //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scanner.close();
    }    

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois ){
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contador = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
            for(int i = 1; i <= contador; i++){
            System.out.println("Imprimindo o parâmetro " + i);
            }
    }
}
