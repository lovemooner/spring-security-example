package love.moon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther lovemooner
 * @date 2019/12/20 16:09
 * @describe
 */
@Controller
@RequestMapping("/test")
public class WebController {

    @RequestMapping("/home")
    public String home() {
//        return "index";
        return "redirect:https://www.baidu.com" ;
    }
}
