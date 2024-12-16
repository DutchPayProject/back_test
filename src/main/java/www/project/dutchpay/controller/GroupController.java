package www.project.dutchpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import www.project.dutchpay.dto.GroupDTO;
import www.project.dutchpay.service.GroupService;


import java.util.List;

@RestController
@RequestMapping("/Group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("/getGroup")
    public List<GroupDTO> Collect() {
        return groupService.getGroup();
    }

    @PostMapping("/insertGroup")
    public String Insert(@RequestBody GroupDTO groupDto){
        return groupService.insertGroup(groupDto);

    }

    @PutMapping("/updateGroup")
    public String Update(@RequestBody GroupDTO groupDto){
        return groupService.updateGroup(groupDto);
    }

    @DeleteMapping("/deleteGroup")
    public String Delete(@RequestBody GroupDTO groupDto){
        return groupService.deleteGroup(groupDto);
    }

}
