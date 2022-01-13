package pl.sztukakodu.jobboard.postings.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Posting {
    String id = UUID.randomUUID().toString();
    Company company;			// not empty

    String description;			// not empty
    Salary salary;				// not empty
    List<Seniority> seniority;	// not empty

    Date expiresAt;				// future date
}
