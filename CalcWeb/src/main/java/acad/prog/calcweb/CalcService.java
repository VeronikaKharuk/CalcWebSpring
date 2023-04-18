package acad.prog.calcweb;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CalcService {
    private final CalcRepository calcRepository;

    public CalcService(CalcRepository calcRepository) {
        this.calcRepository = calcRepository;
    }

    @Transactional
    public long saveCalcRecord(CalcDTO calcDTO, ResultDTO resultDTO) {
        var calcRecord = CalcRecord.of(calcDTO, resultDTO);
        calcRepository.save(calcRecord);
        return calcRecord.getId();
    }
}
