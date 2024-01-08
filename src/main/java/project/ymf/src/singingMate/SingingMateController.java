package project.ymf.src.singingMate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.ymf.common.result.ResultCode;
import project.ymf.common.result.ResultResponse;
import project.ymf.src.singingMate.dto.*;
import project.ymf.src.singingMate.dto.SingingMateDTO;
import project.ymf.src.singingMate.response.SingingMateApplyListResponse;
import project.ymf.src.singingMate.response.SingingMateInfoResponse;
import project.ymf.src.singingMate.response.SingingMateListResponse;
import java.util.List;

@Api(tags = "SingingMate")
@RestController
@RequestMapping("/singings")
@RequiredArgsConstructor
public class SingingMateController {
    private final SingingMateService singingMateService;

    @ApiOperation(value = "노래방 메이트 모집글 등록하기")
    @PostMapping()
    public ResponseEntity<ResultResponse> postSinging(@RequestBody SingingMateRequest request){
        singingMateService.postSinging(request);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.Example));
    }

    @ApiOperation(value = "노래방 메이트 모집글 수정하기")
    @PutMapping("/{singingId}")
    public ResponseEntity<ResultResponse> editSinging(@PathVariable Long singingId,
                                                      @RequestBody SingingMateRequest request){
        singingMateService.editSinging(singingId, request);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.Example));
    }

    @ApiOperation(value = "노래방 메이트 모집글 자세히보기")
    @GetMapping("/{singingId}")
    public ResponseEntity<SingingMateInfoResponse> getSingingInfo(@PathVariable Long singingId){
        SingingMateInfoDTO data = singingMateService.getSingingInfo(singingId);
        return ResponseEntity.ok(SingingMateInfoResponse.of(ResultCode.Example, data));
    }

    @ApiOperation(value = "노래방 메이트 신청/취소하기")
    @PostMapping("/apply/{singingId}")
    public ResponseEntity<ResultResponse> applySinging(@PathVariable Long singingId,
                                                       @RequestBody SingingMateApplyRequest request){
        singingMateService.applySinging(singingId,request);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.Example));
    }

    @ApiOperation(value = "노래방 메이트 모집글 삭제하기")
    @DeleteMapping("/{singingId}")
    public ResponseEntity<ResultResponse> deleteSinging(@PathVariable Long singingId){
        singingMateService.deleteSinging(singingId);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.Example));
    }

    @ApiOperation(value = "노래방 메이트 모집 완료하기")
    @PostMapping("/complete/{singingId}")
    public ResponseEntity<ResultResponse> completeSinging(@PathVariable Long singingId){
        singingMateService.completeSinging(singingId);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.Example));
    }

    @ApiOperation(value = "노래방 메이트 신청자목록 조회하기")
    @GetMapping("/apply/{singingId}")
    public ResponseEntity<SingingMateApplyListResponse> getSingingSubs(@PathVariable Long singingId){
        List<SingingMateApplyDTO> data = singingMateService.getSingingSubs(singingId);
        return ResponseEntity.ok(SingingMateApplyListResponse.of(ResultCode.Example, data));
    }

    @ApiOperation(value = "노래방 메이트 신청자 수락/취소하기")
    @PostMapping("/accept/{singingId}")
    public ResponseEntity<ResultResponse> acceptSinging(@PathVariable Long singingId,
                                                        @RequestBody SingingMateAcceptRequest request){
        singingMateService.acceptSinging(singingId,request);
        return ResponseEntity.ok(ResultResponse.of(ResultCode.Example));

    }

    @ApiOperation(value = "노래방 메이트 모집글 조회하기(전체)")
    @GetMapping()
    public ResponseEntity<SingingMateListResponse> getAllSinging(){
        List<SingingMateDTO>data = singingMateService.getAllSinging();
        return ResponseEntity.ok(SingingMateListResponse.of(ResultCode.Example, data));
    }

    @ApiOperation(value = "노래방 메이트 모집글 검색하기")
    @GetMapping("/search")
    public ResponseEntity<SingingMateListResponse> getSearchedSinging(@RequestParam String keyword){
        List<SingingMateDTO>data = singingMateService.getSearchedSinging(keyword);
        return ResponseEntity.ok(SingingMateListResponse.of(ResultCode.Example,data));
    }

    @ApiOperation(value = "나의 노래방 메이트 조회하기")
    @GetMapping("/mine")
    public ResponseEntity<SingingMateListResponse> getMySinging(){
        List<SingingMateDTO>data = singingMateService.getMySinging();
        return ResponseEntity.ok(SingingMateListResponse.of(ResultCode.Example,data));
    }

}