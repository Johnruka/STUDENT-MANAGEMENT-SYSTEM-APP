package se.lexicon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import se.lexicon.data_access.Impl.StudentDaoListImpl;
import se.lexicon.util.ScannerInputService;

@Configuration
@ComponentScan(basePackages = "se.lexicon")
public class ComponentScanConfig {

    @Bean
    public StudentDaoListImpl StudentDao() {
        return new StudentDaoListImpl();
    }

    }

