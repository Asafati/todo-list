module TodoApp {
    requires spring.context;
    requires spring.beans;
    requires java.sql;

    opens todoapp;
    opens todoapp.config;
    opens repositories;
    opens services;
    opens views;
}
