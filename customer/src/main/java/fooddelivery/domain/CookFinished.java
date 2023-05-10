package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String foodId;
    private String orderId;
    private Object options;
    private String status;
    private String storeId;
    private String customerId;
}
