# mybatis-cache
mybatis的缓存有一级缓存（sqlsession级别）和二级缓存（mapper级别），demo主要对这两级缓存进行测试。
Created connection 768185844.
==>  Preparing: SELECT user_id AS id, user_name AS name, user_password AS password, create_time AS datetime FROM user WHERE user_id = ? 
==> Parameters: 2(Integer)
<==    Columns: id, name, password, datetime
<==        Row: 2, zhang san1, zhangsan1, 2018-03-22 04:03:11
<==      Total: 1
Closing JDBC Connection [com.mysql.cj.jdbc.ConnectionImpl@2dc995f4]
Returned connection 768185844 to pool.
User(id=2, name=zhang san1, password=zhangsan1, datetime=Thu Mar 22 17:03:11 CST 2018)
Disconnected from the target VM, address: '127.0.0.1:64552', transport: 'socket'
Cache Hit Ratio [com.zcb.mybatic.cache.mapperInter.UserMapping]: 0.5
User(id=2, name=zhang san1, password=zhangsan1, datetime=Thu Mar 22 17:03:11 CST 2018)
Cache Hit Ratio [com.zcb.mybatic.cache.mapperInter.UserMapping]: 0.6666666666666666
User(id=2, name=zhang san1, password=zhangsan1, datetime=Thu Mar 22 17:03:11 CST 2018)
Cache Hit Ratio [com.zcb.mybatic.cache.mapperInter.UserMapping]: 0.75
User(id=2, name=zhang san1, password=zhangsan1, datetime=Thu Mar 22 17:03:11 CST 2018)
