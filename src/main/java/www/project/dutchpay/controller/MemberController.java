package www.project.dutchpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import www.project.dutchpay.dto.MemberDTO;
import www.project.dutchpay.service.MemberService;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("all")
    public ResponseEntity<List<MemberDTO>> GroupAll(){
       return ResponseEntity.ok(memberService.allgroup());
    }
  /*해당 그룹에 관한 맴버만 가져오기 */
    @PostMapping("/groupget")
    public ResponseEntity<List<MemberDTO>>GroupMember(@RequestBody MemberDTO memberDTO) {
      return ResponseEntity.ok(memberService.GroupMember(memberDTO));
    }

    /*해당 장소에 관한 맴버만 가져오기 */
    @PostMapping("/listget")
    public ResponseEntity<List<MemberDTO>>ListMember(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.ok(memberService.ListMember(memberDTO));
    }

    @PostMapping("/insert")
    public ResponseEntity<String> InsertMember(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.ok(memberService.InsertMember(memberDTO));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> DeleteMember(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.ok(memberService.DeleteMember(memberDTO.getMember_id()));
    }
}
