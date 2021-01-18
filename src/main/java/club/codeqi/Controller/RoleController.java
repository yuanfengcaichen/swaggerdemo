package club.codeqi.Controller;

import club.codeqi.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:41
 */
@RestController
public class RoleController {
    @Autowired
    RoleService roleService;
}
