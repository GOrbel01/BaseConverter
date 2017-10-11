package com.geo.decconv.event.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Tidus on 11/10/2017.
 */
public class ValidationResultListImpl implements ValidationResultList {
    private List<ValidationResult> validationResults;

    public ValidationResultListImpl() {
        validationResults = new ArrayList<>();
    }

    @Override
    public void addResult(ValidationResult validationResult) {
        if (validationResult != null)
        validationResults.add(validationResult);
    }

    @Override
    public Optional<List<ValidationResult>> getValidationErrors() {
        List<ValidationResult> results = validationResults.stream().filter(vr -> !vr.isValid()).collect(Collectors.toList());
        if (results.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(results);
        }
    }

    @Override
    public boolean hasErrors() {
        return getValidationErrors().isPresent();
    }

    @Override
    public String getErrorMessages() {
        StringBuilder sb = new StringBuilder();
        Optional<List<ValidationResult>> resultOptional = getValidationErrors();
        if (!resultOptional.isPresent()) {
            throw new IllegalArgumentException("Get error message invoked but no error messages found.");
        }
        List<ValidationResult> results = resultOptional.get();
        for (int i = 0; i < results.size(); i++) {
            if (i == results.size()-1) {
                sb.append(results.get(i).getMessage());
            } else {
                sb.append(results.get(i).getMessage()).append("\n");
            }
        }
        return sb.toString();
    }
}
