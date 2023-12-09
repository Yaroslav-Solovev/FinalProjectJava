package MyProgramm.domain;

//** Класс представляющий документы, находящиеся на котроле: 1. Предписания контролирующих/надзорных органов; 
// 2. Судебное/исполнительное производство; 3. Претензионная работа; 4. Жалобы/обращения*/

public class ControlDocument { 
    private String id;
    private String title;
    private String date;
    private String categoryDocument;
    private String author;
    private String periodОfExecution;

    public ControlDocument(String id, String title, String date, String categoryDocument, String author, String periodОfExecution){
        this.id = id;
        this.title = title;
        this.date = date;
        this.categoryDocument = categoryDocument;
        this.author = author;
        this.periodОfExecution = periodОfExecution;
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
    public String getAuthor(){
        return author;
    }
    public String getPeriodОfExecution(){
        return periodОfExecution;
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
    public void setAuthor(String author){
        this.author = author; 
    }
    public void setPeriodОfExecution(String periodОfExecution){
        this.periodОfExecution = periodОfExecution; 
    }

    public String getInfo() {
        return String.format("ID: %s, Title: %s, Date: %s, CategoryDocument: %s, Author: %s, PeriodОfExecution: %s.",
        this.id, this.title, this.date, this.categoryDocument, this.author, this.periodОfExecution, this.getClass().getSimpleName());
    }
}
