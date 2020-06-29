package furama_resort.models;

import javax.persistence.*;

@Entity
@Table(name = "contract_details")
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract_detail")
    private Long id;

    @Column(name = "accompany_service")
    private String accompanyService;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "price")
    private Long price;

    @ManyToOne
    @JoinColumn(name = "id_contract",nullable = false)
    private Contract contract;

    @Column(name = "isDelete")
    private boolean isDelete;

    public ContractDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccompanyService() {
        return accompanyService;
    }

    public void setAccompanyService(String accompanyService) {
        this.accompanyService = accompanyService;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }
}
