um progrma que recebe a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista. Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas ocorreram (mostrar o mês por extenso:1 -Janeiro, 2 - Fevereito e etc

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
