package com.geo.decconv.event.validation;

import java.util.List;
import java.util.Optional;

/**
 * Created by Tidus on 11/10/2017.
 * Not Going to use this. Was written to validate all fields
 */
public interface ValidationResultList {
    void addResult(ValidationResult validationResult);
    Optional<List<ValidationResult>> getValidationErrors();
    boolean hasErrors();
    String getErrorMessages();
}
