package test;

import java.util.HashMap;

public class Assertions {

    /**
     * Asserts the first thing is equal to the second thing
     *
     * @param message  A message describing the test that will be displayed on failure
     * @param expected The expected object to compare to
     * @param actual   The actual object to compare
     */
    public static void assertEquals(String message, Object expected, Object actual) {
        if (expected != null && actual != null) {
            Class expectedClass = expected.getClass();
            Class actualClass = actual.getClass();
            if (expectedClass.equals(actualClass)) {
                if (expectedClass.isArray()) {
                    System.out.print(expectedClass.getSimpleName() + ": \n");
                    if (expectedClass.getSimpleName().equals("int[]")) {
                        if (((int[]) expected).length != ((int[])actual).length) {
                            fail(message, "Integer array lengths differ: expected length: " + ((int[])expected).length + ", actual length: " + ((int[])actual).length);
                        } else {
                            for(int i = 0; i < ((int[]) expected).length; i++){
                                System.out.print("["+i+"] ");
                                assertEquals(message, ((int[])expected)[i], ((int[])actual)[i]);
                            }
                        }
                    } else if (expectedClass.getSimpleName().equals("float[]")) {
                        if (((float[]) expected).length != ((float[])actual).length) {
                            fail(message, "Float array lengths differ: expected length: " + ((float[])expected).length + ", actual length: " + ((float[])actual).length);
                        } else {
                            for(int i = 0; i < ((float[])expected).length; i++) {
                                System.out.print("["+i+"] ");
                                assertEquals(message, ((float[])expected)[i], ((float[])actual)[i]);
                            }
                        }
                    } else if (expectedClass.getSimpleName().equals("double[]")) {
                        if(((double[]) expected).length != ((double[])actual).length) {
                            fail(message, "Double array lengths differ: expected length: " + ((double[])expected).length + ", actual length: " + ((double[])actual).length);
                        } else {
                            for(int i = 0; i < ((double[]) expected).length; i++) {
                                System.out.print("["+i+"] ");
                                assertEquals(message, ((double[])expected)[i], ((double[])actual)[i]);
                            }
                        }
                    } else {
                        if (((Object[]) expected).length != ((Object[]) actual).length) {
                            fail(message, "array lengths differ: expected length: " + ((Object[])expected).length + ", actual length: " + ((Object[])actual).length);
                        } else {
                            for(int i = 0; i < ((Object[]) expected).length; i++) {
                                System.out.print("["+i+"] ");
                                assertEquals(message, ((Object[])expected)[i], ((Object[])actual)[i]);
                            }
                        }
                    }
                } else if (expectedClass.getSimpleName().equals("HashMap")) {
                    System.out.print(expectedClass.getSimpleName() + ": \n");
                    if (((HashMap) expected).keySet().equals(((HashMap)actual).keySet())) {
                        for (Object key : ((HashMap)expected).keySet()) {
                            System.out.print("[" + key + "] ");
                            assertEquals(message, ((HashMap)expected).get(key), ((HashMap)actual).get(key));
                        }
                    } else {
                        fail(message, "HashMap keys are different: " + ((HashMap)expected).keySet() + " vs " +  ((HashMap)actual).keySet());
                    }
                } else {
                    if (expected.equals(actual)) {
                        System.out.println("Objects are equal: expected " + expectedClass.getSimpleName() + ": " + expected + ", actual " + actualClass.getSimpleName() + ": " + actual);
                    } else {
                        fail(message, "expected " + expectedClass.getSimpleName() + ": " + expected + ", actual " + actualClass.getSimpleName() + ": " + actual);
                    }
                }
            } else {
                fail(message, "types are different: expected " + expectedClass.getSimpleName() + ": " + expected + ", actual " + actualClass.getSimpleName() + ": " + actual);
            }
        } else {
            if (expected == actual) {
                System.out.println("expected is null, actual is null");
            }
            else if (expected == null) {
                fail(message, "expected null, actual is " + actual.getClass().getSimpleName() + ": " + actual);
            } else {
                fail(message, "expected " + expected.getClass().getSimpleName() + ": " + expected + ", actual is null");
            }
        }
    }


    /**
     * Reports a failure
     *
     * @param message        The message passed into the test
     * @param failureMessage The message describing the failure
     */
    private static void fail(String message, String failureMessage) {
        if (message == null) {
            message = "";
        }
        if (failureMessage != null) {
            message += "; " + failureMessage;
        }
        throw new AssertionError(message);
    }
}
