package Projects;
public class Book {
    //attribute
    private String nameofbook;
    private final int numofpage;
    private float price;
    public Book(int numofpage){
        this.numofpage=numofpage;
    }
    public Book(String nameofbook,int numofpage){
this.numofpage=numofpage;
this.nameofbook=nameofbook;
    }
    public Book(String nameofbook,int numofpage,float price){
        this.numofpage=numofpage;
        this.nameofbook=nameofbook;
        this.price=price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public float getPrice(){
        return price;
    }

    public void setNameofbook(String nameofbook) {
        this.nameofbook = nameofbook;
    }
    public String getNameofbook(){
        return nameofbook;
    }
    public int getNumofpage(){
        return numofpage;
    }
    public void displayinfo(){
        System.out.println("the book name is "+nameofbook);
        System.out.println("number of page is "+numofpage);
        System.out.println("price is "+price+"$");
    }
}