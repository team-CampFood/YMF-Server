package project.ymf.src.studyMate.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class StudyMateRequest {

    private String title;
    private int maximumPeople;
    private LocalDateTime time;
    private String description;
    private String location;
    private  String purpose;

}
