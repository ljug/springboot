package net.cofares.apiEmploye.repository;


import net.cofares.apiEmploye.model.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository est une annotation Spring pour indiquer que la classe est un bean, 
//et que son rôle est de communiquer avec une source de données 
//(en l'occurrence la base de données).
/*
 * En réalité, @Repository est une spécialisation de @Component. 
 * Tout comme @Component, elle permet de déclarer auprès de 
 * Spring qu’une classe est un bean à exploiter. Par son nom, 
 * on fournit au développeur une indication sémantique sur le rôle 
 * de la classe. Vous pourriez cependant utiliser l’annotation @Component, 
 * et cela fonctionnerait très bien, mais il est recommandé d’utiliser les 
 * annotations qui offrent cette valeur sémantique supplémentaire.
 * 
 * CrudRepository est une interface fournie par Spring. Elle fournit 
 * des méthodes pour manipuler votre entité. Elle utilise la généricité 
 * pour que son code soit applicable à n’importe quelle entité, d’où 
 * la syntaxe “CrudRepository<Employee, Long>”
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

