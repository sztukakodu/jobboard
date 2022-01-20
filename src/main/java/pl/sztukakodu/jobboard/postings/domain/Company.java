package pl.sztukakodu.jobboard.postings.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class Company {
    @NotNull
    @Length(min = 1, max = 256)
    private String name;

    @NotNull
    @Email
    private String contact;

    @NotNull
    @URL
    private String website;
}
