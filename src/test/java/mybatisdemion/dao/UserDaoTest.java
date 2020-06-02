package mybatisdemion.dao;


import mybatisdemion.MybatisUtils;
import mybatisdemion.pojo.Users;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        logger.info("info:开始了");
        logger.debug("debug模式了");
//        List<Users> userList =userMapper.getUserList();
//
//        Users users1 = userMapper.getUserByid("鸽子");
//        System.out.println(users1);

//        Map<String ,Object> hashMap = new HashMap<>();
//        hashMap.put("hhh","崔型号");
//        hashMap.put("uzzzsersex","你是真的狗");
//        userMapper.InitioUser2(hashMap);

//        for (Users users: userList){
//            System.out.println(users);
//        }

//        userMapper.Updatauser(new Users(5,"崔","19"));
//        userMapper.DelentUser(1);

//        List<Users> usersList = userMapper.LinkSelect("崔");
        Users users=userMapper.SelectID(2);
//        for (Users users : usersList) {
            System.out.println(users);
            sqlSession.close();
        }



}