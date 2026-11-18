package com.example.dbmigration.config;

import org.springframework.boot.flyway.autoconfigure.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayRepairConfig {

	// @Bean
	// FlywayMigrationStrategy repairThenMigrate() {
	// 	return flyway -> {
	// 		flyway.repair();
	// 		flyway.migrate();
	// 	};
	// }
}
