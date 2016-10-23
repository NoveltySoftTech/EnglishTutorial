# EnglishTutorial

Clone project into your local system
`git clone git@github.com:NoveltySoftTech/EnglishTutorial.git`

### IntelliJ Download
 `https://www.jetbrains.com/idea/download`
##My Sql Setup
Download docker
 - Spinning up mysql on docker
Mac - `https://docs.docker.com/docker-for-mac`
Windows - `https://docs.docker.com/docker-for-windows`

Download from `Stable channel` section
create database `./docker/mysqlsetup.sh` 
  convert into batch file, if required
  
### MySql Workbench
 `https://dev.mysql.com/downloads/workbench`
 
## Java 8 
`http://www.oracle.com/technetwork/java/javase/downloads/index.html`


#### Clean Database
`./gradlew clean classes flywayLocalTestMySqlConfig flywayClean`