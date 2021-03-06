package edu.umich.srg.testing;

import org.junit.experimental.theories.ParametersSuppliedBy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ParametersSuppliedBy(TestLongsSupplier.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestLongs {
  long[] value();
}
