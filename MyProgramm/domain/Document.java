package MyProgramm.domain;

public class Document { //** Класс представляющий документ*/
    private String id;
    private String title;
    private String date;
    private String categoryDocument;

    public Document(String id, String title, String date, String categoryDocument){
        this.id = id;
        this.title = title;
        this.date = date;
        this.categoryDocument = categoryDocument;
    }

    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDate(){
        return date;
    }
    public String getCategoryDocument(){
        return categoryDocument;
    }
    
    public void setId(String id){
        this.id = id; 
    }
    public void setTitle(String title){
        this.title = title; 
    }
    public void setDate(String date){
        this.date = date; 
    }
    public void setCategoryDocument(String categoryDocument){
        this.categoryDocument = categoryDocument; 
    }

    public String getInfo() {
        return String.format("ID: %s, Title: %s, Date: %s, CategoryDocument: %s.",
        this.id, this.title, this.date, this.categoryDocument, this.getClass().getSimpleName());
    }
}
