package MHL.View;
import MHL.domain.*;
import MHL.service.BillService;
import MHL.service.DingTableService;
import MHL.service.EmpoyeeService;
import MHL.service.MenuService;

import java.util.List;
import java.util.Scanner;
public class MhlView {
    private MenuService menuService = new MenuService();
    private DingTableService dingTableService = new DingTableService();
    private EmpoyeeService empoyeeService = new EmpoyeeService();
    private BillService billService = new BillService();
    public static void main(String[] args) { new MhlView().mainView(); }
    public void showBill(){
        List<MultiTableBean> bills = billService.getBills();
        System.out.println("编号\t\t菜品号\t\t菜品量\t金额\t\t\t桌号\t\t\t日期\t\t\t\t\t状态\t\t菜单");
        for (MultiTableBean bill : bills) {
            System.out.println(bill);
        }
    }
    public void payBill(){
        System.out.println("======结账服务======");
        System.out.print("请选择你要结账的餐桌号(-1退出)");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==-1){
            return;
        }
        DiningTable diningTable = dingTableService.ifEmpty(i);
        if (diningTable==null){
            return;
        }
        System.out.print("结账方式(现金/微信/支付宝):");
        scanner.nextLine();
        String state = scanner.nextLine();
        System.out.print("确认是否结账(Y/N):");
        char s = scanner.next().charAt(0);
        if (s== 'Y'){
            boolean b = billService.payBills(i, state);
            System.out.println("结账成功");
        }else {
            return;
        }
    }
    public void showMenu(){
        List<Menu> list = menuService.list();
        System.out.println("菜品编号\t\t菜品名\t\t类别\t\t价格");
        for (Menu menu : list) {
            System.out.println(menu);
        }
    }
    public void orderMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======点餐服务======");
        System.out.print("请选择点餐桌号(-1退出):");
        int diningTableId = scanner.nextInt();
        if (diningTableId==-1){
            System.out.println("退出成功");
            return;
        }
        System.out.print("请选择菜品桌号(-1退出):");
        int menuId = scanner.nextInt();
        if (menuId==-1){
            System.out.println("退出成功");
            return;
        }
        System.out.print("请选择菜品数量(-1退出):");
        int nums = scanner.nextInt();
        if (nums==-1){
            System.out.println("退出成功");
            return;
        }
        if (dingTableService.ifEmpty(diningTableId)==null){
            System.out.println("餐桌不存在");
            return;
        }
        if (menuService.getId(diningTableId)==null){
            System.out.println("菜品不存在");
            return;
        }
        billService.orderMenu(menuId,nums,diningTableId);
        System.out.println("======点餐成功======");
    }
    public void tableNum(){
        List<DiningTable> list = dingTableService.getIdAndState();
        System.out.println("\n餐桌编号\t\t餐桌状态");
        for (DiningTable dingTable:list) {
            System.out.println(dingTable);
        }
    }
    public void orderTable() {
        System.out.print("请输入你要预定的餐桌号(-1表示退出):");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        if (id == -1) {
            System.out.println("======退出预定======");
            return;
        }
        if (dingTableService.ifEmpty(id)==null){
            System.out.println("餐桌不存在");
            return;
        }
        System.out.print("请确认是否预定(Y/N):");
        char a = scanner.next().charAt(0);
        if (a == 'Y') {
            if (!("空".equals(dingTableService.ifEmpty(id).getState()))) {
                System.out.println("该餐桌已被预定或者正在就就餐中");
                return;
            }
            scanner.nextLine();
            System.out.print("请输入预定人的姓名:");
            String orderName = scanner.nextLine();
            System.out.print("请输入预定人电话:");
            String orderTel = scanner.next();
            boolean b = dingTableService.orderDingTable(id, orderName, orderTel);
            if (b) {
                System.out.println("预定成功");
            }
        } else {
            System.out.println("退出预定");
            return;
        }
    }
    public void mainView() {

        Boolean loop = true;
        while (loop) {
            System.out.println("======1.登录满汉楼======");
            System.out.println("======2.退出满汉楼======");
            System.out.print("请输入你的选择:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.print("请输入员工号:");
                    String id = scanner.nextLine();
                    System.out.print("请输入密  码:");
                    String password = scanner.nextLine();
                    Employee employee = empoyeeService.getEmployeeIdAndPwd(id, password);
                    if (employee!=null) {
                        System.out.println("登录成功!");
                        while (loop) {
                            System.out.println("======满汉楼二级菜单["+employee.getName()+"]======");
                            System.out.println("1.显示餐桌状态");
                            System.out.println("2.预定餐桌");
                            System.out.println("3.显示所有菜品");
                            System.out.println("4.点餐服务");
                            System.out.println("5.查看账单");
                            System.out.println("6.结账");
                            System.out.println("7.退出满汉楼");
                            System.out.print("请输入你的选择:");
                            input = scanner.nextLine();
                            switch (input) {
                                case "1":
                                    tableNum();
                                    break;
                                case "2":
                                    orderTable();
                                    break;
                                case "3":
                                    showMenu();
                                    break;
                                case "4":
                                    orderMenu();
                                    break;
                                case "5":
                                    showBill();
                                    break;
                                case "6":
                                    payBill();
                                    break;
                                case "7":
                                    loop = false;
                                    System.out.println("退出成功");
                                    break;
                                default:
                                    System.out.println("输入有误，请重新输入！");
                            }
                        }
                    }else{
                        System.out.println("密码或员工号输入错误!");
                        break;
                    }

                case "2":
                    loop = false;
                    System.out.println("退出成功");
                    break;
                default:
                    System.out.println("输入有误,请重新输入!");
            }
        }
    }
}
