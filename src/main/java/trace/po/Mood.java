package trace.po;

/**
 * mood
 * 记录心情的功能，由用户选择的表情标签和输入的文本两部分组成
 * @author lixin
 * @date 2022/11/07
 */
public class Mood {

    private int moodId;
    private String creationDate;
    private int tagId;
    private String content;
    private int delTag;

    public int getMoodId() {
        return moodId;
    }

    public void setMoodId(int moodId) {
        this.moodId = moodId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDelTag() {
        return delTag;
    }

    public void setDelTag(int delTag) {
        this.delTag = delTag;
    }
}