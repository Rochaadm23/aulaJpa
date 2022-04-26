package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos.silva@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim.torres@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana.maria@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();

		System.out.println("Pronto");
		em.close();
		emf.close();
		
	}

}
