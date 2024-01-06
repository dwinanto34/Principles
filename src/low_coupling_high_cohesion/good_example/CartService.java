package low_coupling_high_cohesion.good_example;

// This code is considered good practice, because:
// - CartService is an interface that allows actual implementations to extend it, providing flexibility for unique implementations.
// - In this case, we have DigitalCartService and RetailCartService with distinct implementations. For example:
//    - RetailCartService needs to update inventory, while DigitalCartService does not.
//    - Future changes specific to retail can be made without affecting digital.
// - Service calls can interact with the interface, avoiding the need to call concrete implementations directly.
// - Low coupling is emphasized, promoting a modular design where changes in retail do not affect digital, and vice versa.
// - High cohesion is achieved as it allows all code related to retail to reside in the same class, separate from digital logic.
public interface CartService {
    void addItem();

    void removeItem();
}

