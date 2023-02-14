package itcen.mall.domain;

import itcen.mall.domain.*;
import itcen.mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productName;
    private Integer qty;

    public OrderPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
