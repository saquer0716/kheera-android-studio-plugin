package org.jetbrains.plugins.cucumber.java.steps.reference;

import java.util.Arrays;
import java.util.List;

/**
 * User: Andrey.Vokin
 * Date: 7/23/12
 */
public class CucumberJavaAnnotationProvider {
  public static final String[] STEP_MARKERS = {"Given", "Then", "And", "But", "When"};
  public static final String[] TEST_STEP_MARKERS = {"TestStep"};
  public static final String[] HOOK_MARKERS = {"Before", "After"};

  public static List<String> getCucumberStepAnnotations() {
    return Arrays.asList(TEST_STEP_MARKERS);
  }

  public static List<String> getCucumberHookAnnotations() {
    return Arrays.asList(HOOK_MARKERS);
  }
}
