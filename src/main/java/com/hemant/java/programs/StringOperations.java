package com.hemant.java.programs;

public class StringOperations {
    
    public void reverseString(String str){
        System.out.println("String Given is : " + str);
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println("Reversed String : " +sb);
        sb = new StringBuilder(str);
        sb.reverse();

        System.out.println("Reversed String : " +sb);

    }

    public static void main(String[] args) {
        StringOperations operations = new StringOperations();
        operations.reverseString("Hemant");
    }
}
