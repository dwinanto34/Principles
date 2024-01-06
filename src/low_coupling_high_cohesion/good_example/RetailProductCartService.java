package low_coupling_high_cohesion.good_example;

import solid.dependency_inversion.goodexample.ReportGenerator;

public class RetailProductCartService implements CartService {
    private InventoryService inventoryService;

    public RetailProductCartService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @Override
    public void addItem() {
        inventoryService.updateInventory();
        // DO SOMETHING
    }

    @Override
    public void removeItem() {
        inventoryService.updateInventory();
        // DO SOMETHING
    }
}
