package club.codeqi.Service;

import club.codeqi.Entity.User;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:34
 */
public interface UserService {
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(Integer uId);
    public User selectUserByid(Integer uId);
    public Collection<User> selectUsers();
}
