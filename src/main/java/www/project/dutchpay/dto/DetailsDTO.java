package www.project.dutchpay.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailsDTO {

    private int device_id;
    private int group_id;
    private int list_id;

    private String title;
    private int money;
}
