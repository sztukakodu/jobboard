package pl.sztukakodu.jobboard.postings.domain;

import java.math.BigDecimal;

class Salary {
    SalaryType type;        // enumerated
    BigDecimal from;    // above 0
    BigDecimal to;        // above "from"
    Currency currency;    // 3 letters
}
