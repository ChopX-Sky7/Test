package TestProj.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/donat")
    public String donate(){
        return "donat";
    }



}
