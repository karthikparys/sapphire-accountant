package ae.kbgroup.sapphire.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by karthikeyan.mani on 3/24/2017.
 */
@EnableWebMvc
@Configuration
@ComponentScan("ae.kbgroup.sapphire.web")
public class SpringWebConfig {
}
