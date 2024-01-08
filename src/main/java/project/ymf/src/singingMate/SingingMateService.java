package project.ymf.src.singingMate;

import org.springframework.stereotype.Service;
import project.ymf.common.result.ResultCode;
import project.ymf.src.singingMate.dto.*;
import project.ymf.src.singingMate.dto.SingingMateDTO;

import java.util.List;

@Service
public class SingingMateService {
    public void postSinging(SingingMateRequest request) {
    }

    public void editSinging(Long singingId, SingingMateRequest request) {
    }

    public SingingMateInfoDTO getSingingInfo(Long singingId) {
    }

    public ResultCode applySinging(Long singingId, SingingMateApplyRequest request) {
    }

    public void deleteSinging(Long singingId) {
    }

    public void completeSinging(Long singingId) {
    }

    public ResultCode acceptSinging(Long singingId, SingingMateAcceptRequest request) {
    }
    public List<SingingMateApplyDTO> getSingingApplies(Long singingId) {
    }

    public List<SingingMateDTO> getSearchedSinging(String keyword) {
    }
    public List<SingingMateDTO> getAllSinging() {
    }

    public List<SingingMateDTO> getMySinging() {
    }


}
