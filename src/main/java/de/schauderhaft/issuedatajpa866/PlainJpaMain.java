/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.schauderhaft.issuedatajpa866;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Jens Schauder
 */
public class PlainJpaMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		Dependent dep = new Dependent();
		dep.name = "Alfred";
		dep.emp = new Employee();
		dep.emp.setEmpId(3); ;
		dep.emp.setEmpName("Jens");

		em.persist(dep.emp);
		em.persist(dep);
		em.flush();

		DependentId id = new DependentId();
		id.setEmp(3);
//		id.setName("Alfred");

		em.find(Dependent.class, id);

		factory.close();
	}
}
