package itcen.mall.domain;

import itcen.mall.domain.*;
import itcen.mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
