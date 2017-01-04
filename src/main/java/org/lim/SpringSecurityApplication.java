package org.lim;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.lim.dao.EtudiantRepository;
import org.lim.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx=SpringApplication.run(SpringSecurityApplication.class, args);
		EtudiantRepository etudiantRepository =ctx.getBean(EtudiantRepository.class);
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		/*etudiantRepository.save(new Etudiant("mohamed","yazid",df.parse("2000-10-10")));
		etudiantRepository.save(new Etudiant("ali","amtar",df.parse("2000-10-10")));
		etudiantRepository.save(new Etudiant("brahim","antiq",df.parse("2000-10-10")));
		etudiantRepository.save(new Etudiant("said","hamlet",df.parse("2000-10-10"))); */
		List<Etudiant> etds=etudiantRepository.findAll();
		etds.forEach(e->System.out.println(e.getNom())); 
		
		
	}
}
