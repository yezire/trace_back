package trace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import trace.service.MoodService;

@RestController
@RequestMapping("/mood")
public class MoodController {

    @Autowired
    private MoodService moodService;

//    @ResponseBody
//    public Object mood(){
//        return "create a mood by now!";
//    }

    @RequestMapping("/new")
    public void newMood(Integer tagId, String content) throws Exception {
        moodService.newMood(tagId, content);
    }
}
