package homework.epamspringboothw26;

import homework.epamspringboothw26.model.Bill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BillRepository extends PagingAndSortingRepository<Bill, Integer> {
}
