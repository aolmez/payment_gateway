package com.pm.api;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.Route.HttpMethod;
import io.vertx.ext.web.RoutingContext;

@ApplicationScoped
public class GreetingReactiveResource {
	@Route(path = "reactive", methods = HttpMethod.GET)
	public void reactive(RoutingContext ctx) {
		ctx.response().end("Hello Reactive QUARKUS");
	}
}
