package trace.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trace.mapper.MoodMapper;
import trace.po.Mood;
import trace.service.MoodService;

@Service
public class MoodServiceImpl implements MoodService {

    @Autowired
    private MoodMapper moodMapper;

    @Override
    public void newMood(Integer tagId, String content) {
        moodMapper.newMood(tagId, content);
    }
}