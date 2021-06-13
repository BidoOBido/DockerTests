package com.bido.teste;


// import com.bido.teste.repository.MockedDataRepository;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TesteApplication /*implements CommandLineRunner*/ {

	// private static final Logger log = LoggerFactory.getLogger(TesteApplication.class);

	// @Autowired()
	// private MockedDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
		
	// 	log.info("Starting application teste");

	// 	System.out.println("\nfindAll()");
	// 	repository.findAll().forEach(x -> System.out.println(x));
		
	// 	System.out.println("\nfindInconsistences()");
	// 	repository.findInconsistences().forEach(x -> System.out.println(x));
	// }

}
