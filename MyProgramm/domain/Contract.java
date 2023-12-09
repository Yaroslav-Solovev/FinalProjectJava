package MyProgramm.domain;

public class Contract { //** Класс представляющий договор*/
    private String id;
    private String date;
    private String counterparty;
    private String subjectOftheContract;
    private Double price;
    private String categoryContract;

    public Contract(String id, String date, String counterparty, String subjectOftheContract, Double price, String categoryContract){
        this.id = id;
        this.date = date;
        this.counterparty = counterparty;
        this.subjectOftheContract = subjectOftheContract;
        this.price = price;
        this.categoryContract = categoryContract;
    }

    public String getId(){
        return id;
    }
    public String getDate(){
        return date;
    }
    public String getСounterparty(){
        return counterparty;
    }
    public String getSubjectOftheContract(){
        return subjectOftheContract;
    }
    public Double getPrice(){
        return price;
    }
    public String getCategoryContract(){
        return categoryContract;
    }
    
    public void setId(String id){
        this.id = id; 
    }
    public void setDate(String date){
        this.date = date; 
    }
    public void setCounterparty(String counterparty){
        this.counterparty = counterparty; 
    }
     public void setSubjectOftheContract(String subjectOftheContract){
        this.subjectOftheContract = subjectOftheContract; 
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setCategoryContract(String categoryContract){
        this.categoryContract = categoryContract;
    }

    public String getInfo() {
        return String.format("ID: %s, Date: %s, Counterparty: %s, SubjectOftheContract: %s, Price: %f, CategoryContract: %s.", 
        this.id, this.date, this.counterparty, this.subjectOftheContract, this.price, this.categoryContract, this.getClass().getSimpleName());
    }
}
