# Desafio técnico - Framework

## Iniciando o projeto - 28/03/2021
#### Por Paulo Eduardo Caram Guedes


De acordo com as premissas dadas. Inicie o proejto gerando  um pacote utilizando o framework **Spring boot**. No início utilizei o site [Spring](https://start.spring.io) e depois fiz o mesmo procedimento utilizando a IDE STS [SpringTools](https://spring.io/tools).


1 - Criei um folder de dentro da estrutura src/main/java, chamado **controllers**. Onde ficará os arquivos de recursos referente ao REST. Será criado uma classe para cada serviços que o recurso irá atuar.

2 - Após ter feito os primeiros testes. Criado o projeto de nome "framewrok" no github [Github](https://github.com/pcaramguedes/framework) e feito o primeiro commit.

3 - Para criar as classes de dominio, foi feito uma modelagem do sistema básica com intuito de diminuir erros na execução do mesmo. Também criado um folder com o nome **dominios** para armazenar os arquivos referente ao dominio.

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

5 - Criado o folder **services** onde ficarão armazenados os arquivos referente aos serviços. Estes arquivos tem a função de comunicar os arquivos que estão nos repositories. Abaixo segue a listagem dos mesmos.

| Classes - Services      |
|-------------------------|
|UsuarioService.class     |
|PostagemService.class    |
|ComentariosService.class |

6 - Criado o folder **repositories** onde ficarão armazenados os arquivos referente aos Repositórios. Estes arquivos tem a finalidade de acessar o banco de dados e fazer o controle **(CRUD)**.Abaixo segue a listagem dos mesmos.

| Classes - Repository       |
|----------------------------|
|UsuarioRepository.class     |
|PostagemRepository.class    |
|ComentariosRepository.class |


### Diagrama Ecosistema - Nível da aplicação


![ecosistema](https://user-images.githubusercontent.com/72876705/112988879-ba9e4f80-913a-11eb-889f-f59618127abf.png)


### Modelagem conceitual do Banco de dados

![modelo_conceitual](https://user-images.githubusercontent.com/72876705/112992057-351c9e80-913e-11eb-8bf5-ef40e2de246c.jpg)


