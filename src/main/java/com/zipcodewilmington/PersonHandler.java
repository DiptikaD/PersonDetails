package com.zipcodewilmington;

import com.sun.jdi.StringReference;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        Person person1 = new Person("Leon", "Hunter");
        Person person2 = new Person("Tariq", "Hook");
        Person person3 = new Person("Dolio", "Durant");
        Person[] personArray = {person1, person2, person3};
        PersonHandler personHandler = new PersonHandler(personArray);
        int counter = 0;
        StringBuilder myNameIs = new StringBuilder();
        while (counter < personHandler.personArray.length){
            myNameIs.append(personArray[counter]);
            counter++;
        }
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return myNameIs.toString();
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        Person person1 = new Person("Leon", "Hunter");
        Person person2 = new Person("Tariq", "Hook");
        Person person3 = new Person("Dolio", "Durant");
        Person[] personArray = {person1, person2, person3};
        PersonHandler personHandler = new PersonHandler(personArray);
        StringBuilder myNameIs = new StringBuilder();

        for (int counter = 0; counter < personHandler.personArray.length; counter++){
        myNameIs.append(personArray[counter]);
        }

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return myNameIs.toString();
    }



    public String forEachLoop() {
        String result = "";
        Person person1 = new Person("Leon", "Hunter");
        Person person2 = new Person("Tariq", "Hook");
        Person person3 = new Person("Dolio", "Durant");
        Person[] personArray = {person1, person2, person3};
        PersonHandler personHandler = new PersonHandler(personArray);
        StringBuilder myNameIs = new StringBuilder();
        int counter = 0;

        for (Person firstName : personArray){
            myNameIs.append(personArray[counter]);
            counter++;
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return myNameIs.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
