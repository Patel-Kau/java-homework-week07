package homeworkweek7;

/**
 *  Create Three fields firstName, lastName of type String and age of type int.
 *  * Create Instance methods without any parameters and return type like getFirstName, getLastName and getAge.
 *  * Create the method with one parameter's String type like setFirstName and setLastName.
 *  * Create the method with one parameter's int type like setAge. it needs to set the value of the age field. If
 *  * the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 *  * Method named isTeen without any parameters, it needs to return true if the value of the age field is
 *  * greater than 12 and less than 20, otherwise, return false.
 *  * Method named getFullName without any parameters, it needs to return the full name of the person.
 *  * In case both firstName and lastName fields are empty, Strings return an empty String.
 *  * In case firstName is an empty String, return firstName.
 *  * In case lastName is an empty String, return lastName.
 */
public class Programme_14_Person {
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Programme_14_Person person = new Programme_14_Person();
        person.setFirstName("");                                                    // firstName is set to empty string
        person.setLastName("");                                                     // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");                                                // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");                                                 // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public void getFirstName() {
        System.out.println(firstName);
        //return firstName;
    }

    public void getLastName() {
        System.out.println(lastName);
        // return lastName;
    }

    public void getAge() {
        System.out.println(age);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {

        if (age < 0 || age > 100) {
            age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            //System.out.println("true");
            return true;
        } else {
            //System.out.println("false");
            return false;
        }
    }

    public String getFullName() {
        //System.out.println(firstName + " "+ lastName);
        if (firstName.isEmpty() && lastName.isEmpty()) {

            //System.out.println(" ");
            return " ";
        } else if (firstName.isEmpty()) {
            // System.out.println(firstName);
            return lastName;
        } else if (lastName.isEmpty()) {
            // System.out.println(lastName);
            return firstName;
        } else {
            return firstName + " " + lastName;
        }

    }

}
