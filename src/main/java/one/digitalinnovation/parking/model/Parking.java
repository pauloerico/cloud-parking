package one.digitalinnovation.parking.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Parking {
    @Id
    @NonNull
    private String id;
    @NonNull
    private String license;
    @NonNull
    private String state;
    @NonNull
    private String model;
    @NonNull
    private String color;
    private LocalDateTime entryDate;
    private LocalDateTime exitDate;
    private Double bill;
}
