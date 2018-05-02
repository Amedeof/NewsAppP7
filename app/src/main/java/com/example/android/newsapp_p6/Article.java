package com.example.android.newsapp_p6;

public class Article {

    /* Title of the article */
    private String mTitle;
    /* Web url of the article */
    private String mAuthor;
    /* Section of the article */
    private String mUrl;
    /* Section of the article */
    private String mSection;
    /* Publication time of the article */
    private String mPublicationDate;




    /* constructor of Article */

    public Article(String title, String section, String publicationDate, String url, String author) {
        mTitle = title;
        mUrl = url;
        mSection = section;
        mPublicationDate = publicationDate;
        mAuthor = author;

    }

    /* getter methods for Title */

    public String getTitle() {
        return mTitle;
    }
    /* getter methods for Section */

    public String getSection() {
        return mSection;
    }

    /* getter methods for Url */

    public String getUrl() {
        return mUrl;
    }

    /* getter methods for Author */
    public String getAuthor() {
        return mAuthor;
    }


    /* getter methods for Date */

    public String getPublicationDate() {
        return mPublicationDate;
    }
}
