public class DeptBean {

    private int  Dept_id;
    private int Fac_id;
    private String Dept_Name;
    private String Remarks;

    public void setDeptId(int Dept_id){
        this.Dept_id=Dept_id;
    }

    public void setFacId(int Fac_id){
        this.Fac_id=Fac_id;
    }

    public void setDeptName(String Dept_Name){
        this.Dept_Name=Dept_Name;
    }
    public void setRemarks(String Remarks){
        this.Remarks=Remarks;
    }

    public int getDeptid(){
        return Dept_id;
    }

    public int getFacId(){
        return Fac_id;
    }

    public String getDeptName(){
        return Dept_Name;
    }
    public String getRemarks(){
        return Remarks;
    }

    public String toString(){
        return Dept_Name;
    }
    
}
