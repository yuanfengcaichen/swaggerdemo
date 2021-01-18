package club.codeqi.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
@Api(tags = "测试控制器")
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "hello world";
    }

    /**
     *@param
     *@return
     */
    @ApiOperation(value = "测试接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "Id", dataType = "int", paramType = "query", required = false),
            @ApiImplicitParam(name = "name", value = "名字", dataType = "String", paramType = "query", required = false)
    })
    @GetMapping("/hello")
    public Map gethello(@RequestParam(required = false) int id,@RequestParam(required = false) String name){
        Map map = new HashMap();
        map.put("id",id);
        map.put("name",name);
       return map;
    }
}
