package com.geo.decconv.event.validation;

import java.util.Optional;

/**
 * Created by Tidus on 09/10/2017.
 */
public interface ValidationManager {
    Optional<ValidationResult> runValidation();
}
