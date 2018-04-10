package au.org.ala.cas.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.ConfigureRedisAction;

@Configuration
public class Config {

    private static final Logger logger = LoggerFactory.getLogger(Config.class);

    @ConditionalOnProperty("spring.session.disable-redis-config-action")
    @Bean
    public ConfigureRedisAction configureRedisAction() {
        logger.error("configureRedisAction()");
        return ConfigureRedisAction.NO_OP;
    }

}
