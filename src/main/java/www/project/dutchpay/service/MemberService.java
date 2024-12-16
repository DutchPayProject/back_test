package www.project.dutchpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import www.project.dutchpay.dto.MemberDTO;
import www.project.dutchpay.mapper.MemberMapper;

import java.util.List;


@Service
public class MemberService {

    @Autowired
    MemberMapper memberMapper;
    /*Group에 관한 맴버를 가져옴 group_id 통해서 가져옴*/
    public List<MemberDTO> GroupMember (MemberDTO memberDTO) {

        return memberMapper.GroupMember(memberDTO.getGroup_id());
    }

    public List<MemberDTO> ListMember (MemberDTO memberDTO) {

        return memberMapper.ListMember(memberDTO.getList_id());
    }

    public String InsertMember(MemberDTO memberDTO){
       try{
           memberMapper.InsertMember(memberDTO);
           return "true";
       }catch (Exception e){
            return "에러 :" +e.getMessage();
       }
    }

    public String DeleteMember(int member_id){
        try{
                memberMapper.DeleteMember(member_id);
                return "삭제 성공";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public List<MemberDTO> allgroup (){
      return memberMapper.allgroup();

    }
}
