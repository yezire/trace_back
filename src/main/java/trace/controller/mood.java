package trace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class mood {
    @RequestMapping("/mood")
    @ResponseBody
    public Object mood(){
        return "create a mood by now!";
    }
}
