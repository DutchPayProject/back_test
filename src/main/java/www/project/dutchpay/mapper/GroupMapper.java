package www.project.dutchpay.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import www.project.dutchpay.dto.GroupDTO;


import java.util.List;

@Mapper
@Repository
public interface GroupMapper {

    List<GroupDTO> getGroups();
    void insertGroup(GroupDTO group);
    void updateGroup(GroupDTO group);
    void deleteGroup(GroupDTO group);
}
