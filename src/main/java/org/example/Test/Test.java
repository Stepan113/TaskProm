package org.example.Test;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Test<K, V> {
    private K keys;
    private V values;
}
