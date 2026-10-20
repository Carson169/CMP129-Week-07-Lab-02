//Carson Samples
//Lab Assignment 11-B
//10.18.26
//Course CMP-129-80231
public class StudentTest 
{
    public static void main(String[] args) 
    {
        MutableStudent mutableStudent = new MutableStudent("Craig", 20);
        mutableStudent.displayInfo();
        mutableStudent.setName("Carlson");
        mutableStudent.setAge(22);
        //The same object WAS changed, it was just the internal fields that were changed
        mutableStudent.displayInfo();
        ImmutableStudent immutableStudent = new ImmutableStudent("Charles", 21);
        //The InmutableStudent object has no setter methods and it's attributes were final so it couldn't be changed using setters
        immutableStudent.displayInfo();
        ImmutableStudent immutableStudent2 = new ImmutableStudent("ScriptKiddie", 23);
        immutableStudent2.displayInfo();
        //The MutableStudent class is the mutable one because its internal state can be changed post-creation
        //ImmutableStudent is immutable because it's fields are all final and it has no setters
        //MutableStudent allwows direct modification of data with setters while ImmutableStudent locks its data permanently upon creation
    }
}
