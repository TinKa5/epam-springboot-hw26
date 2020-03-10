package homework.epamspringboothw26;

import homework.epamspringboothw26.model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class BillController {
    @Autowired
    BillService billService;


    @GetMapping(value = "/{id}")
    public @ResponseBody Bill get(@PathVariable Integer id){
        return billService.getById(id);
    }

    @GetMapping
    public @ResponseBody Iterable<Bill> get(){
        return billService.getAll();
    }



}
