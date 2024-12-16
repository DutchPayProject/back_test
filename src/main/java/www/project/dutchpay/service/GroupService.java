package www.project.dutchpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.project.dutchpay.dto.GroupDTO;
import www.project.dutchpay.mapper.GroupMapper;


import java.util.List;

@Service
public class GroupService {

    @Autowired
    GroupMapper groupMapper;

    public List<GroupDTO> getGroup (){
        return groupMapper.getGroups();
    }

    public String insertGroup(GroupDTO groupDto){
        groupMapper.insertGroup(groupDto);
        return  "그룹이 등록되었습니다!";
    }

    public String updateGroup(GroupDTO groupDto){
        groupMapper.updateGroup(groupDto);
        return "그룹 정보가 수정되었습니다!";
    }

    public String deleteGroup(GroupDTO groupDto){
        groupMapper.deleteGroup(groupDto);
        return "그룹이 삭제 되었습니다.";
    }

}
