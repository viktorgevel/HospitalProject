package hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Viktor on 03.07.2016.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(Model model){
        return "login";
    }
}
