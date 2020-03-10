package homework.epamspringboothw26;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.system.SystemProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "application.properties")
public class BillHealthIndicator implements HealthIndicator{

    @Value("${spring.application.name}")
    String application;

    @Override
    public Health health() {
        return Health.up().withDetail("application",application).build();
    }
}
