package com.talios;

import org.immutables.value.Value;

@Value.Immutable
public interface SomeData {

  @Value.Parameter
  String name();

}
