package project.ymf.src.studyMate;

import org.springframework.stereotype.Service;
import project.ymf.src.studyMate.dto.*;

import java.util.List;

@Service
public class StudyMateService {
    public void postStudy(StudyMateRequest request) {
    }

    public void editStudy(Long studyId, StudyMateRequest request) {
    }

    public StudyMateInfoDTO getStudyInfo(Long studyId) {
    }
    public void applyStudy(Long studyId, StudyMateApplyRequest request) {
    }

    public void deleteStudy(Long studyId) {
    }

    public void completeStudy(Long studyId) {
    }

    public List<StudyMateApplyDTO> getStudySubs(Long studyId) {
    }

    public void acceptStudy(Long studyId, StudyMateAcceptRequest request) {
    }

    public List<StudyMateDTO> getAllStudy() {
    }

    public List<StudyMateDTO> getSearchedStudy(String keyword) {
    }

    public List<StudyMateDTO> getMyStudy() {
    }
}
