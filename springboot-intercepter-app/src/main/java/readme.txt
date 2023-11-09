		@Component:
Mark Java class as  a bean  so that component scan mechanism pick it up and pull it up
application context. 
		@Service:
Just behave like a @Component annotation (does'nt provide any addition behavour) but
but it is good to use @service at service because it clear the idea intent.
		@Repository:
Provide suitable need of Dao layer.It also make sure that un check exception thrown at dao layer
eligible to be translate into  Spring data access exception.
		@Controller:
Mark the class as spring mvc controller
		@RestController:
It is the combination of @Controller and @ResponseBody which eliminate the need to annotate every
request handling method of the class to annotate with @ResponseBody
		@Configuration:
Mark the class contain one or more bean define inside the class.This is going to be your configuration
class.
		@Bean:
is use to explicitly  declare a single bean  rather then letting spring  do it automatically for us 