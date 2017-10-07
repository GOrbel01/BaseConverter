package com.geo.decconv.event.button;

import com.geo.decconv.main.DecimalConverterController;
import com.geo.decconv.model.ConvertOperation;

import java.util.Optional;

/**
 * Created by Tidus on 07/10/2017.
 */
public interface ConvertEventHandler {
    Optional<ConvertOperation> handleConversion(DecimalConverterController controller);
}
