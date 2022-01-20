package pl.sztukakodu.jobboard.postings.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Posting {
    private Long id;
    private Company company;			// not empty

    private String description;			// not empty
    private BigDecimal salary;			// not empty, bigger than 0

    private LocalDate expiresAt;				// future date
}
