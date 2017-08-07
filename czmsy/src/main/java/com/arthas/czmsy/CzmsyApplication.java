package com.arthas.czmsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafView;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

@SuppressWarnings("unused")
@SpringBootApplication
public class CzmsyApplication {
//springmvc template 集成方式。spring boot在查找到template.jar包的情况下会自动配置
//	@Bean
//	public TemplateResolver templateResolver(){
//		TemplateResolver templateResolver = new ServletContextTemplateResolver();
//		templateResolver.setPrefix("/WEB-INF/templates");
//		templateResolver.setSuffix(".html");
//		templateResolver.setTemplateMode("HTML5");
//		return templateResolver;
//	}
//	@Bean
//	public SpringTemplateEngine templateEngine(){
//		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//		templateEngine.setTemplateResolver(templateResolver());
//		return templateEngine;
//	}
//	@Bean
//	public ThymeleafViewResolver thymeleafViewResolver(){
//		ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
//		thymeleafViewResolver.setTemplateEngine(templateEngine());
//		thymeleafViewResolver.setViewClass(ThymeleafView.class);
//		return thymeleafViewResolver;
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(CzmsyApplication.class, args);
	}
}
