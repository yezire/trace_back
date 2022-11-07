package trace.service;

import trace.po.Mood;

public interface MoodService {

    public void newMood(Integer tagId, String content);
}