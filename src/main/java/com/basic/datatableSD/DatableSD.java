package com.basic.datatableSD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DatableSD {
    private BookStore store;
    private List<Book> foundBooks;
    private List<Book> books;

    @Before
    public void setUp() {
        store = new BookStore();
        foundBooks = new ArrayList<>();
        System.out.println("Running before each");
    }

    @Given("^I have the following books in the store$")
    public void haveBooksInTheStoreByList(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            Book _book = new Book(columns.get("title"), columns.get("author"));
            store.addBook(_book);
        }
    }

    @When("^I search for books by author \"([^\"]*)\"$")
    public void searchBooksByAuthor(String author) {
        foundBooks = store.booksByAuthor(author);
    }

    @Then("^I find 2 book$")
    public void checkFoundBooksByAuthor() {
        Assert.assertEquals(2, foundBooks.size());
    }

}
