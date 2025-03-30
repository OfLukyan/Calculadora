## Utils Java
--//---//--
(1) Calculadora IMC
(2) Calculadora de Circunferencia e volume
(3) Calculadora Matematica
(4) calculadora de média entre dois valores
(5) SAIR
---//---//----

A ideia é, fazer um programa que pergunta ao usuario qual operação ele precisa, dessas que estão em cima
vai começar um loop (while) que vai rodar sempre, até que retorne o valor (false), conforme oque ele escolher
por exemplo, usuario digitou (1), vamo desviar o programa para calculadora IMC, se (3) vamos desviar o programa
pra uma calculadora matematica onde recebe 2 numeros e retorna a soma e etc...
(ao escolher a opção (5), vamo retorna (false) ao while e encerrar o programa)

## começando
cria um segunda branch que você vai usar(eu vou usar a master), só caso for mudar algo muito grande no meio do projeto
crie com o comando **git checkout -b <nome-do-branch>** isso vai criar e automaticamente mudar pra branch criada.
## links uteis
- https://www.dio.me/articles/comandos-git-comandos-essenciais-do-git-para-gerenciamento-de-branches
- https://www.atlassian.com/br/git/glossary#commands
  
## comandos uteis
- git add . (adiciona os arquivos para poderem ser comitados)
- git status (exibe os arquivos adicionados ou não ao commit)
- git branch (lista as branchs disponiveis)
- git checkout <nome-da-branch> (muda de branch)
- git commit -m ""
- git push origin <branch-nome> (envia as alterações)
- git pull origin <branch-nome> (puxa as alterações, caso eu tenha mexido em algo e você queira puxar essa alteração)

###Dicas:
- variáveis em português
- código bem comentado
- organizado em classes e pastas, calculadora IMC no seu canto, e a média entre valores em outro canto
