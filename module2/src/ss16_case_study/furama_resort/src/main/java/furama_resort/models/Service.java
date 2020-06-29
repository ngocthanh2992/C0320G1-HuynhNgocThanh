package furama_resort.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service")
    private Long id;

    @Column(name = "name_service")
    private String nameService;

    @Column(name = "area")
    private Long area;

    @Column(name = "number_of_floor")
    private Long numberOfFloor;

    @Column(name = "maximum_customer")
    private Long maximumCustomer;

    @Column(name = "rental_cost")
    private String rentalCost;

    @Column(name = "isStatus")
    private boolean isStatus;

    @Column(name = "isDelete")
    private boolean isDelete;

    @OneToMany(mappedBy = "service")
    private Set<Contract> contracts;

    public Service() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public Long getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Long numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public Long getMaximumCustomer() {
        return maximumCustomer;
    }

    public void setMaximumCustomer(Long maximumCustomer) {
        this.maximumCustomer = maximumCustomer;
    }

    public String getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public void setStatus(boolean status) {
        isStatus = status;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
