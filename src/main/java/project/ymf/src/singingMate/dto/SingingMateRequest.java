package project.ymf.src.singingMate.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
public class SingingMateRequest {

    private String title;
    private int maximumPeople;
    private LocalDateTime time;
    private String description;
    private String location;
}
