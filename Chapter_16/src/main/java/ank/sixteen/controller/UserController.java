package ank.sixteen.controller;

import ank.sixteen.dto.User;
import ank.sixteen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public String list(ModelMap modelMap){
        modelMap.put("list",userService.queryList());
        return "home";
    }

    @RequestMapping(value = "/getUserById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable Integer id){
        User user = null;
        user = userService.getUserById(id);
        return user;
    }
}
