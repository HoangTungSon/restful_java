package source.model;

import javax.persistence.*;

@Entity
@Table(name = "blogList")
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String category;
    private String description;
    private Long id;
    private String text;
    private String author;

    public Blog(){

    }

    public Blog(String text, String author, String category, String description){
        this.category = category;
        this.description = description;
        this.text = text;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Blog[id=%d, category='%s', text='%s', author='%s', description='%s']", id, text, author);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
