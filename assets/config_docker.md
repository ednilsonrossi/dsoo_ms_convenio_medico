# CONFIGURAÇÕES DO DOCKER

## IMAGEM DOWNLOAD
sudo docker pull postgres:15-alpine

## LISTAR IMAGENS
docker images

## RODAR IMAGEM DO POSTGRES
sudo docker run -p 5432:5432 --name dsoo-msplanos --network dsoo-net -e POSTGRES_PASSWORD=1234567 -e POSTGRES_DB=db_dsoo_planos postgres:15-alpine

## VER CONTAINNERS 
sudo docker ps -a

## REMOVER CONTAINER
sudo docker -rm af097bfd8882

## INICIAR UM CONTAINER
sudo docker start dsoo-msplanos

## PARAR UM CONTAINER
sudo docker stop dsoo-msplanos

## ACESSAR O PSQL
sudo docker exec -it dsoo-msplanos psql -U postgres

## Exemplo 2
Aqui vamos baixar uma imagem do MySQL e exercutar o container.

### Baixar a imagem
sudo docker pull mysql/mysql-server:latest

### Exercutar o container
Aqui estamos executando o container, definindo a porta e a senha do usuário ROOT

sudo docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=senha -p 3306:3306 -d mysql/mysql-server

### Acessar o Cliente MySQL

sudo docker exec -it mysql-local mysql -u root -p

