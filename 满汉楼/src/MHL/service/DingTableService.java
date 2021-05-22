package MHL.service;

import MHL.dao.DingTableDao;
import MHL.domain.DiningTable;

import java.util.List;

public class DingTableService {
    private DingTableDao dingTableDao = new DingTableDao();
    public List<DiningTable> getIdAndState(){
        return dingTableDao.queryMulti("select id,state from diningtable", DiningTable.class);
    }
    public boolean orderDingTable(int id,String name,String tel){
//
        int update = dingTableDao.update("update diningtable set state='被预定',orderName=?,orderTel=? where id=?", name, tel, id);
        return update>0;
    }
    public boolean updateDiningTable(int diningTableId){
        String sql = "update diningtable set state = '就餐中' where id = ?";
        int update = dingTableDao.update(sql, diningTableId);
        return update>0;
    }
    public DiningTable ifEmpty(int id){
        DiningTable dingTable =
                dingTableDao.querySingle("select state from diningtable where id=?", DiningTable.class, id);
        return dingTable;
    }
    public boolean updateMod(int diningTableId){
        int update = dingTableDao.update("update diningtable set state='空',orderName='',orderTel=''where id=?", diningTableId);
        return update>0;
    }

}
