package www.project.dutchpay.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import www.project.dutchpay.dto.MemberDTO;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {

    List<MemberDTO> GroupMember(int group_id);
    List<MemberDTO> ListMember(int list_id);

    void InsertMember(MemberDTO memberDTO);

    void DeleteMember(int member_id);

    List<MemberDTO> allgroup();
}
