package com.example.recyclerview;

public class recyclerItems {

    private String et_title,et_companyName,et_dateFrom,et_dateTo;

    public recyclerItems( String title, String companyName, String dateFrom, String dateTo)
    {
        et_title=title;
        et_companyName=companyName;
        et_dateFrom=dateFrom;
        et_dateTo=dateTo;
    }
    public String getEt_title() {
        return et_title;
    }

    public String getEt_companyName() {
        return et_companyName;
    }

    public String getEt_dateFrom() {
        return et_dateFrom;
    }

    public String getEt_dateTo() {
        return et_dateTo;
    }
}

