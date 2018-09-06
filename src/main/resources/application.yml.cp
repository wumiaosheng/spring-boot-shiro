spring:
  application:
    name: spring-boot-shiro    
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    url: jdbc:mysql://127.0.0.1:3306/labour?characterEncoding=UTF-8&zeroDateTimeBehavior\=convertToNull
    username: root
    password: root
    driver-class-name: com.mysql.jdbc.Driver
    initialSize: 1
    minIdle: 3
    maxActive: 20
    maxWait: 60000
    timeBetweenEvictionRunsMillis: 60000
    minEvictableIdleTimeMillis: 30000
    testWhileIdle: false
    testOnBorrow: false
    testOnReturn: false
    poolPreparedStatements: true
    maxPoolPreparedStatementPerConnectionSize: 20
    filters: stat,wall,slf4j
    connectionProperties: druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000
    useGlobalDataSourceStat: true
  redis:
    host: 10.100.0.143
    password: 
    port: 6379
    pool:
      max-idle: 100
      min-idle: 1
      max-active: 1000
      max-wait: -1
      
  thymeleaf:
       cache: false
       #mode: LEGACYHTML5
   

mybatis:
  #mapper-locations: classpath:mapping/*.xml  #注意：一定要对应mapper映射xml文件的所在路径
  type-aliases-package: com.neo.hapi.entity  # 注意：对应实体类的路径
  
  