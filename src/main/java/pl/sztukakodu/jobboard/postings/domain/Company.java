package pl.sztukakodu.jobboard.postings.domain;

import lombok.Data;

@Data
public class Company {
    private String name;    // not empty, up to 256 chars
    private String contact; // email
    private String website; // url
}
