package low_coupling_high_cohesion.good_example;

// This code is considered good practice, because:
// - PromotionService is an interface allowing different implementations, promoting low coupling.
// - In this case, we have SellerPromotionService and InHousePromotionService with distinct implementations.
//    - SellerPromotionService applies seller-specific promotions.
//    - InHousePromotionService applies in-house promotions.
// - Future changes specific to seller or in-house promotions can be made without affecting the other.
// - Low coupling is emphasized, ensuring changes in seller promotions do not unnecessarily affect in-house promotions, and vice versa.
// - High cohesion is maintained as all code related to promotions resides in separate classes, each handling its specific logic.
public interface PromotionService {
    void applyPromotion();
}
