package pl.sztukakodu.jobboard.postings.web;

import java.util.ArrayList;
import java.util.List;

record ValidationErrorResponse(List<Violation> violations) {

  ValidationErrorResponse() {
    this(new ArrayList<>());
  }
}
