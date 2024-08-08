public class BatchBean {
    private int Batch_id;
    private int Prog_id;
    private int Batch_Year;
    private String Shift;
    private String Group_desc;
    private String Remarks;

    public void setBatchId(int Batch_id){
        this.Batch_id=Batch_id;
    }
    public void setProgid(int Prog_id){
        this.Prog_id=Prog_id;
    }
    public void setBatchYear(int Batch_Year){
        this.Batch_Year=Batch_Year;
    }
    public void setShift(String Shift){
        this.Shift=Shift;
    }
    public void setGroupDesc(String Group_desc){
        this.Group_desc=Group_desc;
    }
    public void setRemarks(String Remarks){
        this.Remarks=Remarks;
    }
    
    

    public int getBatchId(){
        return Batch_id;
    }
    public int getProgid(){
        return Prog_id;
    }
    public int getBatchYear(){
        return Batch_Year;
    }
    public String getShift(){
        return Shift;
    }
    public String getGroupDesc(){
        return Group_desc;
    }
    public String Remarks(){
        return Remarks;
    }

    public String toString(){
       return String.valueOf(Batch_Year);
    }
}
