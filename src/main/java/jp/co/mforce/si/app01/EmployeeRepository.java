package jp.co.mforce.si.app01;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  EmployeeRepository extends JpaRepository<Employee, Long> {
}
