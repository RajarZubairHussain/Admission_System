public class FacultyBean {

    private int Fac_id;
    private String Fac_name;
    private String Remarks;

    public void setFacId(int Fac_id){
        this.Fac_id=Fac_id;
    }

    public void setFacName(String Fac_name){
        this.Fac_name=Fac_name;
    }

    public void setRemarks(String Remarks){
        this.Remarks=Remarks;
    }

    public int getFacId(){
        return Fac_id;
    }

    public String getFacName(){
        return Fac_name;
    }

    public String getRemarks(){
        return Remarks;
    }
    public String toString(){
        return Fac_name;
    }
    
}
