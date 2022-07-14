Padrões de Codificação, Reflexão e Programação Defensiva

Um padrão de codificação é um conjunto de regras de escrita de código composto por padrões
de espaçamento, nomenclatura, pontuação, procedimento, versionamento, comentários, arqui-
vos, e de identação em geral. Este conjunto é seguido por um grupo ou organização de desen-
volvedores que deverão obedecer tais convenções para que todos da equipe consigam ter o
mínimo de entendimento do código que está sendo escrito. É importante que os integrantes 
da equipe sejam sempre fiéis aos acordos firmados no momento em que combinam estes padrões,
para que sejam evitados transtornos e retrabalho. 

Reflexão é um mecanismo - uma API - construído dentro de linguagens de programação que 
permitem a inspeção de código em tempo de execução. A API de reflexão da linguagem permite
inspecionar classes, métodos, propriedades e tipos de dentro do sistema. Sistemas que utili-
zam a reflexão são capazes de inspecionar e modificar seus próprios ambientes. Uma linguagem
com suporte total à reflexão permite modificação do código em tempo de execução, efetivamente
permitindo que a fonte reescreva aspectos de si mesma. Um exemplo de utilização de reflexão é durante a testagem de um código. A reflexão pode ajudar a inspecionar classes expeondo seus comportamentos internos. Ao se usar a reflexão, um método protegido de uma classe por exemplo pode ter sua visibilidade sobrescrita, de modo que ela se torne pública na testagem.

A programação defensiva é um conjunto de práticas visadas à antecipação de problemas relacionados ao mau uso do código por usuários, de forma a tornar o produto final mais estável. A ideia básica é criar um programa que seja capaz de funcionar adequadamente mesmo em processos imprevistos ou quando entradas inesperadas são feitas por usuários. Um dos aspectos mais importantes da programação defensiva é o teste de software. A eliminação de linhas de código desnecessárias e o tratamento de entradas estranhas é pivotal na programação defensiva sob os auspícios dos testadores. Existem algumas práticas que compõem a ideia da programação defensiva, são elas: nunca confiar nos dados fornecidos pelo usuário - validando quaisquer dados provenientes de fontes externas através dos métodos e classes públicos do código, corrigir bugs encontrados durante a fase de testagem, através da programação ofensiva, e enxugar o máximo possível de código, que de outra forma daria margem ao uso incorreto pelo usuário. Um bom exemplo de uso da programação defensiva são as validações incluídas nos métodos e classes públicos de APIs que fazem comunicação com códigos externos.