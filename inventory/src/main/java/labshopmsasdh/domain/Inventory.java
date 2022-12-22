package labshopmsasdh.domain;

import labshopmsasdh.InventoryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Inventory_table")
@Data

//<<< DDD / Aggregate Root
public class Inventory  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long stock;

    @PostPersist
    public void onPostPersist(){
    }

    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = InventoryApplication.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }



//<<< Clean Arch / Port Method
    public void decreaseStock(DecreaseStockCommand decreaseStockCommand){
    }
//>>> Clean Arch / Port Method



}
//>>> DDD / Aggregate Root
