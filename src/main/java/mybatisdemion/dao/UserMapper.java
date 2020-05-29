package mybatisdemion.dao;

import mybatisdemion.pojo.Users;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 查询所有人
     * @return
     */
    public List<Users> getUserList();

    /**
     * 根据id进行查询
     * @param username  传进来的名字
     * @return
     */
    public Users getUserByid(String  username);

    /**
     * 增加用户,传入一个对象
     */

    public int InitioUser(Users users);

    /**
     * 修改用户
     */

    public int Updatauser(Users users);

    /**
     * 删除
     */

    public int DelentUser(int id);

    /**
     * 万能Map
     */
    public int InitioUser2(Map<String ,Object> map);

    /**
     * 模糊查询
     * @param
     */
    public  List<Users> LinkSelect(String value);

}
