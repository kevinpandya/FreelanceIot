package ControllersTest;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class HomeControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(OK, result.status());

        Http.RequestBuilder request2 = new Http.RequestBuilder()
                .method(GET)
                .uri("/?searchPhrase=react+native+developer&sessionId=FIkf8mNP");

        Result result2 = route(app, request2);
        assertEquals(OK, result2.status());

        Http.RequestBuilder request3 = new Http.RequestBuilder()
                .method(GET)
                .uri("/?searchPhrase=react+native&sessionId=FIkf8mNP");

        Result result3 = route(app, request3);
        assertEquals(OK, result3.status());

        Http.RequestBuilder request4 = new Http.RequestBuilder()
                .method(GET)
                .uri("/?searchPhrase=react+native+developer&sessionId=FIkf8mNP");

        Result result4 = route(app, request4);
        assertEquals(OK, result4.status());
    }

    @Test
    public void testSkill() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/skill/3/PHP");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testProfile() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/profile/11591231");

        Http.RequestBuilder request1 = new Http.RequestBuilder()
                .method(GET)
                .uri("/profile/13579218");

        Result result = route(app, request);
        assertEquals(OK, result.status());

        Result result1 = route(app, request1);
        assertEquals(OK, result1.status());
    }

    @Test
    public void testWordStat(){
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/?searchPhrase=react+native+developer&sessionId=FIkf8mNP");

        Result result = route(app, request);
        assertEquals(OK, result.status());

        Http.RequestBuilder request2 = new Http.RequestBuilder()
                .method(GET)
                .uri("/wordstats/react%20native%20developer");

        Result result2 = route(app, request2);
        assertEquals(OK, result2.status());
    }

    @Test
    public void testIndvStat(){
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/?searchPhrase=react+native+developer&sessionId=FIkf8mNP");

        Result result = route(app, request);
        assertEquals(OK, result.status());

        Http.RequestBuilder request1 = new Http.RequestBuilder()
                .method(GET)
                .uri("/indvstats/react%20native%20developer/0");

        Result result1 = route(app, request1);
        assertEquals(OK, result1.status());

    }
}

