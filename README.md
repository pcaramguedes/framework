# Desafio técnico - Framework

## Iniciando o projeto - 28/03/2021



De acordo com as premissas dadas. Inicie o proejto gerando  um pacote utilizando
o framework **Spring boot**. No início utilizei o site [Spring](https://start.spring.io) e 
depois fiz o mesmo procedimento utilizando a IDE STS [SpringTools](https://spring.io/tools).


1 - Criei um folder de dentro da estrutura src/main/java, chamado **controllers**. 
Onde ficará os arquivos de recursos referente ao REST. Será criado uma classe 
para cada serviços que o recurso irá atuar.

2 - Após ter feito os primeiros testes. Criado o projeto de nome "framewrok"
no github [Github](https://github.com/pcaramguedes/framework) e feito o primeiro commit.

3 - Para criar as classes de dominio, foi feito uma modelagem do sistema
básica com intuito de diminuir erros na execução do mesmo. Também criado um folder com o nome
**dominio** para armazenar os arquivos referente ao dominio.

Segue abaixo as classes de **domínio** que serão criadas:

|      Classes        |
|---------------------|
| Usuários.class      |
| Postagem.class      |
| Comentarios.class   |

4 - Criado os arquivos de Controllers com a função de comunicarem com a camada de aplicação e também 
chamar os arquivos **Services** e por sua vez fazerem chamada aos arquivos do **repository**.

Segue abaixo os arquivos

| Classes - Controllers    |
|--------------------------|
| IndexControllers.class   |
| DesafioControllers.class |




