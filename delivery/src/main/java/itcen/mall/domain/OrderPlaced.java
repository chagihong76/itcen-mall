package itcen.mall.domain;

import itcen.mall.domain.*;
import itcen.mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productName;
    private Integer qty;
}


