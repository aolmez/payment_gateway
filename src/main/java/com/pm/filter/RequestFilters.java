package com.pm.filter;

import io.quarkus.vertx.web.RouteFilter;
import io.vertx.ext.web.RoutingContext;

public class RequestFilters {
	@RouteFilter(100)
	void myFilter(RoutingContext rc) {
		rc.response().putHeader("X-Header", "intercepting the request");
		rc.next();
	}
}
