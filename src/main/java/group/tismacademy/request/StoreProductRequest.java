package group.tismacademy.request;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class StoreProductRequest {
    @NotEmpty(message = "Name required.")
    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 length.")
    private String name;

    @NotNull(message = "Quantity required")
    @Min(value = 1, message = "Quantity must be at least 1.")
    private int quantity;

    @NotNull(message = "Price required")
    @Min(value = 1, message = "Price must be at least 1")
    private double price;

    @NotNull(message = "Category required")
    @Min(value = 1, message = "Category required")
    private int category;
}