package www.project.dutchpay.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupDTO {

    private int group_id;
    private String group_name;
    private int device_id;
}
