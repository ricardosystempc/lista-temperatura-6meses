import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    // 1️⃣ double soma = 0;
    //Criamos uma variável chamada soma do tipo double (números com casas decimais) e inicializamos com 0.
    //Ela vai servir para acumular todas as temperaturas da lista.

    //  2️⃣ i = 0;
    //Reiniciamos o índice i para 0, porque vamos usar ele no while para percorrer a lista.
    //i vai representar a posição do elemento na lista temperaturas.
    

    //3️⃣ while (i < temperaturas.size()) { ... }

    //temperaturas.size() retorna quantos elementos existem na lista.

    //O while vai repetir o bloco de código enquanto i for menor que o tamanho da lista.

    //Basicamente: percorre todos os elementos da lista.


    //4️⃣ soma += temperaturas.get(i);

    //temperaturas.get(i) pega o elemento da lista na posição i.

    //soma += ... é a mesma coisa que soma = soma + ....

    //Então a cada iteração, somamos a temperatura atual à variável soma.


    //5️⃣ i++;

    //Incrementa o índice i em 1, para passar para o próximo elemento na próxima iteração.

    //Sem isso, o while ficaria em loop infinito.


    //6️⃣ double media = soma / temperaturas.size();

    //Aqui calculamos a média das temperaturas.

    ////soma já contém a soma de todas as temperaturas.

    //Dividimos pelo número de elementos (temperaturas.size()) para obter a média.


    //7️⃣ System.out.println("\nMédia semestral: " + media);

    //Mostra o resultado na tela.

    //\n é um quebra de linha para deixar o texto mais bonito.

    //media contém a média calculada.

    //💡 Resumo do funcionamento:

    //Inicializa a soma com 0.

    //Percorre toda a lista de temperaturas, somando cada valor.

    //Divide a soma pelo total de elementos para obter a média.

    //Imprime a média na tela.
        

public class TemperaturaSemestralWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        // Recebendo as temperaturas dos 6 primeiros meses usando while
        int i = 0;
        while (i < 6) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
            i++;
        }
        
        // Calculando a média semestral
        double soma = 0;
        i = 0;
        while (i < temperaturas.size()) {
            soma += temperaturas.get(i);
            i++;
        }
        double media = soma / temperaturas.size();
        System.out.println("\nMédia semestral: " + media);

        // Mostrando as temperaturas acima da média e os meses correspondentes
        System.out.println("\nTemperaturas acima da média:");
        i = 0;
        while (i < temperaturas.size()) {
            if (temperaturas.get(i) > media) {
                System.out.println(meses[i] + ": " + temperaturas.get(i));
            }
            i++;
        }

        scanner.close();
    }
}
