# dropwizard-microservice-example
sample code for dropwizard microservice by joel patrick llosa for a stackhunter.com blog

here is the output when you run the service then invoke http://localhost:8080/log?m=saruman&s=two.towers.exception:

<pre>
D:\>java -jar target\dropwizard-microservice-example-0.0.1-SNAPSHOT.jar server
INFO  [2015-12-11 11:53:45,720] org.eclipse.jetty.util.log: Logging initialized
@1151ms
INFO  [2015-12-11 11:53:45,792] io.dropwizard.server.ServerFactory: Starting Log
 Service
INFO  [2015-12-11 11:53:45,803] io.dropwizard.server.DefaultServerFactory: Regis
tering jersey handler with root path prefix: /
INFO  [2015-12-11 11:53:45,817] io.dropwizard.server.DefaultServerFactory: Regis
tering admin handler with root path prefix: /
INFO  [2015-12-11 11:53:45,853] org.eclipse.jetty.setuid.SetUIDListener: Opened
application@a12036{HTTP/1.1}{0.0.0.0:8080}
INFO  [2015-12-11 11:53:45,854] org.eclipse.jetty.setuid.SetUIDListener: Opened
admin@1f1ec20{HTTP/1.1}{0.0.0.0:8081}
INFO  [2015-12-11 11:53:45,857] org.eclipse.jetty.server.Server: jetty-9.2.z-SNA
PSHOT
WARN  [2015-12-11 11:53:46,276] org.glassfish.jersey.server.ApplicationHandler:
Component of class class example.LogService$LogServiceResource cannot be instant
iated and will be ignored.
INFO  [2015-12-11 11:53:46,338] io.dropwizard.jersey.DropwizardResourceConfig: T
he following paths were found for the configured resources:

    GET     /log (example.LogService.LogServiceResource)

WARN  [2015-12-11 11:53:46,340] org.glassfish.jersey.internal.Errors: The follow
ing warnings have been detected: HINT: A HTTP GET method, public void example.Lo
gService$LogServiceResource.get(java.lang.String,java.lang.String), returns a vo
id type. It can be intentional and perfectly fine, but it is a little uncommon t
hat GET method returns always "204 No Content".

INFO  [2015-12-11 11:53:46,341] org.eclipse.jetty.server.handler.ContextHandler:
 Started i.d.j.MutableServletContextHandler@1dfacba{/,null,AVAILABLE}
INFO  [2015-12-11 11:53:46,345] io.dropwizard.setup.AdminEnvironment: tasks =

    POST    /tasks/log-level (io.dropwizard.servlets.tasks.LogConfigurationTask)

    POST    /tasks/gc (io.dropwizard.servlets.tasks.GarbageCollectionTask)

WARN  [2015-12-11 11:53:46,345] io.dropwizard.setup.AdminEnvironment:
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

!    THIS APPLICATION HAS NO HEALTHCHECKS. THIS MEANS YOU WILL NEVER KNOW      !

!     IF IT DIES IN PRODUCTION, WHICH MEANS YOU WILL NEVER KNOW IF YOU'RE      !

!    LETTING YOUR USERS DOWN. YOU SHOULD ADD A HEALTHCHECK FOR EACH OF YOUR    !

!         APPLICATION'S DEPENDENCIES WHICH FULLY (BUT LIGHTLY) TESTS IT.       !

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

INFO  [2015-12-11 11:53:46,349] org.eclipse.jetty.server.handler.ContextHandler:
 Started i.d.j.MutableServletContextHandler@1cd426c{/,null,AVAILABLE}
INFO  [2015-12-11 11:53:46,431] org.eclipse.jetty.server.ServerConnector: Starte
d application@a12036{HTTP/1.1}{0.0.0.0:8080}
INFO  [2015-12-11 11:53:46,438] org.eclipse.jetty.server.ServerConnector: Starte
d admin@1f1ec20{HTTP/1.1}{0.0.0.0:8081}
INFO  [2015-12-11 11:53:46,439] org.eclipse.jetty.server.Server: Started @1871ms

message: saruman, stacktrace: two.towers.exception
0:0:0:0:0:0:0:1 - - [11/Dec/2015:11:53:53 +0000] "GET /log?m=saruman&s=two.tower
s.exception HTTP/1.1" 204 - "-" "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:42.0) Ge
cko/20100101 Firefox/42.0" 56
</pre>
