package org.gfg.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.DispatcherServletAutoConfiguration;
import org.springframework.boot.webmvc.autoconfigure.DispatcherServletRegistrationBean;
import org.springframework.boot.webmvc.autoconfigure.error.ErrorMvcAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

//@SpringBootApplication
//@EnableAutoConfiguration
//@Configuration
//@ComponentScan(basePackages = "org.gfg")
@SpringBootApplication(exclude = {DispatcherServletAutoConfiguration.class, ErrorMvcAutoConfiguration.class})
public class Application implements CommandLineRunner{

	// It's going to be entry point of my spring boot application
	@Autowired
	ApplicationContext applicationContext;

	// Entry point of our spring boot application
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args); // it's setting up application
	}


	@Override
	public void run(String... args) throws Exception {
		Student student = applicationContext.getBean("student", Student.class);

		System.out.println(student);
	}

//	@Bean
//	public DispatcherServlet dispatcherServlet(){
//		DispatcherServlet servlet = new DispatcherServlet();
//		return servlet;
//	}
//
//	@Bean
//	public DispatcherServletRegistrationBean dispatcherServletRegistrationBean(){
//		DispatcherServlet dispatcherServlet = dispatcherServlet();
//
//		DispatcherServletRegistrationBean bean = new DispatcherServletRegistrationBean(dispatcherServlet,"/robin");
//
//		return bean;
//	}
}
