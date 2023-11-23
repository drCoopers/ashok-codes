package in.sanketdd.projOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProjOneApplication.class, args);
		System.out.println(SpringApplication.getShutdownHandlers());
		System.out.println(SpringApplication.BANNER_LOCATION_PROPERTY_VALUE);
		System.out.println(context.getApplicationStartup());
		System.out.println(context.getEnvironment().getPropertySources());
		System.out.println(context.getBeanDefinitionCount());
	}

}
