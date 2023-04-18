package acad.prog.calcweb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResultDTO {
    protected Long result;

    public ResultDTO(Long result) {
        this.result = result;
    }

    public ResultDTO sum(long x, long y) {
        return new ResultDTO(x + y);
    }

    public ResultDTO multuply(long x, long y) {
        return new ResultDTO(x * y);
    }
}
