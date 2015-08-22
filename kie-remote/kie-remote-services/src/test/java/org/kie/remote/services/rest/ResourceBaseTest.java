package org.kie.remote.services.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.kie.api.task.model.Status;

public class ResourceBaseTest extends ResourceBase {

    @Test
    public void statusEnumTest() { 
       for( Status testStatus : Status.values())  { 
          Status roundTripStatus = getEnum(testStatus.toString().toLowerCase());
          assertEquals( testStatus + " incorrectly processed!", testStatus, roundTripStatus);
       }
    }

    @Test
    public void testReadNumberAsString() {
        String numberAsString = "\"10\"";

        Map<String, String[]> params = new HashMap<String, String[]>();
        String [] data = {numberAsString};
        params.put("stringnumber", data);

        Object value = getObjectParam("stringnumber", true, params, "dummy");
        assertNotNull(value);
        assertTrue(value instanceof String);
        assertEquals("10", value);
    }

    @Test
    public void testReadNumberAsNumber() {
        String numberString = "10";

        Map<String, String[]> params = new HashMap<String, String[]>();
        String [] data = {numberString};
        params.put("number", data);

        Object value = getObjectParam("number", true, params, "dummy");
        assertNotNull(value);
        assertTrue(value instanceof Number);
        assertEquals(10L, value);
    }
}
