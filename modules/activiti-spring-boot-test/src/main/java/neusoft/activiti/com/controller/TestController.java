package neusoft.activiti.com.controller;

import neusoft.activiti.com.entity.User;
import neusoft.activiti.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(){
        return "Spring boot test!!!";
    }

    @RequestMapping("/getUser")
    public User selectByPrimaryKey(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.selectByPrimaryKey(id);
        return user;
    }
}
