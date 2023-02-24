package com.pm.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        tags = {
                @Tag(name = "provider momo1", description = "Provider momo."),
                @Tag(name = "provider vietel pay", description = "Provider vietel pay."),
                @Tag(name = "provider paypal", description = "Provider paypal."),
        },
        info = @Info(
                title = "Payment gateway with Quarkus",
                version = "0.0.1",
                contact = @Contact(
                        name = "Api demo",
                        url = "http://beautyxx.com/contact",
                        email = "brian@gmail.com"),
                license = @License(
                        name = "MIT",
                        url = "https://beautyx.com/licenses/brian"))
)
public class SwaggerConfig extends Application {

}
