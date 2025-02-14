package com.ani.sri.traini8.training_center.Model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "trainingCenter")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenter {

    @Id
    private String id;

    @NotBlank(message = "Center Name is required")
    private String centerName;

    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center Code must be exactly 12 alphanumeric characters")
    private String centerCode;

    @Valid
    @NotNull(message = "Address is required")
    private Address address;

    @Min(value = 1, message = "Student Capacity must be at least 1")
    private int studentCapacity;

    @NotEmpty(message = "Courses Offered must not be empty")
    private List<String> coursesOffered;

    //private long createdOn;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits")
    private String contactPhone;


//    public void setCreatedOn() {
//       this.createdOn = System.currentTimeMillis();
//    }

//    @Override
//    public String toString() {
//        return "TrainingCenter{" +
//                "id='" + id + '\'' +
//                ", centerName='" + centerName + '\'' +
//                ", centerCode='" + centerCode + '\'' +
//                ", address=" + address +
//                ", studentCapacity=" + studentCapacity +
//                ", coursesOffered=" + coursesOffered +
//               // ", createdOn=" + createdOn +
//                ", contactEmail='" + contactEmail + '\'' +
//                ", contactPhone='" + contactPhone + '\'' +
//                '}';
//    }
}