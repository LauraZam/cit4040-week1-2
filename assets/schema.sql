-- Task 4.5: Database and Table Schema & Queries
CREATE DATABASE library;
CREATE TABLE books (
                       id SERIAL PRIMARY KEY,
                       title VARCHAR(200) NOT NULL,
                       author VARCHAR(120) NOT NULL,
                       pages INTEGER,
                       available BOOLEAN DEFAULT TRUE
);
INSERT INTO books (title, author, pages, available) VALUES
    ('Clean Code', 'Robert C. Martin', 464, TRUE),
    ('The Pragmatic Programmer', 'Andrew Hunt and David Thomas', 352, TRUE),
    ('Effective Java', 'Joshua Bloch', 412, TRUE),
    ('Java: A Beginner''s Guide', 'Herbert Schildt', 728, TRUE);

SELECT * FROM books WHERE pages > 300;
SELECT title FROM books ORDER BY title ASC;