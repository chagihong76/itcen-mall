package itcen.mall.domain;

import itcen.mall.domain.ProductDeleted;
import itcen.mall.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Product_table")
@Data

public class Product  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        ProductDeleted productDeleted = new ProductDeleted(this);
        productDeleted.publishAfterCommit();

    }

    public static ProductRepository repository(){
        ProductRepository productRepository = ProductApplication.applicationContext.getBean(ProductRepository.class);
        return productRepository;
    }




    public static void productDeleted(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Product product = new Product();
        repository().save(product);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(product->{
            
            product // do something
            repository().save(product);


         });
        */

        
    }


}
