package com.shustanov.rsdemo.web.book;

import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.screen.MasterDetailScreen;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.shustanov.rsdemo.entity.Book;

@UiController("rs$Book.browse")
@UiDescriptor("book-browse.xml")
@LookupComponent("table")
public class BookBrowse extends MasterDetailScreen<Book> {
}