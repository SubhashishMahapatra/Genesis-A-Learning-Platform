package models;


public class library {

    private final String _id;
    private final String _subject;
    private final String _student;
    private final String _course;
    private final String _branch;
    private final String _semester;
    private final String _section;
    private final String _day;
    private final String _time;
    private final String _date;

    public String getId() {
        return _id;
    }
    
    public String getSubject() {
        return _subject;
    }

    public String getStudent() {
        return _student;
    }

    public String getCourse() {
        return _course;
    }

    public String getBranch() {
        return _branch;
    }

    public String getSemester() {
        return _semester;
    }

    public String getSection() {
        return _section;
    }

    public String getDay() {
        return _day;
    }

    public String getTime() {
        return _time;
    }

    public String getDate() {
        return _date;
    }

    public library(String _id, String _subject, String _student, 
            String _course, String _branch, String _semester, 
            String _section, String _day, String _time, String _date) {
        this._id = _id;
        this._subject = _subject;
        this._student = _student;
        this._course = _course;
        this._branch = _branch;
        this._semester = _semester;
        this._section = _section;
        this._day = _day;
        this._time = _time;
        this._date = _date;
    }
}
