package club.codeqi.Service.Impl;

import club.codeqi.Entity.Role;
import club.codeqi.Entity.User;
import club.codeqi.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:36
 */
@Service
public class UserServiceImpl implements UserService {
    public static CopyOnWriteArrayList<User> arrayList = new CopyOnWriteArrayList(
            Arrays.asList(new User(1,"username1","password1",new Role(1,"RoleName1","RoleInfo1",true,null),
                            "Address1","17721330301","username1@qq.com",null),
                    new User(2,"username2","password2",new Role(1,"RoleName1","RoleInfo1",true,null),
                            "Address1","17721330302","username2@qq.com",null),
                    new User(3,"username3","password3",new Role(2,"RoleName2","RoleInfo2",false,null),
                            "Address1","17721330303","username3@qq.com",null),
                    new User(4,"username4","password4",new Role(3,"RoleName3","RoleInfo3",true,null),
                            "Address1","17721330304","username4@qq.com",null)
                    )
    );
    @Override
    public int insertUser(User user) {
        boolean add = arrayList.add(user);
        if(add){ return 1; }
        else{ return 0; }
    }

    @Override
    public int updateUser(User user) {
        Iterator<User> iterator = arrayList.iterator();
        boolean result = false;
        while(iterator.hasNext()){
            User auser = iterator.next();
            if(auser.getuId().equals(user.getuId())){
                //iterator.remove();
                arrayList.remove(auser);
                result = arrayList.add(user);
            }
        }
        if(result){ return 1; }
        else{ return 0; }
    }

    @Override
    public int deleteUser(Integer uId) {
        Iterator<User> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getuId().equals(uId)){
                arrayList.remove(user);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public User selectUserByid(Integer uId) {
        Iterator<User> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if(user.getuId().equals(uId)){
                return user;
            }
        }
        return null;
    }

    @Override
    public Collection<User> selectUsers() {
        return arrayList;
    }
}
