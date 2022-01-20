package pl.sztukakodu.jobboard.postings.domain;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Posting {
    private Long id;

    @NotNull
    @Valid
    private Company company;

    @NotEmpty
    private String description;

    @DecimalMin("1.00")
    @NotNull
    private BigDecimal salary;

    @Future
    @NotNull
    private LocalDate expiresAt;
}
