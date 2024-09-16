package Question1.Assignment3;

public class test {
     public static void main(String[] args) {

            System.out.println("trial test book");
            Book book1=new Book("New", "Hanna", "88888", 4);
            Book book2=new Book("one", "Kebron", 8);
    
            System.out.println("The author is  " + book1.author + " " + "and the title of the book is" + book1.title + " " + " number of copies available are : " + book1.getCopiesAvailable());
            System.out.println("test memmber");
            
            Member member1=new Member("Nayher", "4");
    
            System.out.println("Member ID is  " + member1.getMemberID());
            member1.borrowBook(book2);
            System.out.println("test library");
    
            Library libraryIuea=new Library();
    
            libraryIuea.addBook(book2);
            libraryIuea.addBook(book1);
            libraryIuea.registerMember(member1);
            libraryIuea.lendBook("82522", member1.getMemberID());
    
    
    
        }
}
