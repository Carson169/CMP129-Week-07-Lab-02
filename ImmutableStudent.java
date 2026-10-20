//Carson Samples
//Lab Assignment 11-B
//10.18.26
//Course CMP-129-80231
public final class ImmutableStudent 
{
    private final String name;
    private final int age;
    public ImmutableStudent(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
    public String getName() 
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
    public void displayInfo() 
    {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
