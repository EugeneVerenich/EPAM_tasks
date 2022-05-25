package com.company.Library;

public class EBook extends Book{

    private String title;
    private int Id;
    private Author author;
    private int yearOfPublishing;
    private Publisher publisher;
    private String location;

    public EBook(int Id, String title, Author author, Publisher publisher, int yearOfPublishing, String location) {
        super(Id, title, author, publisher, yearOfPublishing);

        this.location = location;
    }


    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public void setId(int id) {
        Id = id;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString(){
        return "Book{"+"\nTitle: "+title+"\nAuthor:"+
                author.toString()+"\nPublishing: "+ publisher.toString()+
                "\nYear: "+ yearOfPublishing+"\nLocation: "+location+"}";
    }
}
