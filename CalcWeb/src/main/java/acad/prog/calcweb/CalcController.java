package acad.prog.calcweb;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping("/calc")
    public ResultDTO calculate(@RequestParam String type,
                               @RequestParam Long x,
                               @RequestParam Long y) {
        CalcDTO calcDTO = new CalcDTO(type, x, y);
        ResultDTO result = new ResultDTO();
        switch (type) {
            case "sum" -> result = result.sum(x, y);
            case "mult" -> result = result.multuply(x, y);
            default -> throw new IllegalStateException("Wrong type: " + type);
        }
        calcService.saveCalcRecord(calcDTO, result);
        return result;
    }

}
