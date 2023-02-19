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

