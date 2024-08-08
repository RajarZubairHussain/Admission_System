public class ProgramBean {
    private int Prog_id;
    private int Dept_id;
    private String Prog_name;
    private int Duration_in_semester;
    private String Remarks;

    public void setProgid(int Prog_id){
        this.Prog_id=Prog_id;
    }
    public void setDeptid(int Dept_id){
        this.Dept_id=Dept_id;
    }
    public void setProgname(String Prog_name){
        this.Prog_name=Prog_name;
    }
    public void setDurationInSemester(int Duration_in_semester){
        this.Duration_in_semester=Duration_in_semester;
    }
    public void setRemarks(String Remarks){
        this.Remarks=Remarks;
    }


    public int getProgid(){
        return Prog_id;
    }
    public int getDeptid(){
        return Dept_id;
    }
    public String getProgname(){
        return Prog_name;
    }
    public int getDurationInSemester(){
        return Duration_in_semester;
    }
    public String Remarks(){
        return Remarks;
    }

    public String toString(){
        return Prog_name;
    }
  
}