package Question_10;
import Question_10.Faculty;
public interface Department{
    void readData(Faculty f);
    /*
        We need the faculty object, because the data it will print or read from the user are
        Defined in Faculty.java only.
    */
    void printData(Faculty f);
    /*
        Here, again we will be using the faculty objcet to print the values that are defined there.
    */
    void print_number_designations(Faculty f);
    /*
        This will print the number of designations the faculty had till date.
    */
    void number_research_consultancy_projs(Faculty f);
    /*
        This will just print the number of research consultancy projects the particular professor had.
    */
}
