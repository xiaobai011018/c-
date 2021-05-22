package MHL.domain;

import java.util.Date;

/**
 * CREATE TABLE bill(
 * 		id INT PRIMARY KEY AUTO_INCREMENT,
 * 		billId VARCHAR(50) NOT NULL DEFAULT '',
 * 		menuId INT NOT NULL DEFAULT 0,
 * 		nums INT NOT NULL DEFAULT 0,
 * 		money DOUBLE NOT NULL DEFAULT 0,
 * 		diningTabledId INT NOT NULL DEFAULT 0,
 * 		billDate  DATETIME NOT NULL ,
 * 		state VARCHAR(50) NOT NULL DEFAULT ''
 * 		)CHARSET=utf8
 */
public class Bill {
    private Integer id;
    private String billId;
    private Integer menuId;
    private Integer nums;
    private Double money;
    private Integer diningTabledId;
    private Date billDate;
    private String state;

    public Bill() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getDiningTableId() {
        return diningTabledId;
    }

    public void setDiningTableId(Integer diningTableId) {
        this.diningTabledId = diningTableId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Bill(Integer id, String billId, Integer menuId, Integer nums, Double money, Integer diningTableId, Date billDate, String state) {
        this.id = id;
        this.billId = billId;
        this.menuId = menuId;
        this.nums = nums;
        this.money = money;
        this.diningTabledId = diningTableId;
        this.billDate = billDate;
        this.state = state;
    }

    @Override
    public String toString() {
        return   id +
                "\t\t" + menuId +
                "\t\t\t" + nums +
                "\t\t" + money +
                "\t\t" + diningTabledId +
                "\t" + billDate +
                "\t\t'" + state  ;
    }
}
