package club.codeqi.Controller;

import club.codeqi.Entity.User;
import club.codeqi.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:41
 */
@RestController
@Api(tags = "用户接口")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", dataType = "int", paramType = "PathVariable", required = true)
    })
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        User user = userService.selectUserByid(id);
        return user;
    }

    @ApiOperation(value = "添加用户")
    @PostMapping("/user")
    public int addUser(@RequestBody User user){
        int i = userService.insertUser(user);
        return i;
    }

    @ApiOperation(value = "修改用户")
    @PutMapping("/user")
    public int updateUser(@RequestBody User user){
        int i = userService.updateUser(user);
        return i;
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("/user")
    public int deleteUser(@RequestBody Map map){
        Integer id = (Integer) map.get("id");
        int i = userService.deleteUser(id);
        return i;
    }

    @ApiOperation(value = "查询用户列表")
    @GetMapping("/users")
    public Collection<User> getUsers(){
        Collection<User> users = userService.selectUsers();
        return users;
    }
}
