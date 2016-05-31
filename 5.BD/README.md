# Base De Données

## Design Patterns

- Singleton
- Façade
- Factory

- DI (Dependency Injection)
- DAO (Data Access Object)

## Manipulation de données

### Example de bases de données
http://dev.mysql.com/doc/index-other.html

### Fichier World.sql
Télécharger le fichier world.sql dans le répertoire racine du projet.

### Charger les données dans Docker 

- remplacer le <PWD>

$ docker exec  -i INF1042-mysql  mysql -u etudiants -p<MDP> world < ~/world.sql

### Éxécuter les commandes SQL de BlackBoard

![alt tag](https://github.com/CollegeBoreal/INF1069-16H/blob/master/6.SELECT/world.png)
