package co.develhope.FirstAPI05.DTO;

import jakarta.validation.constraints.NotBlank;
import org.springframework.lang.Nullable;

public class CarDTO {
    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String modelName;
    @Nullable
    private Double price ;

    public CarDTO(String id, String modelName, Double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }
}
