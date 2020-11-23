# Implementacao-em-Java-DFA-NFA-e-E-NFA
## Implementação em Java dos Automatos Finitos - DFA, NFA e E-NFA.

## Questões Obrigatórias:

1. Seja ∑ = {0,1}, proponha um NFA (Autômato Finito não determinístico) para reconhecer
cadeias que:

a. Comecem com 100.

Cadeias Aceitas:
{100, 1000, 1001, 10010, 100100, 10011100, 1001010 ...}

Cadeias Não Aceitas:
{’ ’, 0, 01000, 01, 01010 ...}

### Diagrama de transição

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG014.png)

b. Terminem com 100.

Cadeias Aceitas:
{0100, 10100, 100100,1100, 1010100 ...}

Cadeias Não Aceitas:
{’ ’, 01001,10010, 101010 ...}

### Diagrama de transição

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG016.png)

c. Comecem ou terminem com 100.

Cadeias Aceitas:
{100, 1000, 10011100, 10010, 1000100100 ...}

Cadeias Não Aceitas:
{’ ’, 01001000,10000,101010001 ...}

### Diagrama de transição

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG017.png)

2. James Bond, também conhecido por agente 007, é um agente secreto fictício do serviço
de espionagem britânico MI-6. Seus filmes são famosos e sua franquia de filmes é uma
das mais antigas do cinema. Suponha que para identificar um agente James Bond em um
interrogatório basta que ele fale, dentre quaisquer código, à subcadeia igual ao seu
código, (007). Construa um autômato (DFA ou NFA) para reconhecer um agente 007,
cujo alfabeto é composto apenas de números inteiros [0-9].

Cadeias Aceitas:
{007, 70007, 0007, 10007, 007007, 123007, 007123007 ...}

Cadeias Não Aceitas:
{’ ’, 7, 07, 070, 707070, 12307, 907 ...}

### Diagrama de transição

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG015.png)

3. Implemente, em sua linguagem de preferência, um algoritmo que converte um NFA
para um DFA utilizando o procedimento denominado construção de subconjuntos para
encontrar o DFA que reconhece a mesma linguagem do NFA.
Dica: Você pode validar sua implementação considerando as questões 1 e 2.

### Validando a questão 1 atraves da implementação

a. Comecem com 100.

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG008.png)

b. Terminem com 100.

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG009.png)

c. Comecem ou terminem com 100.

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG010.png)


4. Para que uma cadeia seja reconhecida em um NFA basta que todos os símbolos tenham
sido processados, ou seja, não há mais símbolos para serem lidos e que em um dos
sub-caminhos possíveis para processar a cadeia o último estado seja um estado final.
Implemente, em sua linguagem de preferência, um algoritmo que:
a. Mostra todos os caminhos possíveis de um NFA
b. Verifica se a cadeia é válida.

Dica.: O seu algoritmo pode ser recursivo e receber como entrada o NFA e a cadeia a
ser processada.
Dica.: Você pode utilizar o NFA que reconhece números decimais resolvido em sala de
aula para testar a aplicação ou o exemplo abaixo onde é possível visualizar o NFA(Figura 1) e os possíveis caminhos para processar a cadeia 00101 até entrar no estado de
aceitação, visto na Figura 2.

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG011.png)


## Testes realizados com as cadeias aceitas e não aceitas

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG0003.png)
![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG006.png)
![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG007.png)


5. Para o ε-NFA abaixo faça:

a. Calcule o ε-fechamento (função ECLOSE) de cada estado

ECLOSE(q1) = {q1,q2,q6}

ECLOSE(q2) = {q2}

ECLOSE(q3) = {q3,q4}

ECLOSE(q4) = {q4}

ECLOSE(q5) = {q5,q2,q6}

ECLOSE(q6) = {q6}


b. Converta o autômato em um DFA

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG012.png)

### Diagrama de transição E-NFA

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG018.png)

### Tabela

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG019.png)

### Diagrama de transição DFA

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG020.png)

6. Para o ε-NFA abaixo faça:

a. Calcule o ε-fechamento (função ECLOSE) de cada estado

ECLOSE(p) = {p,q,r}

ECLOSE(q) = {q}

ECLOSE(r) =  {r}


b. Converta o autômato em um DFA

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG013.png)

7. Implemente um algoritmo, em sua linguagem de preferência, que converte um ε-NFA
para um DFA utilizando a função ε-fechamento (ECLOSE) e o procedimento da
construção de subconjuntos dos estados alcançados pela função ECLOSE. Este DFA deve
reconhecer a mesma linguagem do ε-NFA.
Dica: Você pode validar sua implementação considerando as questões 5 e 6 acima.
Dica: Não esqueça de substituir no início do processo o estado inicial, pelo conjunto de
todos os estados alcançados função ε-fechamento do estado inicial.

8. O algoritmo de Thompson é utilizado para criar autômatos finitos não determinísticos
com movimentos vazios (ε-NFA) e permite criar a equivalência entre Expressão Regular
e um autômato finito. Considere as expressões regulares abaixo e construa um ε-NFA
para reconhecer strings aceitas por esta linguagem.

a. c(a|b)*(bb|c+)

b. 0?(007|70)*

## Questão extra:

9. Construa uma expressão regular (ER) que reconheça uma linguagem L = {w | w tem ao
mesmo tempo um número par de 0’s e 1’s}. Exemplos de cadeias aceitas pela ER são:
{1001, 000011, 11101000, 01010101, ...}, Exemplos de cadeias que não são aceitas {001,
110, 01011, ...}

## Entregável

. Realizar o trabalho individualmente

. Ler a especificação do trabalho e tirar quaisquer dúvidas

. Entregar o trabalho pelo portal com os links de documento, apresentação do
power point (se necessário), código fonte disponível no git e vídeo explicando
como os algoritmos devem ser utilizados.

. Realizar um vídeo com apresentação das questões práticas, mostrando exemplos
de processamentos bem sucedidos e explicando a solução.

. Adicione um readme no projeto informando como as simulações devem ser
realizadas

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG00001.png)

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG00002.png)

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG00004.png)

![](https://github.com/enivaldoqueiroz/Implementacao-em-Java-DFA-NFA-e-E-NFA/blob/main/Imagens/IMG00005.png)



