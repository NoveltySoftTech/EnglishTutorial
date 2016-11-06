docker run --name nst-mysql -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=rootpwd -e MYSQL_DATABASE=tutorial_test -e MYSQL_USER=tutorial -e MYSQL_PASSWORD=password -d mysql:latest
