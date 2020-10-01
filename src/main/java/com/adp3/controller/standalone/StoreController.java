package com.adp3.controller.standalone;

import com.adp3.entity.standalone.Store;
import com.adp3.factory.standalone.StoreFactory;
import com.adp3.service.standalone.impl.StoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Set;


/**
 * Author: Riyaad Ryklief
 * Class: Part Time
 * Student number: 215187849
 * Controller:
 * StoreController
 */

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreServiceImpl storeService;

    /* Method create StoreName
     * Parameters: store name
     * */
    @PostMapping ("/create")
    public Store create(@RequestBody Store store){
        Store newStore = StoreFactory.createStore(store.getStoreName());
        return storeService.create(newStore);
    }


    /* Method read StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @GetMapping ("/read/{storeID}")
    public Store read(@PathVariable String storeID) {
        return storeService.read(storeID);
    }


    /* Method update StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @PutMapping ("/update")
    public Store update(@RequestBody Store store) {
        return storeService.update(store);
    }


    /* Method delete StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @DeleteMapping ("/delete/{storeID}")
    public void delete(@PathVariable String storeID) {
        storeService.delete(storeID);
    }


    /* Method getAll StoreName, StoreID
     * Parameters: StoreName, StoreID
     * */
    @GetMapping ("/getAll")
    public Set<Store> getAll() {
        return storeService.getAll();
    }
}
