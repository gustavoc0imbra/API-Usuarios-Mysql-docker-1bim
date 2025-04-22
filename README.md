# Sistema gerenciamento Usuários com Docker - MySQL 🐬🐳
Um repositório que faz parte do conjunto entre outros 2 repositórios, que são aplicações que salvam e exibem os dados de usuários. Uma é responsável por exibir os dados que salvos em coleções no MongoDB e a outra exibe ambos os dados das APIs.  
Neste projeto é disponibilizado uma API que persiste e retorna dados contidos na tabela MySQL.

## Projetos Relacionados:
- API que persiste o dado no MongoDB 🍃: [API MongoDB](https://github.com/gustavoc0imbra/API-Usuarios-Mongo-docker-1bim)
- Aplicação frontend: [App React](https://github.com/gustavoc0imbra/frontusuarios-proj1bim-docker)

## Como instalar e rodar o projeto:
- Clonar este repositório no diretório desejado `git clone https://github.com/gustavoc0imbra/API-Usuarios-Mysql-docker-1bim.git`
- Após clonar, acessar via terminal o diretório do projeto e digite o seguinte comando para realizar o build da imagem docker:
- `docker-compose up -d`
- Aguarde o término do build

## Instruções pós build:
- Esta API é necessário reiniciar a imagem dela, pois o banco de dados demora um pouco para iniciar.
- Pode reiniciar a imagem através do programa docker desktop que irá funcionar normalmente e nas próximas inicializações não será necessário repetir o processo.

> [!NOTE]
> - A API será disponibilizada no endereço `http://localhost:8081/api/v0`  
> - O endpoint para receber a lista e salvar as informações são `/users`  
> - A documentação da API pode ser acessada no endereço `http://localhost:8081/docs`
