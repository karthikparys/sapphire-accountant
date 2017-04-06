package ae.kbgroup.sapphire.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by karthikeyan.mani on 3/24/2017.
 */
@Configuration
@Import({JPAConfig.class})
@ComponentScan("ae.kbgroup.sapphire.service")
public class SpringRootConfig {
}
