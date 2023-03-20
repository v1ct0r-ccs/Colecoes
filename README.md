# Coleções - Collections

É um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados com uma única unidade, que pode ser chamada *coleção*, ou *collection*. As Collections contém os seguintes elementos:

- **Interfaces**: tipos abstratos que representam as coleções. permitem que coleções sejam manipuladas tendo como base o conceito "Programar para interfaces e não para implementações", desde que o acesso aos objetos se restrinja apenas ao uso de métodos definidos nas interfaces.
- **Implementações**: são as implementações concretas das interfaces.
- **Algoritimos**: são os métodos que realizam as operações sobre os objetos das coleções, tais como busca e ordenação.

## Interfaces

- **Iterator**: está no topo da hierarquia e possibilita percorrer uma coleção e remover seus elementos;
- **Collection**: Não existe implementação direta dessa interface, mas ela define as operações básicas para as coleções, como adicionar, remover, esvaziar, etc.;
- **List**: define uma coleção ordenada, podendo conter elementos duplicados. em geral, o usuário tem controle total sobre a posição onde cada elemento é inserido e pode recuperá-los através de seus índices. prefira esta interface quando precisar de acesso aleatório, através do índice do elemento
- **Queue**: um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, determinda essa prioridade. Como a interface fila pode-se criar filas e piplhas;
- **Map**: mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados mas chaves não. `SortedMap` é uma inerface que estende `Map`, e permite classificação ascendente das chaves. Uma aplicação dessa interface é a classe `Properties`, que é usada para persistir propriedades/configurações de um sistema, por exemplo.
- **Set**: interface que define uma coleção que não permite elemntos duplicados. A interface `SortedSet`, que estende `Set`, possibilita a classificação natural dos elementos, tal como a ordem alfabética;

## List e Queue

### Implementações - List

- **ArayList**: É como uma *array* cujo o tamnho pode crescer. A busca de um elemneto é rápida, mas inserções e exclusões não são. Podemos afirmar que as inserções e exclusões são lineares, o tempo cresce com o aumento do tamnho estrutura. Esta implementação é preferivel quando se deseja acesso mais rápido aos elementos.

*Exemplo de aplicação*: Se você quiser criar um caatálogo com os livros de sua biblioteca pessoal e cada obra inserida receber um umero sequencial (que será usado para acesso) a partir de zero;

- **LinkedList**: Implementa uma lista ligada, ou seja, cada nó contem o dado e uma referência para o próximo nó. Ao contrário do ArrayList, a busca é linear e inserções e exclusões são rápidas. Portanto, prefira `LinkedList` quando a aplicação exigir grande quantidade de inserções e exclusões.

*Exemplo de aplicação*: um pequeno sistema para gerenciar suas compras mensais de supermercado pode ser uma boa aplicação, daa a necessidade de constantes inclusões e exclusões de produtos;

### Implementações - Deque/Queue

- **ArrayDeque**: Esta é uma classe especial que implementa uma estrutura de dados de fila de duas extremidades, onde pode inseririr e remover elementos de ambas as extremidades. Suporta a implementação de uma array redimensionável que cresce automaticamente.

- **DEQUE**
    - *delete* / front <---> | - | - | - | - | - |  <---> rear / *delete*
    - *insert* / front <----> | - | - | - | - | - |  <---> rear / *insert*     
 

### Implementações - Queue

- **PriorityQueue**: Nesta classe, o elemento é inserido na parte de trás da fila. Esta operação é chamada de enfileiramento. Este mesmo elemento sai a partir da frente da fila, operação chamada de desenfileiramento. Esse procedimento de entrada e saída recebe o nome de *fila*, ou *FIFO* (first-in first-out), ou seja, "primeiro a entrar, primeiro a sair". Seus métodos principais são:

- **Queue**
    - Take here / Head <-- |1|2|3|4|5| <-- Tail / Insert here

## Set

- **HashSet**: O acesso aos dados é mais rápido que em um `TreeSet`, mas nada garante que os dados estaram ordenados. Escolha este conjunto quando a solução exigir elementos únicos e a ordem não for importante.

*Exemplo de aplicação*: Poderíamos usar esta implementação para criar um catálogo pessoal das canções da nossa discografia;

- **TreeSet**: Os dados são classificados, mas o acesso é mais lento que um `HashSet`. Se a nececidade for um conjunto com elementos não duplicados e acesso em ordem natural, prefira o *TreeSet*. É recomendado utilizar esta coleção para as mesmas aplicações de *HashSet*, com a vantagem dos objetos estarem em ordem natural;

- **LinkedHashSet**: É derivada de `HashSet`, mas mantém uma lista duplamente ligada através de seus intens. Seus elementos são iterados na ordem em que foram inseridos. Opcionalmente é possivel crial um *LinkedHashSet que seja percorrido na ordem em que os elementos fora, acessados na última iteração.

*Exemplo de aplicação*: Poderíamos usar esta implementação para registrar a chegada dos corredores de uma maratona;

### Diferenças entre - Set

- **HashSet**: O *HashSet* é o mais rápido de todos e seus elementos não são ordenados e não importa o quanto você adicione, remova, retire, o tempo de execução sempre será o mesmo. Por outro lado, a garantia de continuidade na ordem dos elementos inseridos é zero, ou seja, esse tipo de estrutura é indicada se você precia apenas garantir a alta performance sem se importar com a ordem com que os elementos estão ordenados.

- **TreSet**: Sua principal característica é que ele é o único Set que implementa a interface `SortedSet` em vez de `Set` diretamente, mas de qualquer forma SortedSet implementa Set, assim continuamos tendo os mesmos métodos no *TreSet*. Pelo fato de ele implementar *SortedSet* ele possui elementos ordenados automaticamente, ou seja, independente da ordem que voc<è inserir os elementos, eles serão ordenados. Mas isso tem um custo, a complexidade para os métodos *add*, *remove* e *contains* são bem maiores que do *HashSet, são elas `O(log(n))`, não é bem uma complexidade exponencial mas é bem maior que `O(1)` que tem seu tempo inalterado.

- **LinkedHashSet**: É um meio termo entre *HashSet* e *TreeSet*, ou seja, ela nos proporciona um pouco da performance do *HashSet* e um pouco do poder de ordenação do *TreeSet*. O *LinkedHashet* faz uso também do `HashTable` com *linked list*, ou seja, temos aui a seguinte situação: Os elementos continuam na ordem que são inseridos, diferente do *HashSet que "embaralha" tudo.