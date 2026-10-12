package Projects;
public class Author{
 //attribute
    private final String nameofdoc;
    private Book books[]=new Book[3];//array of objects i will store in it objects
    //method
    public Author(String nameofdoc){
        this.nameofdoc=nameofdoc;
    }
    public String getNameofdoc(){
        return nameofdoc;
    }
    public void Addbook(Book newbook,int index){//book but not booksss only put one book
        books[index]=newbook;

    }
    public Book searchbook(String nameofsearchedbook) {

        for (int i = 0; i < 3; i++) {
            if (books[i] != null && books[i].getNameofbook().equals(nameofsearchedbook)) {
                return books[i];

            }

        }
       return null;

    }
    public void display_book_data(){

        for(int i=0;i<3;i++){
            books[i].displayinfo();
        }
    }
}