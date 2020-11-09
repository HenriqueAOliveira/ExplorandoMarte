# ExplorandoMarte

Um conjunto de sondas foi enviado pela NASA à Marte e irá pousar num planalto. Esse planalto, que curiosamente é retangular, deve ser explorado pelas sondas para que suas câmera embutidas consigam ter uma visão completa da área e enviar as imagens de volta para a Terra.

A posição e direção de uma sonda são representadas por uma combinação de coordenadas x-y e uma letra representando a direção cardinal para qual a sonda aponta, seguindo a rosa dos ventos em inglês.

O planalto é divido numa malha para simplificar a navegação. Um exemplo de posição seria (0, 0, N), que indica que a sonda está no canto inferior esquerdo e apontando para o Norte.

Para controlar as sondas, a NASA envia uma simples sequência de letras. As letras possíveis são "L", "R" e "M". Destas, "L" e "R" fazem a sonda virar 90 graus para a esquerda ou direita, respectivamente, sem mover a sonda. "M" faz com que a sonda mova-se para a frente um ponto da malha, mantendo a mesma direção.

## Entrada
A primeira linha da entrada de dados é a coordenada do ponto superior-direito da malha do planalto. Lembrando que a inferior esquerda sempre será (0,0) e a superior direita foi limitada a (5,5).

O resto da entrada será informação das sondas que foram implantadas. Cada sonda é representada por duas linhas. A primeira indica sua posição inicial e a segunda uma série de instruções indicando para a sonda como ela deverá explorar o planalto.

A posição é representada por dois inteiros e uma letra separados por espaços, correpondendo à coordenada X-Y e à direção da sonda. Cada sonda será controlada sequencialmente, o que quer dizer que a segunda sonda só irá se movimentar após que a primeira tenha terminado suas instruções.

## Saída
A saída deverá contar uma linha para cada sonda, na mesma ordem de entrada, indicando sua coordenada final e direção.

## Iniciação do Projeto

Para iniciar o projeto do Controlador de Sondas, abra um terminal e execute os seguintes comandos:

```
git clone git@github.com:HenriqueAOliveira/ExplorandoMarte.git
cd ExplorandoMarte/
java -jar ExplorandoMarte.jar
```

### Observações
* O par ordenado (x,y) tem como limite de 0 à 5
* Ao alcançar uma borda, seja em x ou y, a sonda não se moverá caso o comando seja para fora das extremidades

### Exemplo de Entrada
```
55
12N
LMLMLMLMM
13N
MRR
```

### Saída
```
1 3 N
1 4 S
```
