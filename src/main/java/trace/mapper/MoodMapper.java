package trace.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MoodMapper {

    @Insert("insert into mood values(NULL,now(),#{tagId},#{content},1,1)")
    public void newMood(Integer tagId, String content);
}