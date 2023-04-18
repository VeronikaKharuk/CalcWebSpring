package acad.prog.calcweb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class CalcRecord {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Long x;
    @Column(nullable = false)
    private Long y;
    @Column(nullable = false)
    private Long result;

    public CalcRecord(String type, Long x, Long y, Long result) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.result = result;
    }

    public static CalcRecord of(CalcDTO calcDTO, ResultDTO resultDTO) {
        return new CalcRecord(calcDTO.getType(), calcDTO.getX(), calcDTO.getY(), resultDTO.getResult());
    }
}
