package de.burgerit.values;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Value <T> {
    T value;
}
