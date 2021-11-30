package net.cofares.apiEmploye.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.cofares.apiEmploye.model.Employee;
import net.cofares.apiEmploye.repository.EmployeeRepository;

import lombok.Data;

/**
 * Vous noterez avec intérêt que chaque méthode a pour unique objectif 
 * d’appeler une méthode de l'employeeRepository.
 * Un petit zoom sur l’annotation @Service : tout comme l’annotation 
 * @Repository, c’est une spécialisation de @Component. Son rôle est 
* donc le même, mais son nom a une valeur sémantique pour ceux qui 
* lisent votre code. Pour le reste, ce code devrait être à votre portée.
 */
@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

}
