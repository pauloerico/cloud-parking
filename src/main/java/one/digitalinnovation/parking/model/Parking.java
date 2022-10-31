package one.digitalinnovation.parking.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Parking {
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
