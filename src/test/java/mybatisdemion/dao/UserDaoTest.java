package mybatisdemion.dao;


import mybatisdemion.MybatisUtils;
import mybatisdemion.pojo.Users;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class UserDaoTest {

    public static void main(String[] args) {
        SqlSession sqlSession =MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<Users> userList =userMapper.getUserList();
//
//        Users users1 = userMapper.getUserByid("鸽子");
//        System.out.println(users1);

//        userMapper.InitioUser(new Users("哈哈哈","usersex"));
//        for (Users users: userList){
//            System.out.println(users);
//        }
//        userMapper.Updatauser(new Users(5,"崔","19"));
        userMapper.DelentUser(1);
        sqlSession.close();
    }





}
