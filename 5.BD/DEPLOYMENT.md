# Deploy


$ docker-machine create --driver openstack --openstack-flavor-name m1.small --openstack-image-name "Ubuntu 14.04" --openstack-ssh-user ubuntu --openstack-floatingip-pool nova --openstack-sec-groups default  --openstack-nova-network --openstack-net-name nova INF1042

$ eval $(docker-machine env INF1042)

$ docker run --name INF1042-mysql -e MYSQL_ROOT_PASSWORD=<Password> -p 3306:3306 -d mysql:latest 


