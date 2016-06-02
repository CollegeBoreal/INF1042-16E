# Deploy


## Open Stack

```
$ docker-machine create --driver openstack --openstack-flavor-name m1.small --openstack-image-name "Ubuntu 14.04" --openstack-ssh-user ubuntu --openstack-floatingip-pool nova --openstack-sec-groups default  --openstack-nova-network --openstack-net-name nova INF1042
```

```
$ eval $(docker-machine env INF1042)
```

```
$ docker run --name INF1042-mysql -e MYSQL_ROOT_PASSWORD=<Password> -p 3306:3306 -d mysql:latest 
```

### Fichier World.sql
Télécharger le fichier world.sql dans le répertoire racine du projet.

```
$ docker exec -it INF1042-mysql mysql -u root -p -e "create database world;"
```

```
$ docker exec -it INF1042-mysql \
 mysql -u root -p -e "GRANT ALL PRIVILEGES on *.* TO 'etudiants'@'localhost' IDENTIFIED BY 'etudiants_1' WITH GRANT OPTION;"
```

### Charger les données dans Docker 

- remplacer le ```<PWD>``` par le mot de passe 
```
$ docker exec  -i INF1042-mysql  mysql -u etudiants -p<MDP> world < ~/world.sql
```



