﻿### Tarefa 003: Git Exercícios - 03/06/2021﻿
 
 1. Qual o comando para obter a versão instalada do Git?
git --version.

2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help
	Lista todos os comandos do git.
  b. git help checkout
	Abre uma página do manual sobre o procedimento de checkout.
  c. git help merge
	Abre uma página do manual do git sobre o procedimento merge.
  d. git init
	Inicializa um repositório Git vazio.
  e. git add --all
	O Git tenta adicionar meu computador ao repositório, sem sucesso pois não está no usuário principal.
  f. git add -u
	Sem efeito.
  g. git config -l
	Lista as configurações do Git.
  h. git mv a.txt b.txt
	"fatal: bad source, source=a.txt, destination=b.txt".
  i. git reset --hard
	Sem efeito.
  j. git log -27
	"fatal: your current branch 'master' does not have any commits yet".

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas 
mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos 
necessários para realizar os dois últimos “passos” desse fluxo?
git add, e git commit.

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
git fetch.

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser 
exibidos/identificados com que comando?
git status.

6. Qual o comando para efetuar um _commit_?
git commit.

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
git revert.

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça 
uma busca por **.gitignore**.
Basta incluir um arquivo .gitignore dentro do diretório do projeto, e incluir o caminho da pasta seguido de uma
/ no final. Exemplo: pasta_ignorada/

9. O que acontece se o seu repositório local for acidentalmente removido?
Se ele for permanentemente removido, a mensagem "couldn't open ".git/HEAD": no such file or directory"
é mostrada.

10. Como clonar um repositório remoto?
Basta usar $ git clone seguido pela URL do repositório a ser clonado.

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
Usar $ git log, e em seguida --pretty=oneliner.

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
No arquivo .git/config.

13. Qual o comando para criar um repositório local?
$ git init.

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
/.git/

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
git add -u.

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
SHA significa secure hash algorithm (algoritmo de hash seguro). É 
um algoritmo de criptografia usado pelo Git. Identificador de cada 
commit.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
HEAD.

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
Sim.

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
O último commit é removido, mas as mudanças continuam na árvore;
O último commit é removido, todas as mudanças não commitadas e todos
os arquivos "untracked" são perdidos, incluindo as mudanças feitas
no último commit.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
$ git clean -fd e também $ git clean -fx.

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
.gitignore.

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
Se quiséssemos ignorar todos os arquivos com a extensão .class, 
colocaríamos *.class no .gitignore.

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.
Ok.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
Exibe uma lista de nomes de pessoas, seus respectivos e-mail, e quantos
commits fizeram.

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
Mostra a origem do repositório, tanto fetch quando push.

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
$ git tag.

27. Caso um dado repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
$ git tag -1 --contains <2.0>

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
Nenhum efeito percebido.

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
Mostra-se o tagger e a data, seguido da frase "minha versão ouro". Em baixo,
um commit e seu hash, o autor dele, a data, metadados e descrições.

30. O que o comando **git push origin 3.4-gold** teria como efeito?
Ele abre uma caixa para obter credenciais do GitHub, para fazer o
push.

31. Após executar um commit, qual o efeito de **git commit --amend**?
Ele reescreve o histórico.

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
Altera o último commit.

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?


34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
