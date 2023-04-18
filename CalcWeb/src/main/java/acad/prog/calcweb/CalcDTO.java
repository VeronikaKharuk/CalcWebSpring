package acad.prog.calcweb;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CalcDTO {
    private String type;

    private Long x;

    private Long y;

    public CalcDTO(String type, Long x, Long y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }
}
