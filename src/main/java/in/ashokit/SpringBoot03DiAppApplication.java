package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.ReportService.ReportService;

@SpringBootApplication
public class SpringBoot03DiAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringBoot03DiAppApplication.class, args);
		
		//run() is called from main method
		//run() entry point of application execution
		//lot of code is executing internally in run()
		/*which will create ioc container 
		 * which will print the banner
		 * which will calls the runners
		 * return type of the run() is ConfigurableApplicationContext*/
		ReportService service=ctx.getBean(ReportService.class);
		//ReportService class obj
		
		service.printName(101);
	}

}
/*by running this clss we will get  exception
 *  org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type*/

/*i m asking ioc container to give ReportService object
 * ReportService is available in the project
 * but ioc container  could not know that it is sspring bean
 the class is not represented as spring bean so ioc contyainer unable to
 recognize the object nd it is throwing Exception
 
 *so that i need to represent the class as spring bean so that ioc container can define that
 *class as spring bean*/

/*after placeing the annotation  
 * @Service we will get nullpointer exception
 * bcs dependency injection is not happening
 * dao clas object is not inserted to Service class
 * ReportDAo class obj ref variable is not initialized
 * so null value is there  in ref var so null pointer exception is raised*/
 