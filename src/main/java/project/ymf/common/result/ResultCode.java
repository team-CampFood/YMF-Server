package project.ymf.common.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    //Member

    //purchaseMate

    POST_PURCHASE_MATE_SUCCESS(201,"P_001", "공동구매 게시글을 등록하였습니다."),
    PUT_PURCHASE_MATE_SUCCESS(200,"P_002", "공동구매 게시글을 수정하였습니다."),
    GET_PURCHASE_MATE_INFO_SUCCESS(200,"P_003", "공동구매 게시글 하나를 조회하였습니다."),
    POST_PURCHASE_MATE_APPLY_SUCCESS(201,"P_004", "공동구매 신청을 완료하였습니다."),
    POST_PURCHASE_MATE_CANCEL_SUCCESS(200,"P_005", "공동구매 신청을 취소하였습니다."),
    DELETE_PURCHASE_MATE_SUCCESS(200,"P_006", "공동구매 게시글을 삭제하였습니다."),
    COMPLETE_PURCHASE_MATE_SUCCESS(200,"P_007", "공동구매 모집을 완료하였습니다."),
    GET_PURCHASE_MATE_APPLIES_SUCCESS(200,"P_008", "해당 공동구매의 모든 신청을 조회하였습니다."),
    ACCEPT_PURCHASE_MATE_APPLY_SUCCESS(201,"P_009", "해당 공동구매 신청을 수락하였습니다."),
    REJECT_PURCHASE_MATE_APPLY_SUCCESS(200,"P_010", "해당 공동구매 신청을 거절하였습니다."),
    GET_PURCHASE_MATE_LIST_SUCCESS(200,"P_011", "모든 공동구매 게시글을 조회하였습니다."),
    GET_SEARCHED_PURCHASE_MATE_LIST_SUCCESS(200,"P_012", "공동구매 게시글을 검색하였습니다."),
    GET_MY_PURCHASE_MATE_LIST_SUCCESS(200,"P_013", "나의 모든 공동구매 메이트를 조회하였습니다."),

    //singingMate

    POST_SINGING_MATE_SUCCESS(201,"SI_001", "노래방 메이트 게시글을 등록하였습니다."),
    PUT_SINGING_MATE_SUCCESS(200,"SI_002", "노래방 메이트 게시글을 수정하였습니다."),
    GET_SINGING_MATE_INFO_SUCCESS(200,"SI_003", "노래방 메이트 게시글 하나를 조회하였습니다."),
    POST_SINGING_MATE_APPLY_SUCCESS(201,"SI_004", "노래방 메이트 신청을 완료하였습니다."),
    POST_SINGING_MATE_CANCEL_SUCCESS(200,"SI_005", "노래방 메이트 신청을 취소하였습니다."),
    DELETE_SINGING_MATE_SUCCESS(200,"SI_006", "노래방 메이트 게시글을 삭제하였습니다."),
    COMPLETE_SINGING_MATE_SUCCESS(200,"SI_007", "노래방 메이트 모집을 완료하였습니다."),
    GET_SINGING_MATE_APPLIES_SUCCESS(200,"SI_008", "해당 노래방 메이트의 모든 신청을 조회하였습니다."),
    ACCEPT_SINGING_MATE_APPLY_SUCCESS(201,"SI_009", "해당 노래방 메이트 신청을 수락하였습니다."),
    REJECT_SINGING_MATE_APPLY_SUCCESS(200,"SI_010", "해당 노래방 메이트 신청을 거절하였습니다."),
    GET_SINGING_MATE_LIST_SUCCESS(200,"SI_011", "모든 노래방 메이트 게시글을 조회하였습니다."),
    GET_SEARCHED_SINGING_MATE_LIST_SUCCESS(200,"SI_012", "노래방 메이트 게시글을 검색하였습니다."),
    GET_MY_SINGING_MATE_LIST_SUCCESS(200,"SI_013", "나의 모든 노래방 메이트를 조회하였습니다."),

    //studyMate

    POST_STUDY_MATE_SUCCESS(201,"ST_001", "스터디 메이트 게시글을 등록하였습니다."),
    PUT_STUDY_MATE_SUCCESS(200,"ST_002", "스터디 메이트 게시글을 수정하였습니다."),
    GET_STUDY_MATE_INFO_SUCCESS(200,"ST_003", "스터디 메이트 게시글 하나를 조회하였습니다."),
    POST_STUDY_MATE_APPLY_SUCCESS(201,"ST_004", "스터디 메이트 신청을 완료하였습니다."),
    POST_STUDY_MATE_CANCEL_SUCCESS(200,"ST_005", "스터디 메이트 신청을 취소하였습니다."),
    DELETE_STUDY_MATE_SUCCESS(200,"ST_006", "스터디 메이트 게시글을 삭제하였습니다."),
    COMPLETE_STUDY_MATE_SUCCESS(200,"ST_007", "스터디 메이트 모집을 완료하였습니다."),
    GET_STUDY_MATE_APPLIES_SUCCESS(200,"St_008", "해당 스터디 메이트의 모든 신청을 조회하였습니다."),
    ACCEPT_STUDY_MATE_APPLY_SUCCESS(201,"St_009", "해당 스터디 메이트 신청을 수락하였습니다."),
    REJECT_STUDY_MATE_APPLY_SUCCESS(200,"ST_010", "해당 스터디 메이트 신청을 거절하였습니다."),
    GET_STUDY_MATE_LIST_SUCCESS(200,"ST_011", "모든 스터디 메이트 게시글을 조회하였습니다."),
    GET_SEARCHED_STUDY_MATE_LIST_SUCCESS(200,"ST_012", "스터디 메이트 게시글을 검색하였습니다."),
    GET_MY_STUDY_MATE_LIST_SUCCESS(200,"ST_013", "나의 모든 스터디 메이트를 조회하였습니다.");

    private final int status;
    private final String code;
    private final String message;
}
