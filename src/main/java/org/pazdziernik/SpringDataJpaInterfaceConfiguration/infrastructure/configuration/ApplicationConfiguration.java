package org.pazdziernik.SpringDataJpaInterfaceConfiguration.infrastructure.configuration;

import org.pazdziernik.SpringDataJpaInterfaceConfiguration.ZajavkaStoreApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = ZajavkaStoreApplication.class)
@Import(PersistenceJPAConfiguration.class)
public class ApplicationConfiguration {
}
