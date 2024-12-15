package www.project.dutchpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import www.project.dutchpay.dto.DetailsDTO;

import www.project.dutchpay.response.DetailsResponse;
import www.project.dutchpay.service.DetailsService;

import java.util.List;

@RestController
@RequestMapping("/Details")
public class DetailController {

    @Autowired
    DetailsService detailsService;
    @PostMapping("/get")
    public ResponseEntity<List<DetailsDTO>> getList(@RequestBody DetailsDTO detailsDTO){
        return ResponseEntity.ok(detailsService.getList(detailsDTO.getGroup_id()));
    }

    @PostMapping("/insert")
    public ResponseEntity<String> insertList(@RequestBody DetailsDTO detailsDTO){
        return ResponseEntity.ok(detailsService.insertList(detailsDTO));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<DetailsResponse> deleteList(@RequestBody DetailsDTO detailsDTO){
        DetailsResponse DR = new DetailsResponse();
        boolean bool =detailsService.deleteList(detailsDTO);
        if(bool){
            DR.setSuccess(true);
            DR.setMessage("삭제 완료했습니다");
        }else{
            DR.setSuccess(false);
            DR.setMessage("삭제 실패했습니다.");
        }
        return ResponseEntity.ok(DR);
    }

    @PatchMapping("/update")
    public ResponseEntity<Object> updateList(@RequestBody DetailsDTO detailsDTO){
        DetailsResponse DR = new DetailsResponse();
        boolean bool =detailsService.updateList(detailsDTO);
        if(bool){
            DR.setSuccess(true);
            DR.setMessage("수정 완료");
        }else{
            DR.setSuccess(false);
            DR.setMessage("수정 실패");
        }
        return ResponseEntity.ok(DR);
    }
}
