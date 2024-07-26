package in.nsti.context;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
public class ConfigFile {
	
	@Bean
	public DriverManagerDataSource crud() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ibm");
		ds.setUsername("root");
		ds.setPassword("2299");
		return ds;
	}
		
	@Bean
	public JdbcTemplate jT() {
	     JdbcTemplate jt = new JdbcTemplate();
	     jt.setDataSource(crud());
		 return jt;
	}
}

