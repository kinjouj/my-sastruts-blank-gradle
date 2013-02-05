package sample.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.framework.unit.Seasar2;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(Seasar2.class)
public class SampleServiceTestCase {

    private SampleService service;

    @Test
    public void test1() {
        assertNotNull(service);
        assertThat(service.say(2), is("hoge"));
        assertThat(service.say(1), is("fuga"));
    }
}
