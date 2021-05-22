package MHL.service;

import MHL.dao.BillDao;
import MHL.dao.MenuDao;
import MHL.dao.MultiTableBeanDao;
import MHL.domain.Bill;
import MHL.domain.MultiTableBean;

import java.util.List;
import java.util.UUID;

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
public class BillService {
    private MenuDao menuDao = new MenuDao();
    private BillDao billDao = new BillDao();
    private MenuService menuService = new MenuService();
    private DingTableService dingTableService = new DingTableService();
    private MultiTableBeanDao multiTableBeanDao = new MultiTableBeanDao();
    public boolean orderMenu(int menuId,int nums,int diningTableId){
        String billId = UUID.randomUUID().toString();
        int update = billDao.update("insert into bill values(null,?,?,?,?,?,now(),'未支付')"
                , billId, menuId, nums, menuService.getId(diningTableId).getPrice() * nums, diningTableId);
        if(update<=0){
            return false;
        }
        boolean b = dingTableService.updateDiningTable(diningTableId);
        return b;
    }
    public List<MultiTableBean> getBills(){
        List<MultiTableBean> multiTableBeans = multiTableBeanDao.queryMulti("select bill.*,name from bill,menu where bill.menuId=menu.id", MultiTableBean.class);

        return multiTableBeans;

    }
    public boolean payBills(int diningTableId,String state){
        int update = billDao.update("update bill set state=? where diningTabledId=?", state, diningTableId);
        if (update<=0){
            return false;
        }
        if (!dingTableService.updateMod(diningTableId)){
            return false;
        }
        System.out.println("结账成功");
        return true;
    }
}
