docker run -d -p 1522:1521 -e ORACLE_PASSWORD=admin gvenzl/oracle-xe

docker volume create oracle-volume
docker run -d -p 1522:1521 -v oracle-volume -e  ORACLE_PASSWORD=admin gvenzl/oracle-xe
docker container logs -f festive_williamson