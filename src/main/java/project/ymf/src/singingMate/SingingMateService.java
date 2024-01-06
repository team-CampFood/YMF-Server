package project.ymf.src.singingMate;

import org.springframework.stereotype.Service;
import project.ymf.src.singingMate.dto.*;
import project.ymf.src.singingMate.dto.SingingMateDTO;
import project.ymf.src.singingMate.response.SingingMateInfoResponse;

import java.util.List;

@Service
public class SingingMateService {
    public void postSinging(SingingMateRequest request) {
    }

    public void editSinging(Long singingId, SingingMateRequest request) {
    }

    public SingingMateInfoDTO getSingingInfo(Long singingId) {
    }

    public void applySinging(Long singingId, SingingMateApplyRequest request) {
    }

    public void deleteSinging(Long singingId) {
    }

    public void completeSinging(Long singingId) {
    }

    public void acceptSinging(Long singingId, SingingMateAcceptRequest request) {
    }
    public List<SingingMateApplyDTO> getSingingSubs(Long singingId) {
    }

    public List<SingingMateDTO> getSearchedSinging(String keyword) {
    }
    public List<SingingMateDTO> getAllSinging() {
    }

    public List<SingingMateDTO> getMySinging() {
    }


}
