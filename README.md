# darm-ifce-api
Uma API REST com um CRUD simples para avaliação de uma vaga de emprego.

Para testar, faça um clone e execute na ide Spring Tool Suite.
Após levantar o serviço, acesse os endpoints via postman/curl.
Endpoints:
GET localhost:8080/aluno/listar para listar a relação de alunos.
GET localhost:8080/aluno/id para buscar um aluno cujo id foi passado na url.
POST localhost:8080/aluno/ para cadastrar um novo aluno. Envie no corpo da requisição(body) um json contendo os atributos "matricula" e "nome".
PUT localhost:8080/aluno/ para alterar dados de um aluno. Envie no corpo da requisição(body) um json contendo os atributos "matricula", "nome" e "id" do aluno que deseja editar.
DELETE localhost:8080/aluno/ para excluir um aluno. Envie no corpo da requisição(body) um json contendo o atributo "id" do aluno que deseja excluir.

Poderá, também, executar o arquivo fat jar contido na pasta target no terminal, com o camando java -jar darm-ifce-api-0.0.1-SNAPSHOT.



