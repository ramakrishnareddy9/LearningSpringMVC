package com.springmvc.Config;

import java.util.Properties;

import javax.sql.DataSource;

import com.springmvc.Entities.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DBConfig {

    @Bean
    public DataSource dataSource() {
        var ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springmvc");
        ds.setUsername("root");
        ds.setPassword("9014923870@Drkr");
        return ds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        var factory = new LocalSessionFactoryBean();
        factory.setDataSource(dataSource());

        Properties props = new Properties();
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.format_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "update");

        factory.setHibernateProperties(props);
        factory.setAnnotatedClasses(User.class); // add more if needed
        return factory;
    }

    @Bean
    public HibernateTemplate hibernateTemplate() {
        return new HibernateTemplate(sessionFactory().getObject());
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        var tx = new HibernateTransactionManager();
        tx.setSessionFactory(sessionFactory().getObject());
        return tx;
    }
}
