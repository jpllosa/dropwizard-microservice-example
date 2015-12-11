package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LogService extends Application<Configuration> {
	
	@Path("/log")
	public class LogServiceResource {
		
		@GET
		public void get(@QueryParam("m") String message, @QueryParam("s") String stacktrace) {
			System.out.println("message: " + message + ", stacktrace: " + stacktrace);
		}
	}
	
    public static void main(String[] args) throws Exception {
        new LogService().run(args);
    }

    @Override
    public String getName() {
        return "Log Service";
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        // do nothing
    }

	@Override
	public void run(Configuration config, Environment env) throws Exception {
		env.jersey().register(new LogServiceResource());
	}
}
