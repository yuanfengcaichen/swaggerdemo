package club.codeqi.Controller;

import club.codeqi.Service.AuthorizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author codeqi
 * @version 1.0
 * @date 2021/1/18 0018 20:40
 */
@RestController
public class AuthorizeController {
    @Autowired
    AuthorizeService authorizeService;
}
