/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examplearrayobj;

/**
 *array of objects - Student class - encapsulation 
 * @author gen3r
 * *version 1
 */
public class ExampleArrayObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int [] list = new int[3] this is a array for primitive type, this will not work for objects
        
        Student[] list = new Student[3]; //aray of objects / array of object of Student class
        Student s1 = new Student();
        s1.setName("burh");
        s1.setAge(23);
        
        
       Student s2 = new Student();
       s2.setName("uwu");
       s2.setAge(189);
       //save objects in array
       
       
       list [0] = s1;
       list [1] = s2;
       
       
       
       
       for(int i = 0; i <2; i++){
           
//           System.out.println(list[i]);
           //this will print out the address in the array 
           System.out.println(list[i].getName() +": " + list[i].getAge());
           //to solve that we do the dot(.) notation and reference the getters to be printed
       }
       
       
       
       
       
    }
    
}
