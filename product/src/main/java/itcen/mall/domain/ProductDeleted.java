package itcen.mall.domain;

import itcen.mall.domain.*;
import itcen.mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class ProductDeleted extends AbstractEvent {

    private Long id;

    public ProductDeleted(Product aggregate){
        super(aggregate);
    }
    public ProductDeleted(){
        super();
    }
}
