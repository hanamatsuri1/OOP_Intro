package model;

public class Course {
    private int id;
    private int code;
    private String name;
    private String description;
    private int credit;

    public Course(int aid, int acode, String aname, String adescription, int acredit){  //Construct a Course object
        id=aid;
        code=acode;
        name=aname;
        description=adescription;
        credit=acredit;

    }

    public int getId() {  //return id
        return id;
    }

    public int getCode() {  //return code
        return code;
    }

    public String getName() {  //return name
        return name;
    }

    public String getDescription() {  //return description
        return description;
    }

    public int getCredit() {  //return credit
        return credit;
    }

}
