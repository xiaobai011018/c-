package MHL.domain;

public class Employee {
    private Integer id;
    private String empid;
    private String pwd;
    private String name;
    private String job;
    public Employee() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Employee(Integer id, String empid, String pwd, String name, String job) {
        this.id = id;
        this.empid = empid;
        this.pwd = pwd;
        this.name = name;
        this.job = job;
    }
}
