package test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AssertionsTest {

    /**
     * Test variables
     */
    private static final String STRING_1 = "1";
    private static final String STRING_1_TWIN = "1";
    private static final String STRING_2 = "2";
    private static final int NUMBER_1 = 1;
    private static final int NUMBER_1_TWIN = 1;
    private static final String NOTHING = null;
    private static final String NOTHING_TWIN = null;
    private static final Map<String, String[]> EMPTY_MAP = new HashMap<String, String[]>();
    private static final Map<String, String[]> EMPTY_MAP_TWIN = new HashMap<String, String[]>();
    private static final int[] EMPTY_ARRAY = new int[]{};
    private static final int[] EMPTY_ARRAY_TWIN = new int[]{};
    private static final Map<String, Object[]> MAP_1 = new HashMap<String, Object[]>();
    private static final Map<String, Object[]> MAP_1_TWIN = new HashMap<String, Object[]>();
    private static final Map<String, Object[]> MAP_2 = new HashMap<String, Object[]>();
    private static final Map<String, Object[]> MAP_3 = new HashMap<String, Object[]>();
    private static final Map<String, Object[]> MAP_4 = new HashMap<String, Object[]>();
    private static final Map<String, Object[]> MAP_5 = new HashMap<String, Object[]>();
    private static final Object[] ARRAY_1 = new Object[]{new Object[]{1, 2, 3}, new Object[]{1, 2, 3}};
    private static final Object[] ARRAY_1_TWIN = new Object[]{new Object[]{1, 2, 3}, new Object[]{1, 2, 3}};
    private static final Object[] ARRAY_2 = new Object[]{new Object[]{1, 2, 3}, new Object[]{1, 2, "3"}};
    private static final Object[] ARRAY_3 = new Object[]{1, 2, 3, 4, 5};
    private static final Object[] ARRAY_4 = new Object[]{1, 2, 3, 4};
    private static final Object[] ARRAY_5 = new Object[]{1, 2, 3, 4, "5"};
    private static final Object[] ARRAY_6 = new Object[]{1, 2, 3, 4, "6"};
    private static final float[] ARRAY_7 = new float[]{1.23f, 2.25f, 3.35f, 4.35f};
    private static final float[] ARRAY_8 = new float[]{1.23f, 2.25f, 3.35f, 4.35f, 3.21f};
    private static final double[] ARRAY_9 = new double[]{1.23, 2.25, 3.35, 4.35, 3.22};
    private static final double[] ARRAY_10 = new double[]{1.23, 2.25, 3.35, 4.35, 3.21};
    private static final String[] STRING_ARRAY_1 = new String[]{"abc", "def"};
    private static final String[] STRING_ARRAY_2 = new String[]{"abc", "def"};
    private static final String[] STRING_ARRAY_3 = new String[]{"abc", "def"};
    private static final String[] STRING_ARRAY_4 = new String[]{"abc", "defg"};
    private static final MyClass MY_CLASS_1 = new MyClass("abc", "def");
    private static final MyClass MY_CLASS_2 = new MyClass("abc", "def");
    private static final MyClass MY_CLASS_3 = new MyClass("abc", "def");
    private static final MyClass MY_CLASS_4 = new MyClass("abc", "defg");

    static {
        final Map<String, Object> innerObject1 = new HashMap<String, Object>();
        innerObject1.put("Item1.1", "0");
        final Map<String, Object> innerObject2 = new HashMap<String, Object>();
        innerObject2.put("Item2.1", "Red");
        final Map<String, Object> innerObject3 = new HashMap<String, Object>();
        innerObject3.put("Item1.1", 0);
        final Map<String, Object> innerObject4 = new HashMap<String, Object>();
        innerObject4.put("Item2.1", "Red");

        MAP_1.put("Item1", new Object[]{"A", "B", "C", "D"});
        MAP_1.put("Item2", new Object[]{"A", "B", "C"});
        MAP_1_TWIN.put("Item1", new Object[]{"A", "B", "C", "D"});
        MAP_1_TWIN.put("Item2", new Object[]{"A", "B", "C"});
        MAP_2.put("First", new Object[]{"A", "B", "C", "D"});
        MAP_2.put("Second", new Object[]{"A", "B", "C", "D"});
        MAP_3.put("Item1", new Object[]{"A", "B", "C", "D"});
        MAP_3.put("Item2", new Object[]{"A", "B", "C", "D"});
        MAP_4.put("Item1", new Object[]{innerObject1});
        MAP_4.put("Item2", new Object[]{innerObject2});
        MAP_5.put("Item1", new Object[]{innerObject3});
        MAP_5.put("Item2", new Object[]{innerObject4});
    }
	
	@Test
	public void pass_001() throws Exception {
		Assertions.assertEquals("Should Pass 1: STRING_1 vs STRING_1_TWIN", STRING_1, STRING_1_TWIN);
	}
	
	@Test
	public void pass_002() throws Exception {
		Assertions.assertEquals("Should Pass 2: NUMBER_1 vs NUMBER_1_TWIN", NUMBER_1, NUMBER_1_TWIN);
	}
	
	@Test
	public void pass_003() throws Exception {
		Assertions.assertEquals("Should Pass 3: NOTHING vs NOTHING_TWIN", NOTHING, NOTHING_TWIN);
	}
	
	@Test
	public void pass_004() throws Exception {
		Assertions.assertEquals("Should Pass 4: EMPTY_MAP vs EMPTY_MAP_TWIN", EMPTY_MAP, EMPTY_MAP_TWIN);
	}
	
	@Test
	public void pass_005() throws Exception {
		Assertions.assertEquals("Should Pass 5: MAP_1 vs MAP_1_TWIN", MAP_1, MAP_1_TWIN);
	}
		
	@Test
	public void pass_006() throws Exception {
		Assertions.assertEquals("Should Pass 6: EMPTY_ARRAY vs EMPTY_ARRAY_TWIN", EMPTY_ARRAY, EMPTY_ARRAY_TWIN);
	}
	
	@Test
	public void pass_007() throws Exception {
		Assertions.assertEquals("Should Pass 7: ARRAY_1 vs ARRAY_1_TWIN", ARRAY_1, ARRAY_1_TWIN);
	}

    @Test
    public void pass_008() throws Exception {
        Assertions.assertEquals("Should Pass 8: MY_CLASS_1 vs MY_CLASS_2", MY_CLASS_1, MY_CLASS_2);
    }

    @Test
    public void pass_009() throws Exception {
        Assertions.assertEquals("Should Pass 9: STRING_ARRAY_1 vs STRING_ARRAY_2", STRING_ARRAY_1, STRING_ARRAY_2);
    }

    @Test
    public void test_001() throws Exception {
        Assertions.assertEquals("Should Fail1: STRING_1 vs STRING_2", STRING_1, STRING_2);
    }

    @Test
    public void test_002() throws Exception {
        Assertions.assertEquals("Should Fail2: STRING_1 vs NUMBER_1", STRING_1, NUMBER_1);
    }

    @Test
    public void test_003() throws Exception {
        Assertions.assertEquals("Should Fail3: STRING_1 vs MAP_1", STRING_1, MAP_1);
    }

    @Test
    public void test_004() throws Exception {
        Assertions.assertEquals("Should Fail4: EMPTY_MAP vs MAP_1", EMPTY_MAP, MAP_1);
    }

    @Test
    public void test_005() throws Exception {
        Assertions.assertEquals("Should Fail5: EMPTY_MAP vs EMPTY_ARRAY", EMPTY_MAP, EMPTY_ARRAY);
    }

    @Test
    public void test_006() throws Exception {
        Assertions.assertEquals("Should Fail6: MAP_1 vs NOTHING", MAP_1, NOTHING);
    }

    @Test
    public void test_007() throws Exception {
        Assertions.assertEquals("Should Fail7: MAP_1 vs MAP_2", MAP_1, MAP_2);
    }

    @Test
    public void test_008() throws Exception {
        Assertions.assertEquals("Should Fail8: MAP_2 vs MAP_3", MAP_2, MAP_3);
    }

    @Test
    public void test_009() throws Exception {
        Assertions.assertEquals("Should Fail9: MAP_4 vs MAP_5", MAP_4, MAP_5);
    }

    @Test
    public void test_010() throws Exception {
        Assertions.assertEquals("Should Fail10: ARRAY_1 vs ARRAY_2", ARRAY_1, ARRAY_2);
    }

    @Test
    public void test_011() throws Exception {
        Assertions.assertEquals("Should Fail11: ARRAY_3 vs ARRAY_4", ARRAY_3, ARRAY_4);
    }

    @Test
    public void test_012() throws Exception {
        Assertions.assertEquals("Should Fail12: ARRAY_3 vs ARRAY_5", ARRAY_3, ARRAY_5);
    }

    @Test
    public void test_013() throws Exception {
        Assertions.assertEquals("Should Fail13: ARRAY_5 vs ARRAY_6", ARRAY_5, ARRAY_6);
    }

    @Test
    public void test_014() throws Exception {
        Assertions.assertEquals("Should Fail14: ARRAY_7 vs ARRAY_8", ARRAY_7, ARRAY_8);
    }

    @Test
    public void test_015() throws Exception {
        Assertions.assertEquals("Should Fail15: STRING_ARRAY_3 vs STRING_ARRAY_4", STRING_ARRAY_3, STRING_ARRAY_4);
    }

    @Test
    public void test_016() throws Exception {
        Assertions.assertEquals("Should Fail16: MY_CLASS_3 vs MY_CLASS_4", MY_CLASS_3, MY_CLASS_4);
    }

    @Test
    public void test_017() throws Exception {
        Assertions.assertEquals("Should Fail17: ARRAY_9 vs ARRAY_10", ARRAY_9, ARRAY_10);
    }
}
