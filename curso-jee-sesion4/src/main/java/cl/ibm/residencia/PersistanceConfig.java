package cl.ibm.residencia;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class PersistanceConfig {

		@Bean
		public DataSource dataSource() {

			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName( "org.postgresql.Driver" );
			dataSource.setUrl( "jdbc:postgresql://localhost:5432/residentes" );
			dataSource.setUsername( "postgres" );
			dataSource.setPassword( "qwe123qwe" );
			return dataSource;

		}

		@Bean
		public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

			LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
			entityManagerFactoryBean.setDataSource( dataSource() );
			entityManagerFactoryBean.setJpaVendorAdapter( new HibernateJpaVendorAdapter() );
			entityManagerFactoryBean.setPackagesToScan( "cl.ibm" );

			Properties jpaProperties = new Properties();
			jpaProperties.put( "hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect" );
			jpaProperties.put( "hibernate.show_sql", "true" );
			jpaProperties.put( "hibernate.hbm2ddl.auto", "update" );
			jpaProperties.put( "hibernate.generateDdl", "true" );
			entityManagerFactoryBean.setJpaProperties( jpaProperties );

			return entityManagerFactoryBean;

		}

		@Bean
		public JpaTransactionManager transactionManager( EntityManagerFactory entityManagerFactory ) {

			JpaTransactionManager transactionManager = new JpaTransactionManager();
			transactionManager.setEntityManagerFactory( entityManagerFactory );
			return transactionManager;

		}
		
	}