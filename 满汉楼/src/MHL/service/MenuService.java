package MHL.service;

import MHL.dao.MenuDao;
import MHL.domain.Menu;

import java.util.List;

public class MenuService {
    private MenuDao menuDao = new MenuDao();
    public List<Menu> list (){
        return menuDao.queryMulti("select * from menu", Menu.class);
    }
    public Menu getId(int diningTableId){
        String sql = "select * from menu where id=?";
        return menuDao.querySingle(sql,Menu.class,diningTableId);
    }
}
