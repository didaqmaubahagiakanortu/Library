package Library;

public class TextBook extends Book{
    
    public String subject;

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

    public TextBook() {
        super();
        subject = "";
    }

    public TextBook(String title, int year, double price, String subject) {
        super(title, year, price);
        this.subject = subject;
    }

    public void print() {
        super.print();
        System.out.println("Topik: " + subject);
    }
    
}
