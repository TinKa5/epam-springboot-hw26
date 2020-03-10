package homework.epamspringboothw26;

import homework.epamspringboothw26.model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    @Autowired
    BillRepository billRepository;

    public Iterable<Bill> getAll(){
        return billRepository.findAll();
    }

    public Bill getById(Integer id){
        return billRepository.findById(id).get();
    }

}
