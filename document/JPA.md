

# liquibase

通过liquibase工具生成changelog
```
liquibase --driver=oracle.jdbc.OracleDriver \
      --classpath=\path\to\classes:jdbcdriver.jar \
      --changeLogFile=com/example/db.changelog.xml \
      --url="jdbc:oracle:thin:@localhost:1521:XE" \
      --username=scott \
      --password=tiger \
      generateChangeLog
```

```
 D:\workspace\liquibase\liquibase --driver=oracle.jdbc.OracleDriver --classpath=..\..\lib\ojdbc6.jar
--changeLogFile=src/main/resources/db/changelog/db.changelog.yml --url="jdbc:oracle:thin:@//10.1.195.102:1521/AIDB" --username=aialm2 --password=aialm2 generateChangeLog
```