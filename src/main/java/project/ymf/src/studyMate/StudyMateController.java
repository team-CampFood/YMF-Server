package project.ymf.src.studyMate;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.ymf.common.result.ResultCode;
import project.ymf.common.result.ResultResponse;
import project.ymf.src.studyMate.dto.*;
import project.ymf.src.studyMate.response.StudyMateApplyListResponse;
import project.ymf.src.studyMate.response.StudyMateInfoResponse;
import project.ymf.src.studyMate.response.StudyMateListResponse;

import java.util.List;

@Api(tags = "StudyMate")
@RestController
@RequestMapping("/study")
@RequiredArgsConstructor
public class StudyMateController {
    private final StudyMateService studyMateService;

    @ApiOperation(value = "스터디 메이트 모집글 등록하기")
    @PostMapping()
    public ResponseEntity<ResultResponse> postStudy(@RequestBody StudyMateRequest request){
        studyMateService.postStudy(request);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.POST_STUDY_MATE_SUCCESS));
    }

    @ApiOperation(value = "스터디 메이트 모집글 수정하기")
    @PutMapping("/{studyId}")
    public ResponseEntity<ResultResponse> editStudy(@PathVariable Long studyId,
                                                      @RequestBody StudyMateRequest request){
        studyMateService.editStudy(studyId, request);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.PUT_STUDY_MATE_SUCCESS));
    }

    @ApiOperation(value = "스터디 메이트 모집글 자세히보기")
    @GetMapping("/{studyId}")
    public ResponseEntity<StudyMateInfoResponse> getStudyInfo(@PathVariable Long studyId){
        StudyMateInfoDTO data = studyMateService.getStudyInfo(studyId);
        return ResponseEntity.ok(StudyMateInfoResponse.of(ResultCode.GET_STUDY_MATE_INFO_SUCCESS, data));
    }

    @ApiOperation(value = "스터디 메이트 신청/취소하기")
    @PostMapping("/apply/{studyId}")
    public ResponseEntity<ResultResponse> applyStudy(@PathVariable Long studyId,
                                                       @RequestBody StudyMateApplyRequest request){
        ResultCode result = studyMateService.applyStudy(studyId,request);
        return ResponseEntity.ok(ResultResponse.of(result));
    }

    @ApiOperation(value = "스터디 메이트 모집글 삭제하기")
    @DeleteMapping("/{studyId}")
    public ResponseEntity<ResultResponse> deleteStudy(@PathVariable Long studyId){
        studyMateService.deleteStudy(studyId);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.DELETE_STUDY_MATE_SUCCESS));
    }

    @ApiOperation(value = "스터디 메이트 모집 완료하기")
    @PostMapping("/complete/{studyId}")
    public ResponseEntity<ResultResponse> completeStudy(@PathVariable Long studyId){
        studyMateService.completeStudy(studyId);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.COMPLETE_STUDY_MATE_SUCCESS));
    }

    @ApiOperation(value = "스터디 메이트 신청자목록 조회하기")
    @GetMapping("/apply/{studyId}")
    public ResponseEntity<StudyMateApplyListResponse> getStudySubs(@PathVariable Long studyId){
        List<StudyMateApplyDTO> data = studyMateService.getStudySubs(studyId);
        return ResponseEntity.ok(StudyMateApplyListResponse.of(ResultCode.GET_STUDY_MATE_APPLIES_SUCCESS, data));
    }

    @ApiOperation(value = "스터디 메이트 신청자 수락/취소하기")
    @PostMapping("/accept/{studyId}")
    public ResponseEntity<ResultResponse> acceptStudy(@PathVariable Long studyId,
                                                        @RequestBody StudyMateAcceptRequest request){
        ResultCode result = studyMateService.acceptStudy(studyId,request);
        return ResponseEntity.ok(ResultResponse.of(result));

    }

    @ApiOperation(value = "스터디 메이트 모집글 조회하기(전체)")
    @GetMapping()
    public ResponseEntity<StudyMateListResponse> getAllStudy(){
        List<StudyMateDTO>data = studyMateService.getAllStudy();
        return ResponseEntity.ok(StudyMateListResponse.of(ResultCode.GET_STUDY_MATE_LIST_SUCCESS, data));
    }

    @ApiOperation(value = "스터디 메이트 모집글 검색하기")
    @GetMapping("/search")
    public ResponseEntity<StudyMateListResponse> getSearchedStudy(@RequestParam String keyword){
        List<StudyMateDTO>data = studyMateService.getSearchedStudy(keyword);
        return ResponseEntity.ok(StudyMateListResponse.of(ResultCode.GET_SEARCHED_STUDY_MATE_LIST_SUCCESS,data));
    }

    @ApiOperation(value = "나의 스터디 메이트 조회하기")
    @GetMapping("/mine")
    public ResponseEntity<StudyMateListResponse> getMyStudy(){
        List<StudyMateDTO>data = studyMateService.getMyStudy();
        return ResponseEntity.ok(StudyMateListResponse.of(ResultCode.GET_MY_STUDY_MATE_LIST_SUCCESS,data));
    }
}
