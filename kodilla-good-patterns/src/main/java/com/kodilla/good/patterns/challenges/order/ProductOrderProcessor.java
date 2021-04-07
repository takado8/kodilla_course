package com.kodilla.good.patterns.challenges.order;

public class ProductOrderProcessor {

    private final InformationService informationService;
    private final ProductOrderService productOrderService;

    public ProductOrderProcessor(final InformationService informationService,
                                 final ProductOrderService productOrderService) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
    }

    public boolean process(final Order order) {
        boolean isOrdered = productOrderService.executeOrder(order);

        if (isOrdered) {
            informationService.inform(order.getUser());
            return true;
        } else {
            return false;
        }
    }
}

